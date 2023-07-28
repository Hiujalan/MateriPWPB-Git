# Penjelasan tentang Hello Toast
  Project ini di buat pada hari rabu tanggal 26 Juli 2023, Project ini dibuat untuk menampilkan popup message Hello Toast dan untuk menambahkan angka

# penjelasan kode kode
1. `Context context = getApplicationContext();` berfungsi untuk mendapatkan informasi aplikasi saat ini ,lalu di masukkan di variabel context
2. `Toast.LENGTH_LONG` berdurasi 3,5 detik sedangkan `Toast.LENGHT_SHORT` berdurasi 2 detik
3. `public void showToast(View view) {}` merupakan hasil dari membuat onClick yang di alt + enter
4. `Toast toast = Toast.makeText(context, R.string.message_toast, Toast.LENGTH_LONG);` yang di urutkan menjadi `Toast toast` untuk membuat variabel toast, `Toast.makeText(context, "Hello Toast", Toast.LENGTH_LONG);` untuk membuat text dengan konteks, pesan, dan durasi text
5. `toast.show();` berfungsi untuk menampilkan pesan yang telah di buat dalam variabel toast
6. `private int mCount = 0;` berfungsi untuk membuat variabel private mCount dengan nilai 0
7. `private TextView mShowCount;` berfungsi untuk membuat variabel private mShowCount dengan nilai dari TextView
8. `mShowCount.setText(Integer.toString(mCount));` berfungsi untuk mensetel variabel mCount integer ke string
9. `mShowCount = (TextView) findViewById(R.id.show_count);` berfungsi untuk mencari TextView dengan id show_count lalu dimasukkan ke variabel mShowCount
