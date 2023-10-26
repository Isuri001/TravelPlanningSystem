package lk.ijse.gdse63.nexttravel.service.impl;


import lk.ijse.gdse63.nexttravel.Exception.DeleteFailException;
import lk.ijse.gdse63.nexttravel.Exception.NotFoundException;
import lk.ijse.gdse63.nexttravel.Exception.SaveFailException;
import lk.ijse.gdse63.nexttravel.Exception.UpdatefailException;
import lk.ijse.gdse63.nexttravel.dto.DriverDTO;
import lk.ijse.gdse63.nexttravel.dto.VehicleDTO;
import lk.ijse.gdse63.nexttravel.entity.Driver;
import lk.ijse.gdse63.nexttravel.entity.Vehicle;
import lk.ijse.gdse63.nexttravel.repo.DriverRepo;
import lk.ijse.gdse63.nexttravel.repo.VehicleRepo;
import lk.ijse.gdse63.nexttravel.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class VehicleServiceIMPL implements VehicleService {
    DriverRepo driverRepo;
    ModelMapper modelMapper;
    Gson gson;
    VehicleRepo vehicleRepo;
    public VehicleServiceIMPL(DriverRepo driverRepo, VehicleRepo vehicleRepo,
                              ModelMapper modelMapper, Gson gson) {
        this.driverRepo = driverRepo;
        this.vehicleRepo = vehicleRepo;
        this.modelMapper = modelMapper;
        this.gson = gsonr;

    }

    @Override
    public int saveVehicle(VehicleDTO dto) throws SaveFailException {
        try {
            Vehicle vehicle = modelMapper.map(dto, Vehicle.class);
            Driver driver = modelMapper.map(dto.getDriverDTO(), Driver.class);
            exportImages(dto,driver,vehicle);
            Driver save = driverRepo.save(driver);
            vehicle.setDriver(save);
            return vehicleRepo.save(vehicle).getId();
        }catch (Exception e){
            throw new SaveFailException("Save Fail ",e);
        }

    }

    @Override
    public VehicleDTO searchVehicle(int id) throws NotFoundException {
        try {
            Optional<Vehicle> byId = vehicleRepo.findById(id);
            if (byId.isPresent()){
                VehicleDTO vehicle = modelMapper.map(byId.get(), VehicleDTO.class);
                DriverDTO driver = modelMapper.map(byId.get().getDriver(), DriverDTO.class);
                vehicle.setDriverDTO(driver);
                importImages(vehicle,byId.get().getDriver(),byId.get());
                return vehicle;
            }else {
                throw new NotFoundException("Vehicle Not Found");
            }
        } catch ( Exception e ) {
            throw new NotFoundException("Vehicle Not Found",e);
        }
    }

    @Override
    public List<VehicleDTO> searchByCategory(String category) throws NotFoundException {
        ArrayList<VehicleDTO> objects = new ArrayList<>();
        try {
            List<Vehicle> byCategory = vehicleRepo.findByCategory(category);
            for (Vehicle vehicle : byCategory) {
                VehicleDTO vehicleDTO = modelMapper.map(vehicle, VehicleDTO.class);
                DriverDTO driverDTO = modelMapper.map(vehicle.getDriver(), DriverDTO.class);
                vehicleDTO.setDriverDTO(driverDTO);
                importImages(vehicleDTO,vehicle.getDriver(),vehicle);
                objects.add(vehicleDTO);
            }
            return objects;
        }catch (Exception e){
            throw new NotFoundException("Vehicles Not Found",e);
        }
    }

    @Override
    public void updateVehicle(VehicleDTO dto) throws UpdatefailException {
        try {
            Vehicle vehicle = modelMapper.map(dto, Vehicle.class);
            Driver driver = modelMapper.map(dto.getDriverDTO(), Driver.class);
            Optional<Driver> byId = driverRepo.findById(driver.getId());
            if (byId.isPresent()){
                deleteImages(byId);
                exportImages(dto,driver,vehicle);
                Driver save = driverRepo.save(driver);
                vehicle.setDriver(save);
                vehicleRepo.save(vehicle);
            }

        }catch (Exception e){
            e.printStackTrace();
            throw new UpdatefailException("Update Fail",e);
        }
    }

    @Override
    public void deleteVehicle(int id) throws NotFoundException, DeleteFailException {
        try {
            Optional<Driver> byId = driverRepo.findById(id);
            if (byId.isPresent()){
                deleteImages(byId);
                vehicleRepo.deleteById(id);
            }else {
                throw new NotFoundException("Vehicle Not Found");
            }
        }catch (Exception e){
            throw new DeleteFailException("Delete Fail",e);
        }
    }

    private void deleteImages(Optional<Driver> byId) {
        if (byId.isPresent()){
            if (byId.get().getLicenseImageFront() != null) {
                File file = new File(byId.get().getLicenseImageFront());
                boolean delete = file.delete();
                System.out.println("Front " + delete);
            }
            if (byId.get().getLicenseImageRear() != null) {
                File file = new File(byId.get().getLicenseImageRear());
                boolean delete = file.delete();
                System.out.println("Rear " + delete);
            }
            if (byId.isPresent()){
                Driver driver = byId.get();
                String images = driver.getVehicle().getImages();
                if (images != null){
                    ArrayList<String> pathList = gson.fromJson(images, new TypeToken<ArrayList<String>>(){}.getType());
                    for (String path : pathList) {
                        File file = new File(path);
                        boolean delete = file.delete();
                        System.out.println("Images " + delete);
                    }
                }
            }
        }
    }
