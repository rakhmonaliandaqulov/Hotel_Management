package org.example.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "phone", length = 13)
    private String phone;
    @Column(name = "psw")
    private String  psw;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "status")
    private String status;
    @Column(name = "type")
    private String type;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String name, String surname, String phone, String psw, LocalDateTime date, String status, String type) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.psw = psw;
        this.date = date;
        this.status = status;
        this.type = type;
    }

    public EmployeeEntity(Integer id, String name, String surname, String phone, String psw, LocalDateTime date, String status, String type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.psw = psw;
        this.date = date;
        this.status = status;
        this.type = type;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
