package org.example.repository;

import org.example.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RoomRepository {
    public int addRoom(RoomEntity room) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(room);
        transaction.commit();

        session.close();
        factory.close();
        return 0;
    }

    public List<RoomEntity> roomList() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<RoomEntity> roomList = session.createQuery("from RoomEntity ", RoomEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return roomList;
    }

    public int deleteRoom(Integer id) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<RoomEntity> roomList = session.createQuery("delete from  RoomEntity where id = " + id + "", RoomEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return 1;
    }

    public int updateRoom(RoomEntity room) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(room);
        transaction.commit();

        session.close();
        factory.close();
        return 1;
    }

    public RoomEntity find(Integer id) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        RoomEntity roomList = session.createQuery("from RoomEntity where id = " + id + "", RoomEntity.class).getSingleResult();
        transaction.commit();

        session.close();
        factory.close();
        return roomList;
    }

    public int addConvenient(ConvenientEntity convenient) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(convenient);
        transaction.commit();

        session.close();
        factory.close();
        return 1;
    }

    public List<ConvenientEntity> convenientList() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<ConvenientEntity> convenientList = session.createQuery("from ConvenientEntity ", ConvenientEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return convenientList;
    }

    public int deleteConvenient(Integer id) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.createQuery("delete from  ConvenientEntity where id = " + id + "", ConvenientEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return 1;
    }

    public int addEmployee(EmployeeEntity employee) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();

        session.close();
        factory.close();
        return 1;
    }

    public List<EmployeeEntity> employeeList() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<EmployeeEntity> convenientList = session.createQuery("from EmployeeEntity ", EmployeeEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return convenientList;
    }

    public int deleteEmployee(Integer id) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.createQuery("delete from  EmployeeEntity where id = " + id + "", EmployeeEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return 1;
    }

    public void addEmployeeType(EmployeeTypeEntity employeeType) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employeeType);
        transaction.commit();

        session.close();
        factory.close();
    }

    public void addGuest(GuestsEntity guests) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(guests);
        transaction.commit();

        session.close();
        factory.close();
    }

    public List<GuestsEntity> guestList() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<GuestsEntity> convenientList = session.createQuery("from GuestsEntity ", GuestsEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return convenientList;
    }

    public void addBooking(BookingEntity booking) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(booking);
        transaction.commit();

        session.close();
        factory.close();
    }

    public List<BookingEntity> bookingList() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<BookingEntity> convenientList = session.createQuery("from BookingEntity", BookingEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return convenientList;
    }

    public List<BookingEntity> listByRoomId(Integer roomId) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<BookingEntity> bookingList = session.createQuery("delete from  BookingEntity where room_id = " + roomId + "", BookingEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return bookingList;
    }

    public List<BookingEntity> listByGuestId(Integer guestId) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<BookingEntity> bookingList = session.createQuery("delete from  BookingEntity where guest_1_id = " + guestId + "", BookingEntity.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return bookingList;
    }
}
