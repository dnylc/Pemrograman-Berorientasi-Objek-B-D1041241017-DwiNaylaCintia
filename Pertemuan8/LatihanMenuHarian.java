package Pertemuan8;

public class LatihanMenuHarian {
    public static void main (String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI ===");

        // outer loop untuk hari 
        for (int hari = 1; hari <= 3; hari++){
            System.out.println("Hari " + hari + ":");

            // inner loop untuk waktu makan 
            for (int waktu = 1; waktu <= 2; waktu ++){
                String namaWaktu = "";
                String menu = "";

                // menentukan nama waktu makan dan menu berdasarkan waktu
                if (waktu == 1){
                    namaWaktu = "Pagi";
                    //menu pagi berdasarkan hari
                    if (hari == 1) {
                        menu = "Nasi Goreng";
                    } else if (hari == 2) {
                        menu = "Bubur Ayam";
                    } else if (hari == 3 ){
                        menu = "Roti Bakar";
                    }
                } else if (waktu == 2){
                    namaWaktu = "Siang";
                    //menu siang berdasarkan hari
                    if (hari == 1) {
                        menu = "Soto Ayam";
                    } else if (hari == 2) {
                        menu = "Mie Goreng";
                    } else if (hari == 3 ){
                        menu = "Nasi Uduk";
                    }
                }
                System.out.println("  " + namaWaktu + ": " + menu);
            }
        }
    }
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B