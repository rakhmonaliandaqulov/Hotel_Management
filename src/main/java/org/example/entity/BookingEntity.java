package org.example.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private GuestsEntity guest_1_id;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private RoomEntity room_id;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "date_count")
    private String date_count;

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

    public RoomEntity getRoom_id() {
        return room_id;
    }

    public void setRoom_id(RoomEntity room_id) {
        this.room_id = room_id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDate_count() {
        return date_count;
    }

    public void setDate_count(String date_count) {
        this.date_count = date_count;
    }
}
