# Penjelasan
1. Menggunakan relative layout dapat meningkatkan pengalaman pengguna karena dapat berubah landscape atau vertikal
   
# Penjelasan kode kode
1. `android:layout_below="@+id/btn_toast"` berfungsi untuk menempatkan di bawah yang memiliki id btn_toast
2. `android:layout_alignParentLeft="true"` berfungsi untuk menentukan posisi kiri - kanan dan relatif terhadap parent dalam hal ini relativve layout
3. `android:layout_alignParentStart="true"` fungsinya sama seperti parent left yaitu untuk mengatur posisi kiri - kanan
4. `android:layout_toEndOf="@+id/btn_toast"` berfungsi untuk menentukan kiri - kanan tapi relatif terhadap  view lainnya, misal relatif terhadap btn_toast
5. `android:layout_centerHorizontal="true"` berfungsi untuk mengatur elemen ke pusat secara horizontal pada parent 

# Cara mengatasi Permasalahan Dependency 'androidx.appcompat:appcompat-resources:1.6.1' requires libraries and applications that depend on it to compile against version 33 or later of the Android APIs.'
1. Pertama cari di menu file yang terletak pada kiri atas
2. Cari Project Structure atau tekan Ctrl
