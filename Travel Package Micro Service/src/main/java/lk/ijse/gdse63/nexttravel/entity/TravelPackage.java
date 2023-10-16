package lk.ijse.gdse63.nexttravel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TravelPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

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

    public TravelPackage(String tpId, String category, Boolean petAllow, int vehicleId, int adultsAmount, int childrenAmount, String paymentStatus, Double discount, Double price, int customerId) {
        this.tpId = tpId;
        this.category = category;
        this.petAllow = petAllow;
        this.vehicleId = vehicleId;
        this.adultsAmount = adultsAmount;
        this.childrenAmount = childrenAmount;
        this.paymentStatus = paymentStatus;
        this.discount = discount;
        this.price = price;
        this.customerId = customerId;
    }

    public TravelPackage() {
    }

    public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getPetAllow() {
        return petAllow;
    }

    public void setPetAllow(Boolean petAllow) {
        this.petAllow = petAllow;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getAdultsAmount() {
        return adultsAmount;
    }

    public void setAdultsAmount(int adultsAmount) {
        this.adultsAmount = adultsAmount;
    }

    public int getChildrenAmount() {
        return childrenAmount;
    }

    public void setChildrenAmount(int childrenAmount) {
        this.childrenAmount = childrenAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "tpId='" + tpId + '\'' +
                ", category='" + category + '\'' +
                ", petAllow=" + petAllow +
                ", vehicleId=" + vehicleId +
                ", adultsAmount=" + adultsAmount +
                ", childrenAmount=" + childrenAmount +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", discount=" + discount +
                ", price=" + price +
                ", customerId=" + customerId +
                '}';
    }
}
