package org.example.entity;

import org.example.enums.EmployeeStatus;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class EmployeeEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private LocalDate birthDate;
    private EmployeeStatus status;

}
