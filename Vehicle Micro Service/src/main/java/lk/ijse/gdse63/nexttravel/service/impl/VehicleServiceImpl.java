package lk.ijse.gdse63.nexttravel.service.impl;


import lk.ijse.gdse63.nexttravel.repo.VehicleRepo;
import lk.ijse.gdse63.nexttravel.service.VehicleService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo vehicleRepository;

    public VehicleServiceImpl(VehicleRepo vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }


}
