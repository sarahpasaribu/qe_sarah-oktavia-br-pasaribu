# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 15 program Kampus Merdeka di Alterra Academy

RESTful API

## RESTful API

**Pengenalan RESTful API**
API singkatan dari "Application Programming Interface".
API memungkinkan komunikasi dan pertukaran. sedangkan REST merupakan singkatan dari ("Representational State Transfer").

REST API adalah salah satu arsitektur yang ada di API (Application Programming Interface). Untuk REST atau Representational State Transfer sendiri menggunakan HTTP (Hypertext Transfer Protocol) sebagai media pertukaran data. Sehingga beberapa aplikasi tertentu yang sedang developer kembangan menggunakannya.

HTTP Response Code :
200 => Permintaan sudah diterima dan dipahami kemudian sedang diproses.

201 => Permintaan berhasil dan server membuat sumber/resource baru.

400 => Server tidak memahami sintaks/syntax permintaan dari klien.

401 => Unauthorized.

404 => Not Found.

405 => Metode Tidak Diperbolehkan (Method not allowed)
Metode yang ditentukan dalam permintaan tidak diperbolehkan.

500 => Permasalahan Internal Server (Internal server error)
Server mengalami galat/error dan tidak dapat memenuhi permintaan.

## Komponen pada REST API

**Method-Method dalam API**

### Method GET

Permintaan ini digunakan untuk mendapatkan sumber daya dari server. Jika melakukan permintaan GET, server mencari data yang Anda minta dan mengirimkannya kembali kepada Anda. Permintaan GET melakukan operasi READ. Ini adalah metode permintaan default.

### Method POST

Merupakan metode HTTP yang nantinya berfungsi dalam membuat data baru. Kemudian data tersebut dimasukan ke dalam body saat proses request.

Kedua permintaan ini digunakan untuk memperbarui sumber daya di server. Jika Anda melakukan permintaan PUT atau PATCH, server memperbarui entri dalam database dan memberi tahu Anda apakah pembaruan berhasil. Dengan kata lain, permintaan PUT atau PATCH melakukan operasi UPDATE.

### Method DELETE

Permintaan ini digunakan untuk menghapus sumber daya dari server. Jika melakukan permintaan DELETE, server menghapus entri dalam database dan memberi tahu apakah penghapusan yang dilakukan berhasil. Dengan kata lain, permintaan DELETE melakukan operasi hapus.

**Header**

Header digunakan untuk memberikan informasi kepada klien dan server. Header dapat digunakan untuk berbagai tujuan, seperti autentikasi dan memberikan informasi tentang konten isi.

**URL**

URL adalah bagaimana Anda mengidentifikasi hal-hal yang ingin Anda operasikan. Kita katakan bahwa setiap URL mengidentifikasi sumber daya. Ini adalah URL yang sama persis yang ditugaskan untuk halaman web.

**Body**

Data (terkadang disebut “body” atau “message”) berisi informasi yang ingin Anda kirimkan ke server. Opsi ini hanya digunakan dengan Request POST, PUT, PATCH atau DELETE.

## Jenis API Testing

Functionality : memvalidasi suatu fitur apakah sudah berfungsi atau tidak

Load Test : menguji kekuatan sesuatu sistem apakah mampu mengolah data dari beban yang diberikan.

Security : menguji API dari external threats.

Exploratory Testing : menguji API tidak sesuai rules aplikasi.

Validation Testing : menguji API dari verifikasi aspek produk, behaviour, dan efisiensi.
