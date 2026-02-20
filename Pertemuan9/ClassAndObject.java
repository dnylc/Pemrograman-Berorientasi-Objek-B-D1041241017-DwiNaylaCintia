package Pertemuan9;

class ObjectClass {
    // Atribut (sesuai diagram UML mobil)
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    // Method (sesuai diagram UML mobil)
    public void percepatan(int increment){
        kecepatan += increment;
    }

    public void tampilkanInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Membuat objek mobil
        ObjectClass mobil1 = new ObjectClass();
        mobil1.merk = "Mazda";
        mobil1.warna = "Pink";
        mobil1.tahun = 2026;
        mobil1.kecepatan = 0;

        // Menampilkan informasi awal mobil
        System.out.println("Informasi Mobil:");
        mobil1.tampilkanInfo();

        // Mempercepat mobil
        System.out.println("\nMempercepat mobil...");
        mobil1.percepatan(50);
        mobil1.tampilkanInfo();
    }
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B
