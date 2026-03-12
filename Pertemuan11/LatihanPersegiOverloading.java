package Pertemuan11;

class PersegiPanjang {
    //Atribut
    int panjang;
    int lebar;
    int luas;
    int keliling;

    //Constructor 1 : Persegi (panjang = lebar)
    public PersegiPanjang(int sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);  
    }
    //Constructor 2 : Persegi Panjang (panjang dan lebar berbeda)
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);  
    }
    //Method untuk menampilkan informasi persegi
    public void tampilkanInfo() {
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar : " + lebar + " cm");
        System.out.println("Luas : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
        System.out.println();
    }
    
}

public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        // Membuat object persegi dengan constructor sisi
        PersegiPanjang persegi = new PersegiPanjang(5);
        System.out.println("=== PERSEGI ===");
        persegi.tampilkanInfo();
        // Membuat object persegi panjang dengan constructor panjang dan lebar
        PersegiPanjang persegiPanjang = new PersegiPanjang(8, 4);
        System.out.println("=== PERSEGI PANJANG ===");
        persegiPanjang.tampilkanInfo();
    }
}
/*
Nama : Dwi Nayla Cintia
NIM : D1041241017
Kelas : B
 */