package Pertemuan14;

public class Array2DSederhana {
    public static void main(String[] args) {
        int[][] tabel = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("=== TABEL 3x3 ===");

        // Menampilkan isi tabel dengan nested loop
        for (int i = 0; i < tabel.length; i++){
            for (int j = 0; j < tabel[i].length; j++){
                System.out.print(tabel[i][j] + "\t");
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak semua elemen dalam baris yang sama
        }
        }
    }
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
*/
