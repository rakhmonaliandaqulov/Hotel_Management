package org.example.controller;

import org.example.util.ScannerUtil;

import java.util.Scanner;


public class LoginController {
    private String menu = """
            *** MENU ***
            1. Login
            2. Complain
            0. Log out
            """;
    public void srart() {
        boolean b = true;
        while (b) {
            System.out.println(menu);
            switch (ScannerUtil.getAction()) {
                case 1 -> getLogin();
                case 2 -> getComplain();
                case 0 -> b = false;
                default -> {
                    System.out.println("Are you mazgi? Write correctly!");
                    srart();
                }
            }
        }
    }

    private void getComplain() {
    }

    private void getLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone");
        String phone = scanner.nextLine();


    }
}
