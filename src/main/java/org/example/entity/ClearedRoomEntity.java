package org.example.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cleared_room")
public class ClearedRoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee_id;
    @Column(name = "time")
    private LocalDateTime time;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private RoomEntity room_id;

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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public RoomEntity getRoom_id() {
        return room_id;
    }

    public void setRoom_id(RoomEntity room_id) {
        this.room_id = room_id;
    }
}
