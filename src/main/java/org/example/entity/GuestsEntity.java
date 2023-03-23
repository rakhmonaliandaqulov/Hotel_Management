package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "guests")
@Getter
@Setter
@ToString
public class GuestsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "phone", length = 13)
    private String phone;
    @Column(name = "passportNumber")
    private String pNumber;
    @Column(name = "pGivenDate")
    private LocalDateTime pGivenDate;
    @Column(name = "pExpiredDate")
    private LocalDateTime pExpiredDate;
    @Column(name = "pGivenBy")
    private String pGivenBy;

}
