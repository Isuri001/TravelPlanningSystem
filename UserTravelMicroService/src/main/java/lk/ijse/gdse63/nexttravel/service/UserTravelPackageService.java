package lk.ijse.gdse63.nexttravel.service;

import lk.ijse.gdse63.nexttravel.dto.UserTravelPackageDTO;
import lk.ijse.gdse63.nexttravel.exception.SaveFailException;
import org.springframework.stereotype.Service;


public interface UserTravelPackageService {
    int save(UserTravelPackageDTO ob) throws SaveFailException;

}
