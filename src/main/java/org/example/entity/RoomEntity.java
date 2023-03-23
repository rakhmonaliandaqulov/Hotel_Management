package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "room")
@Getter
@Setter
@ToString
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "RoomNumber")
    private Integer RoomNumber;
    @Column(name = "floor")
    private Integer floor;
    @Column(name = "RoomType")
    private String RoomType;
    @Column(name = "price")
    private Integer price;
    @Column(name = "area")
    private Integer area;

}
