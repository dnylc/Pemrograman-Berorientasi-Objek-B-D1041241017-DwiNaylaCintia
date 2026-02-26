package Pertemuan7;

public class LatihanTabelPerkalian {
    public static void main (String[] args){
        int angka = 7; 
        System.out.println("=== TABEL PERKALIAN 7 ===");

        // Menggunakan for loop untuk mencetak tabel perkalian dari angka 7 hingga 12
        for (int i  = 1; i <= 12; i++) {
            int hasil = angka * i; // Menghitung hasil perkalian antara angka dan i
            System.out.println(angka + " x " + i + " = " + hasil); // Mencetak hasil perkalian antara angka dan i
        }

    }

}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B