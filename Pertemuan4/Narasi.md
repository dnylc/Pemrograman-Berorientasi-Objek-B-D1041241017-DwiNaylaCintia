**Nama : Dwi Nayla Cintia \| NIM : D1041241017 \| Kelas : B**

Pada materi pertemuan 4 ini, saya merasa bahwa materi yang dipelajari
disini sangat berguna untuk pondasi bahasa java, yaitu mengenai
penggunaan variabel,tipe data dan aturan penamaan (*Naming Convention*)
serta penggunaan operator aritmatika. Pemahaman ini menjadi pondasi saya
untuk membangun program yang tidak hanya berfungsi secara teknis, tetapi
juga bersih dan mudah dipahami oleh pengembang lain.

Memahami pentingnya penggunaan *Naming Convention* itu adalah bahwa kode
bukan hanya instruksi untuk mesin, melainkan dokumen yang akan dibaca
oleh manusia. *Naming Convention* atau aturan penamaan adalah bahasa
yang telah disepakati. Karena disini saya mempelajari bahwa dalam java,
kita menggunakan standar *CamelCase* (seperti hargaSatuan) untuk
variabel, *PascalCase* (seperti LatihanProduk) untuk nama *Class*,
*ConstantCase* (seperti PAJAK) untuk konstanta dan penggunaan prefix
*is*/*has*/*can* (seperti isActive) untuk Boolean.

Menurut saya, penamaan variable dan class yang deskriptif dan bermakna
sangat penting karena tanpa penamaan yang jelas, sebuah program yang
kompleks akan menjadi teka-teki yang membingungkan. Misalnya, menamai
sebuah variable dengan 'a' jauh lebih beresiko menimbulkan kesalahan
logika dibandingkan menamainya dengan 'totalHarga'. Penamaan yang benar
juga membantu saya lebih memahami apa yang saya kerjakan dan ingin
lakukan karena tujuan dari kodenya lebih transparan.

Melalui materi operator aritmatika, saya mempelajari bagaimana java
mengeksekusi perhitungan matematis. Hal menarik yang saya temukan adalah
bagaimana java bisa menangani tipe data yang berbeda dalam operasi yang
sama. Operator seperti penjumlahan(+), pengurangan(-), perkalian(\*),
pembagian(/), dan modulus atau sisa bagi(%) bekerja sesuai urutan
prioritas matematika jika tidak menggunakan parentheses (seperti
penggunaan tanda kurung) untuk memperjelas urutan operasi.

Satu poin penting yang saya pelajari itu juga tentang perbedaan hasil
pembagian antara tipe data int dan double. Jika saya membagi dua
bilangan bulat yang memiliki tipe data int, java akan melakukan
pembagian integer(membuang angka di belakang koma), kita bisa mengubah
hasilnya agar desimal dengan cara *type casting*. *Type casting* itu
menggunakan (double) untuk mengubah variabel menjadi tipe desimal. Ini
adalah pemahaman konseptual yang sangat penting agar tidak terjadi
kesalahan perhitungan pada aplikasi yang membutuhkan presisi tinggi.

Dalam latihan yang saya kerjakan, saya mencoba mengimplementasikan
naming convention dan operator aritmatika dengan benar. Di sana, saya
menamai variabel dengan hargaSatuan bukan cuma h. Dan dalam memilih tipe
data, saya menggunakan int untuk hasil perkalian menghitung total pajak
karena pada saat deklarasi, pajak merupakan konstanta yang bernilai
double. Agar nilai desimalnya hilang dan dapat dikalikan untuk
menghasilkan nilai total pajaknya maka penulisan kodenya seperti ini,
int totalPajak = (int) (totalStok \* PAJAK); jika penulisannya hanya
seperti ini int totalPajak = (totalStok \* PAJAK); maka kodenya akan
error.

Kendala yang saya hadapi itu ketika ingin memahami materinya, karena
menurut saya butuh ketelitian saat membaca materinya agar benar-benar
paham akan materi pertemuan 4 ini.
