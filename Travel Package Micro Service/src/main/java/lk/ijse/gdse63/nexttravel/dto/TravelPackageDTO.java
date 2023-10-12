package lk.ijse.gdse63.nexttravel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelPackageDTO {
    private String tpId;
    private String category;
    private Boolean petAllow;
    private int vehicleId;
    private int adultsAmount;
    private int childrenAmount;
    private String paymentStatus;
    private Double discount;
    private Double price;
    private int customerId;
}
