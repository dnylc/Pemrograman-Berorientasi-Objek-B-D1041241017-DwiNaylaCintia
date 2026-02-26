package Pertemuan6;

public class LatihanRestoran {
    public static void main(String[] args){
        int menuCode = 1; // Contoh kode menu (1-5)
        int quantity = 2; //Jumlah pesanan
        String menuName; // Variabel untuk menyimpan nama menu
        int price; // Variabel untuk menyimpan harga satuan menu

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu : " + menuCode);
        System.out.println("Jumlah : " + quantity + "\n");

        // Menggunakan switch statement untuk menentukan nama menu dan harga berdasarkan kode menu
        switch (menuCode) {
            case 1:
                menuName = "Nasi Goreng";
                price = 15000;
                break;
            case 2:
                menuName = "Mie Ayam";
                price = 12000;
                break;
            case 3:
                menuName = "Bakso";
                price = 10000;
                break;
            case 4:
                menuName = "Soto Ayam";
                price = 13000;
                break;
            case 5:
                menuName = "Es Teh";
                price = 3000;  
                break;
            default: // Jika kode menu tidak valid, set nama menu dan harga ke nilai default
               menuName = "Error : Kode menu tidak valid ( 1-5 )";
               price = 0;
                break;
        }
        System.out.println("Pesanan Anda :");
        System.out.println("NamaMenu : " + menuName);
        System.out.println("Harga Satuan : " + price);
        System.out.println("Jumlah : " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar : Rp " + (price * quantity)); // Menghitung total bayar dengan mengalikan harga satuan dengan jumlah
    }
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B