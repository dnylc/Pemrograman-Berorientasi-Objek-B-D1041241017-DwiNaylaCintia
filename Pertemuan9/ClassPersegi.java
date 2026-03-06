package Pertemuan9;

class Persegi {
    // Atribut
    int sisi;
    int luas;
    int keliling;

    // Method menghitung luas persegi
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    //Method menghitung keliling persegi
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    // Method menampilkan sisi, luas, dan keliling persegi
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi : " + sisi + " cm");
        System.out.println("Luas : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
    }
}
public class ClassPersegi {
    public static void main(String[] args) {
        // Membuat object persegi1
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 5;

        // Menghitung luas dan keliling persegi1
        persegi1.hitungLuas();
        persegi1.hitungKeliling();

        // Menampilkan hasil
        persegi1.tampilkanHasil();
    }
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas  : B
 */