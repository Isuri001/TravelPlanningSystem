package lk.ijse.gdse63.nexttravel.service.impl;


import lk.ijse.gdse63.nexttravel.repo.HotelRepo;
import lk.ijse.gdse63.nexttravel.service.HotelService;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepository;

    public HotelServiceImpl(HotelRepo hotelRepository){
        this.hotelRepository = hotelRepository;
    }


}
