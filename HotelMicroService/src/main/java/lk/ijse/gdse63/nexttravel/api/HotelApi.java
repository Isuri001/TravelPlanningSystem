package lk.ijse.gdse63.nexttravel.api;

import lk.ijse.gdse63.nexttravel.dto.HotelDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hotel")
@CrossOrigin
public class HotelApi {
    @GetMapping(value = "/{id:\\d+}")
    public ResponseEntity search(@PathVariable String id){
        System.out.println("Search pressed :" +id );
        return new ResponseEntity("Search Pressed"+ id , HttpStatus.OK);
    }
    @PostMapping
    public void save(@RequestBody HotelDTO hotelDTO){
        System.out.println("Save pressed :" + hotelDTO );
    }
    @PutMapping
    public void update(@RequestBody HotelDTO hotelDTO){
        System.out.println("Update pressed :" + hotelDTO);
    }
    @DeleteMapping(value = "/{id:\\d+}")
    public void delete(@PathVariable int id){
        System.out.println("Delete pressed : " + id);
    }
}
