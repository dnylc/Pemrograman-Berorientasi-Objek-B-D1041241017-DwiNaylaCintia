package Pertemuan12;

class Mahasiswa {
    //Atribut static untuk menghitung jumlah mahasiswa
    static int jumlahMahasiswa = 0;
    String nama;
    // Constructor untuk membuat objek Mahasiswa
    Mahasiswa(String n) {
        nama = n;
        // Constructor : Setiap kali objek Mahasiswa dibuat, jumlahMahasiswa akan bertambah
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat : " + nama);
    }
    // Method static untuk mendapatkan jumlah mahasiswa
    static int getJumlah() {
        return jumlahMahasiswa;
    }
}

public class StaticCounterMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa ("Andi");
        Mahasiswa m2 = new Mahasiswa ("Budi");
        Mahasiswa m3 = new Mahasiswa ("Citra");
        System.out.println("\nTotal Mahasiswa : " + Mahasiswa.getJumlah());
    }
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
 */
