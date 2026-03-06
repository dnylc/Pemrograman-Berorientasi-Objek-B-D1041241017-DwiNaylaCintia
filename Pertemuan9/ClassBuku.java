package Pertemuan9;

class Buku {
    // Atribut 
    String judul;
    String pengarang;
    int harga;

    //Method
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga : " + harga);
    }

}

public class ClassBuku {
    public static void main(String[] args) {
        // Membuat object buku1
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java"; 
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        // Menampilkan informasi buku1
        buku1.tampilkanInfo();

        System.out.println(); // Menambahkan baris kosong untuk pemisah

        // Membuat object buku2
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        // Menampilkan informasi buku2
        buku2.tampilkanInfo();
    }
    
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
*/