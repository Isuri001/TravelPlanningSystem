package lk.ijse.gdse63.nexttravel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private String usernic;

    private String contact;

    private String email;

    private Date birthday;

    private String nicFront;

    private String nicRear;

    private String gender;

    private String remarks;

    public User() {
    }

    public User(int id, String username, String password, String usernic, String contact, String email, Date birthday, String nicFront, String nicRear, String gender, String remarks) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.usernic = usernic;
        this.contact = contact;
        this.email = email;
        this.birthday = birthday;
        this.nicFront = nicFront;
        this.nicRear = nicRear;
        this.gender = gender;
        this.remarks = remarks;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsernic() {
        return usernic;
    }

    public void setUsernic(String usernic) {
        this.usernic = usernic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNicFront() {
        return nicFront;
    }

    public void setNicFront(String nicFront) {
        this.nicFront = nicFront;
    }

    public String getNicRear() {
        return nicRear;
    }

    public void setNicRear(String nicRear) {
        this.nicRear = nicRear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", usernic='" + usernic + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", nicFront='" + nicFront + '\'' +
                ", nicRear='" + nicRear + '\'' +
                ", gender='" + gender + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
