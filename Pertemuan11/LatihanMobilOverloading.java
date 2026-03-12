package Pertemuan11;

class Mobil {
    // Atribut
    String merk;
    String warna;
    int tahun;

    //Constructor 1 : Tanpa parameter
    public Mobil () {
        merk = "Unknown";
        warna = "Unknown";
        tahun = 0;
    }
    //Constructor 2 : Dengan parameter hanya merk
    public Mobil (String merk) {
        this.merk = merk;
        warna = "Unknown";
        tahun = 0;
    }
    //Constructor 3 : Dengan parameter merk, warna, dan tahun
    public Mobil (String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menampilkan spesifikasi mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println();
    }

}

public class LatihanMobilOverloading {
    public static void main(String[] args) {
        // Membuat object mobil1 dengan constructor tanpa parameter 
        Mobil mobil1 = new Mobil();
        mobil1.tampilkanSpesifikasi();
        // Membuat object mobil2 dengan constructor hanya parameter merk
        Mobil mobil2 = new Mobil("Toyota");
        mobil2.tampilkanSpesifikasi();
        // Membuat object mobil3 dengan constructor parameter merk, warna, dan tahun
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        mobil3.tampilkanSpesifikasi();
    }
    
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
 */
