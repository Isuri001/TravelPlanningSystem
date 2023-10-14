package lk.ijse.gdse63.nexttravel.service.impl;


import lk.ijse.gdse63.nexttravel.repo.GuideRepo;
import lk.ijse.gdse63.nexttravel.service.GuideService;
import org.springframework.stereotype.Service;

@Service
public class GuideServiceImpl implements GuideService {

    private final GuideRepo guideRepository;

    public GuideServiceImpl(GuideRepo guideRepository){
        this.guideRepository = guideRepository;
    }


}
