package Pertemuan8;

public class LatihanTotalGenap {
    public static void main (String[] args){
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        int total = 0; // Inisialisasi variabel total untuk menyimpan jumlah bilangan genap

        // Menggunakan for loop untuk menghitung total bilangan genap dari 1 hingga 20
        for (int angka = 1; angka <= 20; angka++){
            if (angka % 2 != 0) { // Jika angka tidak genap
                continue;         // lanjutkan ke iterasi berikutnya tanpa menambahkan ke total
            }
            System.out.println("Tambah : " + angka + " -> " + "Total : " + (total + angka)); 
            total += angka; // Menambahkan angka genap ke total
        }
        System.out.println("---");
        System.out.println("Total akhir : " + total);
    }
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B