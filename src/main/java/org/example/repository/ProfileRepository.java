package org.example.repository;

import org.example.db.Database;
import org.example.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Repository
public class ProfileRepository {

    public EmployeeEntity searchByPhone(String phone) {
        Connection connection = Database.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from employee where phone=? ;");
            statement.setString(1, phone);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String p_phone = resultSet.getString("phone");
                String password = resultSet.getString("psw");
                Timestamp c_d = resultSet.getTimestamp("date");
                String status = resultSet.getString("status");
                String role = resultSet.getString("type");

                return new EmployeeEntity(id, name, surname, p_phone, password, c_d.toLocalDateTime(), status, role);
            }


        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }

        return null;
    }

    public int addProfileToDb(EmployeeEntity profile) {

        Connection connection = Database.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "insert into profile(name,surname,phone,password,created_date,status,role) " +
                            "values (?,?,?,?,?,?,?)");
            statement.setString(1, profile.getName());
            statement.setString(2, profile.getSurname());
            statement.setString(3, profile.getPhone());
            statement.setString(4, profile.getPsw());
            statement.setTimestamp(5, Timestamp.valueOf(profile.getDate()));
            statement.setString(6, profile.getStatus());
            statement.setString(7, profile.getType());

            int resultSet = statement.executeUpdate();
            return resultSet;


        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }

        return 0;
    }

}
