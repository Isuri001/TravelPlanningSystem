package lk.ijse.gdse63.nexttravel.service.impl;


import lk.ijse.gdse63.nexttravel.Exception.SaveFailException;
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