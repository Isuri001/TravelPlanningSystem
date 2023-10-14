package lk.ijse.gdse63.nexttravel.api;

import lk.ijse.gdse63.nexttravel.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class UserApi {
    @GetMapping(value = "/{id:\\d+}")

    public ResponseEntity search(@PathVariable String id){
        System.out.println("Search Pressed" + id);
        return new ResponseEntity("Search Pressed" + id, HttpStatus.OK);
    }

    @PostMapping
    public void save(@RequestBody UserDTO userDTO){
        System.out.println("Save pressed :" + userDTO );
    }
    @PutMapping
    public void update(@RequestBody UserDTO userDTO){
        System.out.println("Update pressed :" + userDTO);
    }
    @DeleteMapping(value = "/{id:\\d+}")
    public void delete(@PathVariable int id){
        System.out.println("Delete pressed : " + id);
    }

}
