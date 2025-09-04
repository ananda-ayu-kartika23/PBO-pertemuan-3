# 📝 Deskripsi Tugas PBO - Pertemuan 3

Pada pertemuan ketiga mata kuliah **Pemrograman Berbasis Objek (PBO)**, tugas ini berfokus pada penerapan **abstract class**, **override**, dan **overload** dalam Java.  
Dalam proyek ini saya membuat sebuah class konkret Mangga yang merupakan turunan dari class abstract TumbuhanBerbiji serta mengimplementasikan beberapa interface, yaitu DapatBerbuah, DapatBerbunga, dan DapatTumbuhCepat.
Di dalam class Mangga terdapat implementasi dari method-method abstract yang diwarisi dari superclass TumbuhanBerbiji, seperti berkembangBiak(), jenisAkar(), dan jenisBiji(). Selain itu, karena class ini juga mengimplementasikan beberapa interface, maka diwajibkan untuk menuliskan method yang ada di interface tersebut, yaitu berbuah(), berbunga(), dan tumbuhcepat().

Dalam Tugas ini saya juga membuat Program ini terdiri dari abstract class Hewan yang memiliki method abstract bergerak() dan beberapa method info() dengan parameter berbeda sebagai contoh overloading.
Class Kucing mewarisi Hewan dan mengimplementasikan method bergerak(), sehingga menjadi contoh overriding.
Pada main(), objek Kucing dipakai untuk menampilkan hasil override (bergerak()) serta overload (info() dengan berbagai parameter). Program ini menunjukkan perbedaan jelas antara overload dan override dalam Java.

## 🔹 Abstract Class
**Pengertian:**  
Abstract class adalah kelas yang tidak dapat dibuat objeknya secara langsung. Fungsinya sebagai **kerangka dasar (template)** yang akan diwarisi oleh subclass. Abstract class bisa memuat:
- Metode abstrak → hanya deklarasi tanpa isi, wajib diimplementasikan oleh subclass.  
- Metode biasa → sudah memiliki isi dan bisa langsung digunakan.  
- Atribut → untuk menyimpan data yang bisa diwariskan.  

 ## Overload
Overload terjadi ketika dalam sebuah kelas terdapat beberapa metode dengan nama yang sama, tetapi memiliki parameter yang berbeda jumlah atau tipenya.

## Override
Override adalah proses ketika subclass menuliskan ulang sebuah metode yang sudah ada di superclass. Tujuannya untuk menyesuaikan atau mengganti perilaku default dari metode tersebut sesuai dengan kebutuhan subclass.
