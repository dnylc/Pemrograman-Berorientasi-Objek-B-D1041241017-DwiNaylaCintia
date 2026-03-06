package Pertemuan10;

class Mobil {
    // Atribut
    String merk;
    String warna;
    int tahun;

    // Constructor 1 tanpa parameter
    public Mobil() {
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }

    // Constructor 2 dengan 1 parameter (merk saja)
    public Mobil(String merk) {
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }

    //Constructor 3 dengan 3 parameter menggunakan this
    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }
}

public class LatihanMobilConstructor {
    public static void main(String[] args) {
        // Membuat object mobil1 menggunakan constructor tanpa parameter
        Mobil mobil1 = new Mobil();
        // Menampilkan informasi mobil1
        mobil1.tampilkanSpesifikasi();

        System.out.println(); // Menambahkan baris kosong untuk pemisah

        // Membuat object mobil2 menggunakan constructor dengan 1 parameter
        Mobil mobil2 = new Mobil("Toyota");
        // Menampilkan informasi mobil2
        mobil2.tampilkanSpesifikasi();

        System.out.println(); // Menambahkan baris kosong untuk pemisah

        // Membuat object mobil3 menggunakan constructor dengan 3 parameter
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        // Menampilkan informasi mobil3
        mobil3.tampilkanSpesifikasi();
    }
    
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
 */