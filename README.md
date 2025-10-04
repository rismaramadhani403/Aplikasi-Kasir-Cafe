<h1>Aplikasi-Kasir-Cafe</h1>
<div align="Justify">Aplikasi Kasir Cafe adalah program berbasis Java yang dirancang untuk membantu proses transaksi di sebuah kafe. Aplikasi ini memungkinkan kasir untuk memilih menu makanan dan minuman, menghitung total harga pesanan, serta menampilkan struk pembayaran secara otomatis.</div>
<h3>Penjelasan Kasir Cafe</h3>
<div align="Justify">Proyek ini mengimplementasikan konsep Pemrograman Berorientasi Objek (PBO) seperti class, object, constructor, method, dan array dalam satu sistem terintegrasi. Data menu disimpan dalam array, proses perhitungan dilakukan dengan looping dan kondisional, serta terdapat penggunaan string untuk menampilkan format output yang rapi.
Dengan menggunakan aplikasi ini, seorang kasir dapat menjalankan semua fitur utama:</div>
  
1. Saat program dijalankan, seorang kasir dapat melihat daftar menu makanan dan minuman.
2. Kasir dapat memilih item berdasarkan nomor menu.
3. Program akan menambahkan pesanan ke dalam keranjang (Cart) menggunakan array.
4. Kasir dapat menambah lebih dari satu item, menggunakan looping untuk melanjutkan pemesanan.
5. Setelah selesai, program menampilkan total harga dan struk pembelian dengan format string rapi.
6. Jika pengguna memasukkan input yang salah, exception handling (try–catch) akan menangkap dan menampilkan pesan error.

<h3>Diagram Class</h3>
Struktur package dan class:
<pre>Aplikasi-Kasir-Cafe/
│
├── app/
│   └── Main.java                
│
├── exception/
│   └── ValidationException.java 
│
├── model/
│   ├── MenuItem.java                   
│   └── CartItem.java               
│
├── service/
    └── CafeService.java</pre>
<h3>Contoh Penggunaan Fitur Utama</h3>
<h4>1. Lihat Menu</h4>
<img width="352" height="387" alt="Screenshot 2025-10-04 060955" src="https://github.com/user-attachments/assets/0b5e5660-e064-4f71-b17b-630b8aa0cd31" />
<h4>2. Tambah Pesanan</h4>
<img width="372" height="277" alt="Screenshot 2025-10-04 061153" src="https://github.com/user-attachments/assets/628bb06f-04c6-4644-b1a3-27ac8c6630f1" />
<h4>3. Lihat Keranjang</h4>
<<img width="388" height="282" alt="Screenshot 2025-10-04 061213" src="https://github.com/user-attachments/assets/5d51a7fa-b377-47b4-a9cf-2d5adb8f0761" />
<h4>4. Checkout</h4>
<img width="542" height="380" alt="Screenshot 2025-10-04 061237" src="https://github.com/user-attachments/assets/ed1d84bc-a37e-48dc-bbc8-450fad838a32" />
<h4>0. Keluar</h4>
<img width="451" height="340" alt="Screenshot 2025-10-04 061348" src="https://github.com/user-attachments/assets/2eadc19a-a03a-42b9-b139-51ad4343910a" />
<h3>Link video Youtube</h3>
Link:
