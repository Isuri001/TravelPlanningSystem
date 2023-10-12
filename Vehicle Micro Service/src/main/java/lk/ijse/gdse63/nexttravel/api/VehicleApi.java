package lk.ijse.gdse63.nexttravel.api;

import lk.ijse.gdse63.nexttravel.dto.VehicleDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vehicle")
@CrossOrigin
public class VehicleApi {
    @GetMapping(value = "/{id:\\d+}")
    public void search(@PathVariable String id){
        System.out.println("Search pressed :" +id );
    }
    @PostMapping
    public void save(@RequestBody VehicleDTO vehicleDTO){
        System.out.println("Save pressed :" + vehicleDTO );
    }
    @PutMapping
    public void update(@RequestBody VehicleDTO vehicleDTO){
        System.out.println("Update pressed :" + vehicleDTO);
    }
    @DeleteMapping(value = "/{id:\\d+}")
    public void delete(@PathVariable int id){
        System.out.println("Delete pressed : " + id);
    }
}
