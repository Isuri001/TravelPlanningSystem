package lk.ijse.gdse63.nexttravel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelPackage extends SuperEntity{
    @Id
    private String id;
    private int hotelCount;
    private int areaCount;
    private double estimatedPrice;
    private String category;
    private int dayCount;
}
