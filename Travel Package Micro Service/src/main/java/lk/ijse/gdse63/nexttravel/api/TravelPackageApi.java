package lk.ijse.gdse63.nexttravel.api;

import lk.ijse.gdse63.nexttravel.dto.TravelPackageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/travel-package")
public class TravelPackageApi {
    TravelPackageService service;
    public TravelPackageApi(TravelPackageService service){
        this.service = service;
    }
    @PostMapping
    public ResponseEntity save(@RequestBody TravelPackageDTO obj){
        String save = null;
        try {
            save = service.save(obj);
            return ResponseEntity.ok(save);
        } catch (SaveFailException e) {
            return new ResponseEntity("Operation Fail", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/{id:^NEXT-\\d{4}$}")
    public ResponseEntity get(@PathVariable String id){
        try {
            TravelPackageDTO travelPackageDTO = service.fidById(id);
            return ResponseEntity.ok(travelPackageDTO);
        }catch (NotFoundException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{category:^REGULAR|MID-LEVEL|LUXURY|SUPER LUXURY$}")
    public ResponseEntity getByCategory(@PathVariable String category){
        try {
            List<TravelPackageDTO> list  = service.findByCategory(category);
            return ResponseEntity.ok(list);
        } catch (NotFoundException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping
    public ResponseEntity update(@RequestBody TravelPackageDTO obj){
        try {
            service.update(obj);
            return ResponseEntity.ok().build();
        } catch (UpdateFailException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

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
