package lk.ijse.gdse63.nexttravel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String address;
    private String remark;
    private String email;
    private String category;
    private String contact;
    private String maplink;
    private String pets;

    public Hotel(int id, String name, String address, String remark, String email, String category, String contact, String maplink, String pets) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.remark = remark;
        this.email = email;
        this.category = category;
        this.contact = contact;
        this.maplink = maplink;
        this.pets = pets;
    }

    public Hotel() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMaplink() {
        return maplink;
    }

    public void setMaplink(String maplink) {
        this.maplink = maplink;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                ", email='" + email + '\'' +
                ", category='" + category + '\'' +
                ", contact='" + contact + '\'' +
                ", maplink='" + maplink + '\'' +
                ", pets='" + pets + '\'' +
                '}';
    }
}
