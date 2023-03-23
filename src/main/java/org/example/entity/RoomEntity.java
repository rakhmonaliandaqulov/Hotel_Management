package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "room")
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        RoomNumber = roomNumber;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", RoomNumber=" + RoomNumber +
                ", floor=" + floor +
                ", RoomType='" + RoomType + '\'' +
                ", price=" + price +
                ", area=" + area +
                '}';
    }
}
