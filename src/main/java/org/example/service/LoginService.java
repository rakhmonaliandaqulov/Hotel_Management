package org.example.service;

import org.example.controller.AdminController;
import org.example.entity.EmployeeEntity;
import org.example.enums.EmployeeStatus;
import org.example.enums.ProfileRole;
import org.example.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private AdminController adminController;
    public void login(String phone, String password) {
        EmployeeEntity profile = profileRepository.searchByPhone(phone);

        if (profile == null) {
            System.out.println("Phone number is error!");
            return;
        }

        if (!profile.getPsw().equals(password)) {
            System.out.println("Password is error!");
            return;
        }

        if (profile.getStatus().equals(EmployeeStatus.BLOCK.toString())) {
            System.out.println("This login is BLOCKED.");
            return;
        }

        if (profile.getType().equals(ProfileRole.ADMIN.toString())) {
            adminController.start();
        }

    }
}
