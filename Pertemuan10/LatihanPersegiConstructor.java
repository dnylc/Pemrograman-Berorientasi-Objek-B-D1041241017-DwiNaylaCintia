package Pertemuan10;

class Persegi {
    // Atribut
    int sisi;
    int luas;
    int keliling;

    //Constructor dengan 1 parameter (sisi)
    public Persegi(int sisi) {
        if (sisi <= 0) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1; // Set sisi ke default jika input tidak valid
        } else {
            this.sisi = sisi;
        }
        this.luas = this.sisi * this.sisi; //Menghitung luas di constructor
        this.keliling = 4 * this.sisi; //Menghitung keliling di constructor
    }
    // Method menampilkan hasil persegi
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi : " + sisi + " cm");
        System.out.println("Luas : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
    }
}

public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        // Membuat object persegi1 dengan sisi valis
        Persegi persegi1 = new Persegi(5);
        // Menampilkan hasil persegi1
        persegi1.tampilkanHasil();

        System.out.println(); // Menambahkan baris kosong untuk pemisah

        // Membuat object persegi2 dengan sisi tidak valid
        Persegi persegi2 = new Persegi(-3);
        // Menampilkan hasil persegi2
        persegi2.tampilkanHasil();
    }
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
*/