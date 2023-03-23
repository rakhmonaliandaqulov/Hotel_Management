package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "complain")
public class ComplainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private GuestsEntity guest_1_id;
    @Column(name = "status")
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GuestsEntity getGuest_id() {
        return guest_1_id;
    }

    public void setGuest_id(GuestsEntity guest_1_id) {
        this.guest_1_id = guest_1_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
