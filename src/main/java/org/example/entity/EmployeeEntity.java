package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString
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
}
