package lk.ijse.gdse63.nexttravel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private int id;
    private String name;
    private String transmission;
    private String category;
    private String vehicleType;
    private String seatCapacity;
    private String fuelType;
    private Double dayFee;
    private Double fuelUsage;
    private Double kmFee;
    private Boolean hybrid;
    private int driverId;
    private String driverName;
    private String contactNo;

}
