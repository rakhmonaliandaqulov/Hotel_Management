package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee_type")
public class EmployeeTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee_id;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmployeeEntity getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(EmployeeEntity employee_id) {
        this.employee_id = employee_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
