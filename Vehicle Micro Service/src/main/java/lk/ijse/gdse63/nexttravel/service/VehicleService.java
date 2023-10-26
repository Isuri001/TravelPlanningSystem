package lk.ijse.gdse63.nexttravel.service;

import lk.ijse.gdse63.nexttravel.Exception.DeleteFailException;
import lk.ijse.gdse63.nexttravel.Exception.NotFoundException;
import lk.ijse.gdse63.nexttravel.Exception.SaveFailException;
import lk.ijse.gdse63.nexttravel.Exception.UpdatefailException;
import lk.ijse.gdse63.nexttravel.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    int saveVehicle(VehicleDTO dto) throws SaveFailException;

    VehicleDTO searchVehicle(int id) throws NotFoundException;

    List<VehicleDTO> searchByCategory(String category) throws NotFoundException;

    void updateVehicle(VehicleDTO dto) throws UpdatefailException;

    void deleteVehicle(int id) throws NotFoundException, DeleteFailException;

}
