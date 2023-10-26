package lk.ijse.gdse63.nexttravel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Vehicle(int id, String name, String transmission, String category, String vehicleType, String seatCapacity, String fuelType, Double dayFee, Double fuelUsage, Double kmFee, Boolean hybrid, int driverId, String driverName, String contactNo) {
        this.id = id;
        this.name = name;
        this.transmission = transmission;
        this.category = category;
        this.vehicleType = vehicleType;
        this.seatCapacity = seatCapacity;
        this.fuelType = fuelType;
        this.dayFee = dayFee;
        this.fuelUsage = fuelUsage;
        this.kmFee = kmFee;
        this.hybrid = hybrid;
        this.driverId = driverId;
        this.driverName = driverName;
        this.contactNo = contactNo;
    }

    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(String seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Double getDayFee() {
        return dayFee;
    }

    public void setDayFee(Double dayFee) {
        this.dayFee = dayFee;
    }

    public Double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(Double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public Double getKmFee() {
        return kmFee;
    }

    public void setKmFee(Double kmFee) {
        this.kmFee = kmFee;
    }

    public Boolean getHybrid() {
        return hybrid;
    }

    public void setHybrid(Boolean hybrid) {
        this.hybrid = hybrid;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", transmission='" + transmission + '\'' +
                ", category='" + category + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", seatCapacity='" + seatCapacity + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", dayFee=" + dayFee +
                ", fuelUsage=" + fuelUsage +
                ", kmFee=" + kmFee +
                ", hybrid=" + hybrid +
                ", driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
