package org.example.service;

import org.example.entity.*;
import org.example.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService {
    @Autowired
    private RoomRepository repository;

    public void addRoom(RoomEntity room) {
        repository.addRoom(room);
    }
    public void roomList() {
        List<RoomEntity> roomLists = repository.roomList();
        System.out.println(" ** ROOM LIST **");
        for (RoomEntity room : roomLists) {
            System.out.println(room);
        }
    }
    public void deleteRoom(Integer id) {
        int i = repository.deleteRoom(id);
        if (i == 1){
            System.out.print("DELETED SUCCESSFULLY");
        }
    }
    public void updateRoom(RoomEntity room) {
        int i = repository.updateRoom(room);
        if (i == 1){
            System.out.print("UPDATE SUCCESSFULLY");
        }
    }
    public void find(Integer id) {
        RoomEntity room = repository.find(id);
        if (room != null){
            System.out.println(room);
        }
    }

    public void AddConvenient(ConvenientEntity convenient) {
        int i = repository.addConvenient(convenient);
        if (i == 1){
            System.out.print("CONVENIENT ADDED");
        }
    }
    public void convenientList() {
        List<ConvenientEntity> convenient = repository.convenientList();
        System.out.print("       ** CONVENIENT LIST **");
        for (ConvenientEntity convenient1 : convenient) {
            System.out.println(convenient1);
        }
    }
    public void deleteConvenient(Integer id) {
        int i = repository.deleteConvenient(id);
        if(i == 1){
            System.out.print("DELETE SUCCESSFULLY");
        }
    }

    public void addEmployee(EmployeeEntity employee) {
        int i = repository.addEmployee(employee);
        if(i == 1){
            System.out.print("ADDED SUCCESSFULLY");
        }
    }
    public void employeeList() {
        List<EmployeeEntity> employeeList = repository.employeeList();
        for (EmployeeEntity employee : employeeList) {
            System.out.println(employee);
        }
    }
    public void deleteEmployee(Integer id) {
        repository.deleteEmployee(id);
    }
    public void addEmployeeType(EmployeeTypeEntity employeeType) {
        repository.addEmployeeType(employeeType);
    }

    public void addGuest(GuestsEntity guests) {
        repository.addGuest(guests);
        System.out.println("ADDED SUCCESSFULLY");
    }
    public void guestList() {
        List<GuestsEntity> guests = repository.guestList();
        for (GuestsEntity guests1 : guests) {
            System.out.println(guests1);
        }
    }

    public void addBooking(BookingEntity booking) {
        repository.addBooking(booking);
        System.out.println("ADDED SUCCESSFULLY");
    }
    public void bookingList() {
        List<BookingEntity> bookingList = repository.bookingList();
        for (BookingEntity booking : bookingList) {
            System.out.println(booking);
        }
    }
    public void listByRoomId(Integer roomId) {
        List<BookingEntity> bookingList = repository.listByRoomId(roomId);
        for (BookingEntity booking : bookingList) {
            System.out.println(booking);
        }
    }
    public void listByGuestId(Integer guestId) {
        List<BookingEntity> bookingList = repository.listByGuestId(guestId);
        for (BookingEntity booking : bookingList) {
            System.out.println(booking);
        }
    }
}
