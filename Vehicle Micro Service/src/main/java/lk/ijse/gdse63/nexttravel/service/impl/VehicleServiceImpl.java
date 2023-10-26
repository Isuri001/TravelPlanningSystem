package lk.ijse.gdse63.nexttravel.service.impl;


import lk.ijse.gdse63.nexttravel.Exception.NotFoundException;
import lk.ijse.gdse63.nexttravel.Exception.SaveFailException;
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
