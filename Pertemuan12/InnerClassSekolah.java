package Pertemuan12;

class Sekolah {
    String namaSekolah;
    // Constructor untuk membuat objek Sekolah
    Sekolah(String nama) {
        namaSekolah = nama;
    }
    // Inner class untuk merepresentasikan kelas di sekolah
    class Kelas {
        String namaKelas;
        // Constructor untuk membuat objek Kelas
        Kelas(String kelas) {
            namaKelas = kelas;
        }
        // Method untuk menampilkan informasi kelas dan sekolah
        void info() {
            System.out.println("Sekolah : " + namaSekolah);
            System.out.println("Kelas : " + namaKelas);
        }
    }
}

public class InnerClassSekolah {
    public static void main(String[] args) {
        // Membuat objek Sekolah
        Sekolah sekolah = new Sekolah("SMA Negeri 1");
        Sekolah.Kelas kelas = sekolah.new Kelas("X-A");
        kelas.info();
    }
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
 */