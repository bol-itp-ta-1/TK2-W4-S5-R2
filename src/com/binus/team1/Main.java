package com.binus.team1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, nim;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        name = input.nextLine();

        if (name.length() > 25) {
            System.out.println("\nMaaf, nama Anda terlalu panjang, maksimum 25 karakter!");
            return;
        }

        System.out.print("Masukkan NIM Anda (10 Digit): ");
        nim = input.nextLine();

        if (nim.length() != 10) {
            System.out.print("\nMaaf, NIM yang Anda masukkan tidak valid!");
            return;
        }

        System.out.println("\n##########################################################");
        System.out.println("Selamat datang " + name + " [NIM: " + nim + "]");
        System.out.println("##########################################################\n");
        System.out.print("Silakan pilih 1 angka antara 5-20: ");

        number = input.nextInt();

        if (number < 5 || number > 20) {
            System.out.print("\nMasukkan angka yang valid!");
            return;
        }
    }
}
