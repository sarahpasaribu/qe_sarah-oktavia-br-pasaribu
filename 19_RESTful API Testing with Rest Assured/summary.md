# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 19 program Kampus Merdeka di Alterra Academy

# RESTful API Testing with Rest Assured

### REST

REST adalah singkatan dari REpresentational State Transfer. REST merupakan gaya arsitektur untuk menyediakan standar antara sistem komputer di web, sehingga memudahkan sistem untuk berkomunikasi satu sama lain.

### REST API

sendiri mungkin sudah lumayan paham dari penjelasan sebelumnya yaitu merupakan salah satu arsitektur dari API. Lalu REST atau Representational State Transfer ini memiliki keunggulan dalam pemakaiannya karena kemudahannya. Kemudahan tersebut berupa adanya coding yang tidak terlalu panjang dan ribet.

Kemudian data yang ada di dalam REST API ini dalam bentuk JSON (Javascript Object Notation) sehingga mobilitas data lebih cepat. Biasanya juga data – data yang ada bisa dalam bentuk XML dan YAML. Dalam REST API ini memiliki ketergantungan pada bagian tertentu seperti pengkodean bahkan fungsi khusus.

### Rest Assured

Rest Assured adalah teknologi open source yang sangat banyak digunakan untuk Pengujian Otomasi REST API, ini didasarkan pada perpustakaan berbasis java.

Rest Assured berinteraksi dengan Rest API dalam mode klien tanpa kepala, kita dapat meningkatkan permintaan yang sama dengan menambahkan lapisan yang berbeda untuk membentuk permintaan dan membuat permintaan HTTP melalui kata kerja HTTPS yang berbeda ke server.

#### Features

1. Supports for HTTP methods
2. Supports for BDD /Gherkin (GIVEN, WHEN, THEN)
3. Use of Hamcrest matches for checks (equalTo)
4. Use Gpath for selecting element from JSON response

### API Concept

1. User (Mobile App) melakukan request kepada Waiter API
2. Waiter (API) melakukan response terhadap User (Mobile App) dan melakukan request ke Kitchen (Application)
3. Kitchen (Application) melakukan response kepada Waiter (API)

### Fundamental API

Adapun Test Proses nya yaitu :

1. Melakukan record dan mendefinisikan Informasi API
2. Parsing , memfilter atau mereka API Data dan kemudian di extact
3. Rekonstruksi panggilan API dan mengirim nya dari simulasi klien
4. Lalu lakukan Test validasi
