# Two Activities

  Two Activities merupakan aplikasi yang di gunakan untuk mengirim pesan ke halaman selanjutnya atau halaman menerima pesan ,dan juga mengirim kembali ke halaman sebelumnya atau halaman pertama

# Penjelasan

1. Tiap kali aktivitas baru dimulai, aktivitas sebelumnya akan dihentikan, namun sistem mempertahankan aktivitas dalam sebuah tumpukan atau di sebut juga back stack. Saat sebuah aktivitas baru dimulai, aktivitas baru itu akan didorong ke atas back-stack dan mengambil fokus pengguna. Back-stack mematuhi mekanisme dasar tumpukan yaitu masuk terakhir, keluar pertama, jadi jika pengguna selesai dengan aktivitas saat ini dan menekan tombol Back, aktivitas saat ini akan dikeluarkan dari tumpukan serta dimusnahkan dan aktivitas sebelumnya akan dilanjutkan.

2.  Intent adalah pesan asinkron yang bisa di gunakan dalam aktivitas untuk meminta tindakan dari aktivitas lain. intent di gunakan untuk memulai satu aktivitas dari aktivitas lainnya dan meneruskan data di antara aktivitas.

3. Ada dua jenis intent: eksplisit dan implisit. Intent eksplisit adalah intent yang targetnya telah di ketahui. Seperti sudah mengetahui nama kelas yang sepenuhnya memenuhi syarat dari aktivitas tersebut. Intent implisit adalah intent yang nama komponen targetnya tidak di ketahui, namun memiliki tindakan umum untuk dikerjakan

4. Semua aktivitas di aplikasi terhubung dengan satu sama lain. Namun, dapat juga di mendifinisikan sebuah aktivitas sebagai induk dari aktivitas lain dalam file AndroidManifest.xml. Hubungan induk-anak ini memungkinkan Android untuk menambahkan petunjuk navigasi seperti panah yang menghadap ke kiri pada bilah judul untuk setiap aktivitas.

# Penjelasan kode kode

1. `Log.d(LOG_TAG, "Button clicked!");` jika kode ini di letakkan di button dan di pencet maka akan menampilkan pesan di logcat yaitu Button Clicked!
2. `MainActivity.class.getSimpleName();` digunakan untuk mendapatkan nama class tanpa harus menuliskan nama paket lengkapnya. 
3. `android:parentActivityName=".MainActivity"` digunakan untuk memunculkan arrow back yang dapat kembali ke halaman utama
4. tag `<meta-data>` di gunakan untuk menghubungkan aktivitas tertentu dengan aktivitas induk 
5. dalam kode meta data yaitu `android:value="com.example.android.twoactivities.MainActivity"` di gunakan menetapkan bahwa MainActivity merupakan induk dari aktivitas ini


