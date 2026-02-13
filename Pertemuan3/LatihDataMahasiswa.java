package Pertemuan3;

public class LatihDataMahasiswa {
    public static void main(String[] args) {
        // Tipe data string pada NIM karena terdiri dari kombinasi huruf dan angka
        String nim = "D1041241017";
        String nama = "Dwi Nayla Cintia";

        // Tipe data karakter
        char kelas = 'B';

        // Tipe data logika
        boolean status = true;

        //Tipe data bilangan desimal
        double ipk = 3.71;

        // Tipe data bilangan bulat
        int total = 64;

        // Menampilkan nilai semua variabel
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Status Aktif : " + status);
        System.out.println("IPK Semester : " + ipk);
        System.out.println("Total SKS : " + total);
}

}
