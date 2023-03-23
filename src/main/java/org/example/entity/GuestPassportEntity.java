package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "guest_passport")
@Getter
@Setter
@ToString
public class GuestPassportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private GuestsEntity guest_1_id;
    @Column(name = "number")
    private String number;
    @Column(name = "startDate")
    private LocalDate startDate;
    @Column(name = "validity_period")
    private String validity_period;
    @Column(name = "submitter_name")
    private String submitter_name;
    @Column(name = "place")
    private String place;

}
