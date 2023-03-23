package org.example.db;

import org.example.entity.EmployeeEntity;
import org.example.enums.EmployeeStatus;
import org.example.enums.ProfileRole;
import org.example.repository.ProfileRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Database {
    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Hotel_Management", "postgres",
                    "postgres");
            return con;
        } catch (SQLException e) {
            System.out.println(e.getSQLState());
            e.printStackTrace();
            System.exit(-1);
        }
        return null;

    }

    public static void adminInit() {
        EmployeeEntity employee = new EmployeeEntity("Admin", "Adminov", "123", "123",
                LocalDateTime.now(), EmployeeStatus.ACTIVE.toString(), ProfileRole.ADMIN.toString());

        ProfileRepository profileRepository = new ProfileRepository();

        EmployeeEntity employee1 = profileRepository.searchByPhone(employee.getPhone());
        if (employee1 != null) {
            return;
        }
        profileRepository.addProfileToDb(employee);


    }
}
