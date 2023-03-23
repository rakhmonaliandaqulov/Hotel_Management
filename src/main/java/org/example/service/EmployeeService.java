package org.example.service;

import org.example.controller.AdminController;
import org.example.entity.EmployeeEntity;
import org.example.enums.EmployeeStatus;
import org.example.enums.ProfileRole;
import org.example.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private ProfileRepository profileRepository;

    public EmployeeService() {
        this.profileRepository = new ProfileRepository();
    }

    public void login(String phone, String password) {
        EmployeeEntity profile = profileRepository.searchByPhone(phone);

        if (profile == null) {
            System.out.println("Phone xato!");
            return;
        }

        if (!profile.getPsw().equals(password)) {
            System.out.println("Parol xato");
            return;
        }

        if (profile.getStatus().equals(EmployeeStatus.BLOCK.toString())) {
            System.out.println("Bu login blocklangan");
            return;
        }

        if (profile.getType().equals(ProfileRole.ADMIN.toString())) {
            AdminController adminController = new AdminController();
            adminController.start();

        }else {
            System.err.println("Mazgi sen Admin emassan.");
            return;
        }

    }
}
