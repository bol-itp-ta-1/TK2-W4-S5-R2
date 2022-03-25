// IMPORT AREA - SCANNER //

import java.util.Scanner;

// PUBLIC AREA CLASS //

public class Main {
    public static void main(String[] args) {

// VARIABLE DECLARATION //

String Nama, NIM;
int Angka;

// SCANNER INPUT //

Scanner keyboard=new Scanner(System.in);

// KEYBOARD INPUT //

System.out.print("Masukkan Nama Anda: ");
    Nama = keyboard.nextLine();

    if (Nama.length() <= 25) 
    {
    System.out.print("Masukkan NIM Anda (1o Digit): ");
    NIM = keyboard.nextLine();

    if (NIM.length() == 10)
    {
        System.out.println("##########################################################");
        System.out.println("Selamat datang " + Nama + " [NIM:" + NIM + "]");
        System.out.println("##########################################################"); 
        System.out.print("Silakan pilih 1 angka antara 5-20: ");
        
        // Agak bingung di sini, untuk validasi data nya
        Angka = keyboard.nextint();
          if (Angka.length() >= 5 & (Angka.length() <= 20))
          {//No 4-Selesai taruh di sini}
          } else
          System.out.print("Masukkan Angka yang valid!");

    } else if (NIM.length() < 10 | NIM.length() > 10)
    
    System.out.print("Masukkan NIM yang valid!");

    } else if (Nama.length() > 25) 
    System.out.println("Maaf, Nama Anda Terlalu Panjang");

    }
  }
