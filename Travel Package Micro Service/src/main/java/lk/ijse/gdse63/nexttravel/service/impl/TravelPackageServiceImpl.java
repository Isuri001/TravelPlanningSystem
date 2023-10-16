package lk.ijse.gdse63.nexttravel.service.impl;

import lk.ijse.gdse63.nexttravel.repo.TravelPackageRepo;
import lk.ijse.gdse63.nexttravel.service.TravelPackageService;
import org.springframework.stereotype.Service;

@Service
public class TravelPackageServiceImpl implements TravelPackageService {

    private final TravelPackageRepo travelPackageRepository;

    public TravelPackageServiceImpl(TravelPackageRepo travelPackageRepository){
        this.travelPackageRepository = travelPackageRepository;
    }


}
