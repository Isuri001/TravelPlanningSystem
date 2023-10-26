package lk.ijse.gdse63.nexttravel.service;

import lk.ijse.gdse63.nexttravel.dto.GuideDTO;
import lk.ijse.gdse63.nexttravel.exception.DeleteFailException;
import lk.ijse.gdse63.nexttravel.exception.SaveFailException;
import lk.ijse.gdse63.nexttravel.exception.SearchFailException;
import lk.ijse.gdse63.nexttravel.exception.UpdateFailException;

public interface GuidService {
    int saveGuide(GuideDTO guideDTO) throws SaveFailException;
    void updateGuide(GuideDTO guideDTO) throws UpdateFailException;
    void deleteGuide(int id) throws DeleteFailException;
    GuideDTO getGuide(int id) throws SearchFailException;
}
