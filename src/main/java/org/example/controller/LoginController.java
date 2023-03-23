package org.example.controller;


import org.example.service.LoginService;
import org.example.util.ScannerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class LoginController {
     @Autowired
     private LoginService loginService;
    public void start() {
        boolean b = true;
        while (b) {
            menu();
            switch (ScannerUtil.getAction()) {
                case 1 -> login();
                case 2 -> complain();
                case 0 -> b = false;
                default -> System.out.println("Are you mazgi? Write correctly!");

            }
        }
    }
    private void complain() {
    }
    private void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone: ");
        String phone = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        loginService.login(phone,password);

    }
    private void menu() {
        System.out.println("*****  MENU  *****");
        System.out.println("1.Login");
        System.out.println("2.Complain");
        System.out.println("0.Exit");
    }

}
