# Penjelasan tentang Hello Toast
1. `Context context = getApplicationContext();` berfungsi untuk mendapatkan informasi aplikasi saat ini ,lalu di masukkan di variabel context
2. `Toast.LENGTH_LONG` berdurasi 3,5 detik sedangkan `Toast.LENGHT_SHORT` berdurasi 2 detik
3. `Toast toast = Toast.makeText(context, R.string.message_toast, Toast.LENGTH_LONG);` yang di urutkan menjadi `Toast toast` untuk membuat variabel toast, `Toast.makeText(context, "Hello Toast", Toast.LENGTH_LONG);` untuk membuat text dengan konteks, pesan, dan durasi text
4. `toast.show();` berfungsi untuk menampilkan pesan yang telah di buat dalam variabel toast
