package Pertemuan11;

class Produk {
    // Atribut
    String namaProduk;
    int harga;
    int stok;

    //Constructor 1 : Nama dan harga saja
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
        stok = 0; // Default stok
    }
    //Constructor 2 : Semua atribut
    public Produk(String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    //Method untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : Rp " + harga);
        System.out.println("Stok : " + stok);
        System.out.println();
    }
}

public class LatihanProdukOverloading {
    public static void main(String[] args) {
        // Membuat object produk1 dengan constructor nama dan harga
        Produk produk1 = new Produk("Laptop ASUS", 8500000);
        produk1.tampilkanInfo();
        // Membuat object produk2 dengan constructor nama, harga, dan stok
        Produk produk2 = new Produk("Mouse Logitech", 250000, 50);
        produk2.tampilkanInfo();
}
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
 */
