package com.binus.team1;

import java.util.ArrayList;
import java.util.List;
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

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 1; evenNumbers.size() < number; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        System.out.println("\n" + number + " Bilangan Genap :");
        evenNumbers.forEach(e -> System.out.print(e + " "));
        System.out.println("\nHasil Penjumlahan = " + evenNumbers.stream().mapToInt(e -> e).sum());

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1; oddNumbers.size() < number; i++) {
            if (i % 2 == 1) {
                oddNumbers.add(i);
            }
        }

        System.out.println("\n" + number + " Bilangan Ganjil :");
        oddNumbers.forEach(e -> System.out.print(e + " "));
        System.out.println("\nHasil Penjumlahan = " + oddNumbers.stream().mapToInt(e -> e).sum());

        ArrayList<Integer> fibonacciNumbers = new ArrayList<>(List.of(1, 1));
        for (int i = 2; i < number; i++) {
            fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2));
        }
        System.out.println("\n" + number + " Bilangan Fibonacci :");
        fibonacciNumbers.forEach(e -> System.out.print(e + " "));
        System.out.println("\nHasil Penjumlahan = " + fibonacciNumbers.stream().mapToInt(e -> e).sum());
    }
}
