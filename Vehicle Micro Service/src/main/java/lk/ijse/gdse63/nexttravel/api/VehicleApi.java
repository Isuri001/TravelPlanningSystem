package lk.ijse.gdse63.nexttravel.api;

import lk.ijse.gdse63.nexttravel.dto.VehicleDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vehicle")
@CrossOrigin
public class VehicleApi {
    @GetMapping(value = "/{id:\\d+}")
    public ResponseEntity search(@PathVariable String id){
        System.out.println("Search pressed :" +id );
        return new ResponseEntity("Search Pressed"+ id , HttpStatus.OK);
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
