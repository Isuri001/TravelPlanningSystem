package lk.ijse.gdse63.nexttravel.service.impl;


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
                              ModelMapper modelMapper, Gson gsonr) {
        this.driverRepo = driverRepo;
        this.vehicleRepo = vehicleRepo;
        this.modelMapper = modelMapper;
        this.gson = gsonr;

    }
