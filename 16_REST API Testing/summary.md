# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 16 program Kampus Merdeka di Alterra Academy

# REST API Testing

- API merupakan singkatan dari "Application Programming Interface".
- API merupakan penghubung antar komunikasi dan pertukaran data antara 2 atau lebih software/sistem yang terpisah.
- Tujuan : untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga developer tidak perlu membuat fitur yang serupa.
- **_API_** berperan sebagai pembawa pesan yang menerima permintaan dari pengguna dan memberi tahu sistem apa yang harus dilakukan lalu memberikan respon kepada pengguna berdasarkan request tersebut.
- **_REST (Representational State Transfer)_ merupakan** standard arsitektur komunikasi berbasis web yg sering digunakan dalam pengembangan aplikasi berbasis web. Umumnya menggunakan HTTP sebagai protocol komunikasi data.
- **REST merupakan implementasi** web service yang digunakan untuk pertukaran data maupun sistem. Dan HTTP juga dapat membatasi hak akses user dalam sebuah data.

- **HTTP METHOD**

  - Get : membaca data (Read only). (+) Tidak mengubah status data pada server.
  - Put : membuat/ mengganti data
  - Post : Membuat data baru
  - Delete : Menghapus data yang ada

- **METHOD-METHOD API**

  - **Method GET**
    Permintaan ini digunakan untuk mendapatkan sumber daya dari server. Jika melakukan permintaan GET, server mencari data yang Anda minta dan mengirimkannya kembali kepada Anda. Permintaan GET melakukan operasi READ. Ini adalah metode permintaan default.
  - **Method POST**
    Permintaan ini digunakan untuk membuat sumber daya baru di server. Jika Anda melakukan permintaan POST, server membuat entri baru dalam database dan memberi tahu Anda apakah pembuatannya berhasil. Dengan kata lain, permintaan POST` melakukan operasi CREATE. Method PUT dan
  - **Method PATCH**
    Kedua permintaan ini digunakan untuk memperbarui sumber daya di server. Jika Anda melakukan permintaan PUT atau PATCH, server memperbarui entri dalam database dan memberi tahu Anda apakah pembaruan berhasil. Dengan kata lain, permintaan PUT atau PATCH melakukan operasi UPDATE.
  - **Method DELETE**

    Permintaan ini digunakan untuk menghapus sumber daya dari server. Jika melakukan permintaan DELETE, server menghapus entri dalam database dan memberi tahu apakah penghapusan yang dilakukan berhasil. Dengan kata lain, permintaan DELETE melakukan operasi hapus.Header Header digunakan untuk memberikan informasi kepada klien dan server. Header dapat digunakan untuk berbagai tujuan, seperti autentikasi dan memberikan informasi tentang konten isi.URL URL adalah bagaimana Anda mengidentifikasi hal-hal yang ingin Anda operasikan. Kita katakan bahwa setiap URL mengidentifikasi sumber daya. Ini adalah URL yang sama persis yang ditugaskan untuk halaman web.Body Data (terkadang disebut “body” atau “message”) berisi informasi yang ingin Anda kirimkan ke server. Opsi ini hanya digunakan dengan Request POST, PUT, PATCH atau DELETE.

    1. ### 200 => berarti permintaan telah berhasil (POST & PUT)\*\*
    2. ### 300 => berarti permintaan dialihkan ke URL lain.\*\*
    3. ### 400 => berarti telah terjadi kesalahan yang berasal dari klien, kesalahan format (POST & PUT).\*\*
    4. ### 401 => Unauthorized (Tidak melalukan authentikasi terlebih dahulu sebelum melakukan request).\*\*
    5. **404 => Resource Not Found.**
    6. ### 405 => Method not allowed. (Mis: seharusnya kita memakai method POST namun kita melakukan kesalahn yaitu yang kita pakai adalah method PUT.)
    7. ## 500 => Ada kesalahan yang terjadi dan berasal dari server.\*\*

- **JENIS API TESTING**

  1. ***Functionality* :** memvalidasi suatu fitur apakah sudah berfungsi atau belum.
  2. ***Load Test* :** menguji kekuatan sesuatu sistem apakah mampu mengolah data dari beban yang diberikan.
  3. ***Security* :** Menguji keamanan untuk suatu sistem.

  - **API TESTING TOOLS**

  1. Postman
  2. Frisby.js
  3. REST-assured
  4. APACHE-JMeter

  - **API TESTING PROCESS**

  1. **Spesification Review** : mereview spesifikasi API dan use case document
  2. **Test Spesification Development** : memastikan detail document test condition dan expectation hasilnya di setiap test case
  3. **Tes Framework Development** : memilih untuk memakai tools apa dalam API testing nanti
  4. **Test Case Development** : Buat tes scenario dan tes case
  5. **Execution & Report** : Membuat report untuk hasil testing yang sudah dilakukan
