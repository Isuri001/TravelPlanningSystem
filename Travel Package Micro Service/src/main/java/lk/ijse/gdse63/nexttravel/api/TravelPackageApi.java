package lk.ijse.gdse63.nexttravel.api;

import lk.ijse.gdse63.nexttravel.dto.TravelPackageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/travel")
@CrossOrigin
public class TravelPackageApi {
    @GetMapping(value = "/{id:\\d+}")
    public ResponseEntity search(@PathVariable String id){
        System.out.println("Search pressed :" +id );
        return new ResponseEntity("Search Pressed"+ id , HttpStatus.OK);
    }
    @PostMapping
    public void save(@RequestBody TravelPackageDTO travelPackageDTO){
        System.out.println("Save pressed :" + travelPackageDTO );
    }
    @PutMapping
    public void update(@RequestBody TravelPackageDTO travelPackageDTO){
        System.out.println("Update pressed :" + travelPackageDTO);
    }
    @DeleteMapping(value = "/{id:\\d+}")
    public void delete(@PathVariable int id){
        System.out.println("Delete pressed : " + id);
    }
}
