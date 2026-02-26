package Pertemuan7;

public class LatihanValidasi {
    public static void main(String[] args) {

        int[] input = {-10, 150, 85}; // Contoh input 3 nilai ujian yang akan divalidasi
        int i = 0; // Inisialisasi indeks untuk mengakses elemen dalam array input
        int nilai; // Variabel untuk menyimpan nilai ujian yang sedang divalidasi
        String hasil; // Variabel untuk menyimpan hasil validasi (pesan error atau nilai valid)

        System.out.println("=== Validasi Nilai Ujian ===");

        // Menggunakan do-while loop untuk melakukan validasi terhadap setiap nilai 
        do { 
            nilai = input[i]; // Mengambil nilai ujian dari array input berdasarkan indeks i

            System.out.println("Percobaan input: " + nilai); 

            if (nilai < 0 || nilai > 100) {
                hasil = "Error : Nilai harus antara 0-100!";
            } else {
                hasil = "Nilai valid: " + nilai;
            }

            System.out.println(hasil + "\n"); // Mencetak hasil validasi diikuti oleh baris baru
            i++;

        
        } while ((nilai < 0 || nilai > 100) && i < input.length); // Melanjutkan validasi selama nilai tidak valid dan masih ada elemen dalam array
    }

}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B