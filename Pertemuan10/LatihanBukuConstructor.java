package Pertemuan10;

class Buku {
    // Atribut
    String judul;
    String pengarang;
    int harga;

    // Constructor 1 tanpa parameter
    public Buku() {
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    // Constructor 2 dengan 3 parameter menggunakan this
    public Buku(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga : Rp " + harga );
    }
}

public class LatihanBukuConstructor {
    public static void main (String[] args) {
        // Membuat object buku1 menggunakan constructor tanpa parameter
        Buku buku1 = new Buku();
        // Menampilkan informasi buku1
        buku1.tampilkanInfo();

        System.out.println(); // Menambahkan baris kosong untuk pemisah

        // Membuat object buku2 menggunakan constructor dengan parameter
        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000 );
        // Menampilkan informasi buku2
        buku2.tampilkanInfo();

        System.out.println(); // Menambahkan baris kosong untuk pemisah

        // Membuat object buku3 menggunakan constructor dengan parameter
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);
        // Menampilkan informasi buku3
        buku3.tampilkanInfo();
    }
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
 */