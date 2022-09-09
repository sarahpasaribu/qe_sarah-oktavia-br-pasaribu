# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 10 program Kampus Merdeka di Alterra Academy

linux Basic Command

## Linux Basic Commands

## 1. Basic Commands

1. Implementasi Basic commands

   <img src="assets/1.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

cal = fungsi menampilkan kalender
date = menampilkan tanggal dan waktu yang tertera di OS kita.

NB : call tidak telihat hasilnya karena harus mendownload sudo apt install x11-apps

## 2. File System Commands

1. Implementasi basic commands

   <img src="assets/2.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

touch = membuat file baru yang kosong melalui baris perintah linux
maka, touch note_linux.txt = membuat file baru yang beformat txt yang bernama note_linux

2. Melihat bukti dari pembuatan note_linux.txt

<img src="assets/3.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

3. Membuat daftar konten atau isi file pada standard output.

   <img src="assets/4.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

4. Menyalin file dari directory saat ini ke directory yang berbeda

   <img src="assets/5.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

5. Memindahkan file meskipun sebenarnya bisa digunakan untuk mengganti / mengubah nama file

   <img src="assets/6.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

Maka kita akan cek pada folder documents

<img src="assets/7.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

Mengganti nama file

<img src="assets/8.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

6. Menghapus directory/file beserta isinya

   <img src="assets/9.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

7. Membuat directory baru

   <img src="assets/10.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

8. Menghapus directory yang kosong --> tidak berhasil karna ada file didalam
   <img src="assets/11.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

   Menghapus directory yang kosong
   <img src="assets/12.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

9. Menjelajahi file dan directory linux. Melihat path yang ingin di tracking
   <img src="assets/13.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

10. Mencari path dari directory yang kita gunakan saat ini
    <img src="assets/14.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

## 3. Processes Control Commands

1. Top berguna untuk menampilkan daftar proses yang berlangsung dan seberapa banyak ruang CPU yang digunakan tiap proses
   <img src="assets/15.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

2. Clear berguna untuk membersihkan terminal jika didalamnya sudah terdapat banyak sekali command

   Tampilan sebelum dihapus /clear
   <img src="assets/16.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

   Tampilan setelah dilakukan clear

   <img src="assets/17.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

3. History berguna untuk mengecek kembali command yang sudah ditambahkan sebelunya atau riwayat pembukaan di gitbash
   <img src="assets/18.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

## 4. Utilities Programs Commands

1. ls yaitu menampilkan semua file yang ada di directory kerja kita saat ini
   <img src="assets/19.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

2. Which berguna untuk mencari file yang akan dieksekusi tergantung dengan command yang diberikan atau dengan kata lain perintah yang digunakan untuk menemukan path secara lengkap dari file yang dicari.
   <img src="assets/20.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

3. chmod berguna untuk membaca , menulis, dan manjalankan permission dari file dan directory dengan kata lain mengganti izin akses terhadap suatu file atau directory.

   <img src="assets/21.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

4. chwon berguna untuk mengubah/ mentransfer kepemilikan file ke user yang spesifik. Karena kita tahu bahwa semua file dimiliki oleh user khusus.  
   <img src="assets/22.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

## SHELL SCRIPT

## CODE SHELL SCRIPT 1

1. Membuat nano program dengan cara dibawah ini
   <img src="assets/23.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">
   Maka akan muncul nano program yang telah kita buat
   <img src="assets/24.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

2. Lalu isi file "program_sarah.sh" seperti dibawah ini , yang menggunakan perintah "echo"
   <img src="assets/25.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

3. Kemudian run file program_sarah.sh, dan menampilkan hasil nano program yang telah dibuat sebelumnya
   <img src="assets/26.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

## CODE SHELL SCRIPT 2

1. Membuat nano program dengan cara dibawah ini

   <img src="assets/23.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

   Maka akan muncul nano program yang telah kita buat

   <img src="assets/24.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

2. Isilah file "program_sarah.sh" dengan seperti yang dibawah ini
   <img src="assets/27.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

3. Kemudian lakukan run file program_sarah.sh dengan command “cat” dan membandingkan dengan perintah file bash menggunakan ”.”
   <img src="assets/28.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

Keterangan :

- Perintah menjalankan file bash dengan (.) , maka isi file tidak akan dikenali karena bukan perintah linux
- Perintah “cat”, maka isi file akan terbaca karena terdapat perintah yang dikenali oleh linux yaitu perintah echo.

## CODE SHELL SCRIPT 3 penggunaan command “nano” + “echo +“read” + parameter dollar ($))

1. Buat text editor code program bernama “program_read.sh” dengan perintah “nano”
   <img src="assets/29.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

Maka akan muncul gambar seperti dibawah ini
<img src="assets/30.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

2. Isilah file “program_read.sh” dengan perintah “echo” + “read”
   <img src="assets/31.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

3. Lakukan run file program_read.sh dengan perintah "."
   <img src="assets/32.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

## CODE SHELL SCRIPT 4 dengan commad “nano” + “echo” + parameter dollar ($))

1. Membuat text editor code program bernama “program_passing.sh” dengan perintah “nano”
   <img src="assets/33.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

2. Membuat isi file "program_passing.sh" dengan perintah tanda # + "echo"
   <img src="assets/35.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

NB : Tanda dollar merupakan pemanggilan parameter

3. Melakukan run file program_passing.sh
   <img src="assets/36.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

NB : Menjalankan perintah file bash harus membuat isi parameternya. jika dilihat ada 3 parameter yaitu

- Sarah
- Oktavia
- 4

## CODE SHELL SCRIPT 5 dengan commad “nano” + “echo” + "let"

1. Buat text editor code program bernama “program_operasi.sh” dengan perintah “let”
   <img src="assets/37.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

Maka akan muncul tampilan GNU nano gitbash seperti dibawah ini
<img src="assets/38.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

2. Buat isi file “program_operasi.sh” dengan operasi penjumlahan dengan perintah “let”
   <img src="assets/39.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">

Gambar diatas menunjukkan bahwa akan melakukan operasi penjumlahan dengan nano program.

3. Lalu lakukan run pada program_operasi.sh
   <img src="assets/40.PNG" alt="Prak section 10" title="Jawaban Prak Section 10">
