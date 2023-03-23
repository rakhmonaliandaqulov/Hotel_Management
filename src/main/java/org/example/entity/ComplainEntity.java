package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "complain")
@Getter
@Setter
@ToString
public class ComplainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private GuestsEntity guest_1_id;
    @Column(name = "status")
    private String status;

}
