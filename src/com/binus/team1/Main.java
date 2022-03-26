package com.binus.team1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, nim;
        int number;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        name = keyboard.nextLine();

        if (name.length() <= 25) {
            System.out.print("Masukkan NIM Anda (1o Digit): ");
            nim = keyboard.nextLine();

            if (nim.length() == 10) {
                System.out.println("##########################################################");
                System.out.println("Selamat datang " + name + " [NIM:" + nim + "]");
                System.out.println("##########################################################");
                System.out.print("Silakan pilih 1 angka antara 5-20: ");

                number = keyboard.nextInt();

                if (number >= 5 & (number <= 20)) {
                } else {
                    System.out.print("Masukkan Angka yang valid!");
                }
            } else {
                System.out.print("Masukkan NIM yang valid!");
            }
        } else {
            System.out.println("Maaf, Nama Anda Terlalu Panjang");
        }

    }
}
