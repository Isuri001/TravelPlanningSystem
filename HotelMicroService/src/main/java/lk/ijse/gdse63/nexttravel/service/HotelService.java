package lk.ijse.gdse63.nexttravel.service;

import lk.ijse.gdse63.nexttravel.dto.HotelDTO;
import lk.ijse.gdse63.nexttravel.exception.DeleteFailException;
import lk.ijse.gdse63.nexttravel.exception.NotFoundException;
import lk.ijse.gdse63.nexttravel.exception.SaveFailException;
import lk.ijse.gdse63.nexttravel.exception.UpdateFailException;

import java.util.List;

public interface HotelService {
    int save(HotelDTO hotelDTO) throws SaveFailException;
    void update(HotelDTO hotelDTO) throws UpdateFailException;
    void delete(int id) throws DeleteFailException, NotFoundException;
    HotelDTO search(int id) throws NotFoundException;
    List<HotelDTO> findByStarRate(int id) throws NotFoundException;
}
