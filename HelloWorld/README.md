# Penjelasan
     Project ini di buat untuk mengetest Handphone apakah bisa untuk di jadikan Hard Device, Project ini dibuat pada hari Senin tanggal 25 Juli 2023 
1. Fungsi dari Ekstrak Resource String adalah untuk memudahkan pembaruan konten, menghindari duplikasi kode atau string, dan memudahkan pembacaan kode
2. Fungsi dari debugging usb adalah untuk berinteraksi antara Handphone dan PC dengan perantara kabel USB

# Langkah langkah menghubungkan handphone menjadi Hard device dan menampilkan text hello world
1. Pertama sambungkan handphone dengan PC menggunakan kabel USB
2. Setelah itu atur ke terima file saja
3. lalu masuk ke pengaturan,cari menu sistem lalu masuk, setelah itu cari opsi pengembang
4. setelah masuk ke opsi pengembang cari mode Debugging USB lalu aktifkan
5.  klik oke jika muncul pemberitahuan
6.  setelah itu, masuk ke android studio
7.  buat project baru dengan menggunakan empty activity
8.  isikan nama project dengan nama Alan Aplication 1
9.  pilih bahasa pemograman java, lalu klik finish
10. setelah itu,cari device manager dibagian atas kanan, lalu masuk ke Physical
11. cari handphone kita yang telah kita sambungkan kabel USBnya, jika terdapat warna hijau maka handphone sudah menjadi harddevice dan siap digunakan
12. setelah itu klik run pada bagian atas kanan android studio, lalu cek handphone apakah sudah muncul aplikasinya
13. jika berhasil maka akan muncul aplikasi dengan nama Alan Aplication 1
14. setelah itu, buka aplikasi tersebut dan text hallo world telah muncul.

# Penjelasan kode - kode 
1. <pre><code>package com.hiujalan.helloworld</code></pre>
     berfungsi untuk mendeklarasikan sebuah paket yang didalamnya terdapat kelas kelas
2. <pre><code>import androidx.appcompat.app.AppCompatActivity;</code></pre> <pre><code>import android.os.Bundle;</code></pre> 
     digunakan untuk mengimpor kelas AppCompatActivity dan kelas bundle
3. <pre><code>setContentView(R.layout.activity_main);</code></pre>
     berfungsi untuk menghubungkan layout atau `activity_main.xml` dengan `MainActivity.java`
4.  <pre><code>@override</code></pre> menandakan bahwa metode di bawahnya telah di override
