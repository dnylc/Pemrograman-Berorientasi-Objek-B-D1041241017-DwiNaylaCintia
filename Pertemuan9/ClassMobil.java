package Pertemuan9;

class Mobil {
    // Atribut
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    // Method menampilkan merk, warna, dan tahun mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }

    // Method menambahkan kecepatan sebesar 20 km/jam
    public void percepat() {
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat...");
    }

    // Method menampilkan kecepatan saat ini
    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }

}

public class ClassMobil {
    public static void main(String[] args) {
        // Membuat object mobil1
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;
        mobil1.kecepatan = 0;

        //Menampilkan spesifikasi mobil1
        mobil1.tampilkanSpesifikasi();

        System.out.println(); // Menambahkan baris kosong untuk pemisah

        // Mempercepat mobil1
        mobil1.percepat();
        mobil1.percepat();
        // Menampilkan kecepatan mobil1
        mobil1.tampilkanKecepatan();
    }
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
*/