package lk.ijse.gdse63.nexttravel.api;

import lk.ijse.gdse63.nexttravel.dto.GuideDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/guide")
@CrossOrigin
public class GuideApi {
    @GetMapping(value = "/{id:\\d+}")
    public ResponseEntity search(@PathVariable String id){
        System.out.println("Search pressed :" +id );
        return new ResponseEntity("Search Pressed"+ id , HttpStatus.OK);
    }
    @PostMapping
    public void save(@RequestBody GuideDTO guideDTO){
        System.out.println("Save pressed :" + guideDTO );
    }
    @PutMapping
    public void update(@RequestBody GuideDTO guideDTO){
        System.out.println("Update pressed :" + guideDTO);
    }
    @DeleteMapping(value = "/{id:\\d+}")
    public void delete(@PathVariable int id){
        System.out.println("Delete pressed : " + id);
    }
}
