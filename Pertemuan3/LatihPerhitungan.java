package Pertemuan3;

public class LatihPerhitungan {
    public static void main(String[] args) {
     // Saldo awal tipe data bilangan bulat
     int saldo = 1000000;
     System.out.println("=== SIMULASI TRANSAKSI BANK ===");
     System.out.println("Saldo Awal : " + saldo);

     // Setoran awal tipe data bilangan bulat
     int setoran = 500000;
     System.out.println("Setoran : " + setoran);

     //Menambahkan saldo awal dan setoran
     saldo += setoran;
     System.out.println("Saldo Setelah Setoran : " + saldo);

     // Penarikan tipe data bilangan bulat
     int penarikan = 250000;
     System.out.println("Penarikan : " + penarikan);

     //Mengurangi saldo dengan penarikan
     saldo -= penarikan;
     System.out.println("Saldo Akhir : " + saldo);

    }

}
