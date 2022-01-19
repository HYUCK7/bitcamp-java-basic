package com.example.app1;

import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID는? ");
        String ID = scanner.next();

        System.out.println("PW는?");
        String PW = scanner.next();

        System.out.println("name은?");
        String name = scanner.next();


        System.out.println("환영합니다 ID는 " + ID + ", PW는" + PW + " 이름은" + name);
    }



}
