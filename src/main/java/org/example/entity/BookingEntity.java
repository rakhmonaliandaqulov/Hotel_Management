package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
@Getter
@Setter
@ToString
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
}
