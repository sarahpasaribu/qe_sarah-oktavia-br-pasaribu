# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 10 program Kampus Merdeka di Alterra Academy

Agile Testing

## Linux Basic Commands

- Introduction Linux Commands
- Kind of Commands Linux
- File Access Permissions

**Shell Script**

- Introduction Shell Script
- why we learn shell script
- demo

Definisi Linux Commands :

Sebuah utilitas dari sistem operasi linux , semua tugas dasar dan lanjutan dapat dilakukan dengan linux commands.

Commands dijalankan di terminal linux . Terminal merupakan antarmuka baris perintah untuk berinteraksi antar sistem yang mirip dengan command prompt di Windows OS .

Commands di linux sensitif terhadap huruf besar maupun huruf kecil

Command line dipenuhi oleh kata2 dan lebih berguna dalam kecepatan dibanding GUI.

Kelebihan dari command line :

1. Less Resources

   Command line ringan digunakan sehingga tidak mengharuskan komputer untuk memiliki spesifikasi tinggi jika menggunakan command line.

2. Repetitive Task Friendly

   Kita dapat menyimpan script untuk mengotomatis kan tugas yang sama berulang kali

3. Powerful

   Karna hanya menggunakan teks antarmuka sistem operasi ini terlihat lebih stabil dibandingkan GUI

   Aktivitas ini tidak memakan akses memori yang banyak . Banyak perusahaan yang menggunakan command line karena tingkat stabilnya , misalnya Debian

syntax yang digunakan dalam linux :

command [options][parameters]

contoh

> ls -a /usr

> ls -a -l

> ls -al

Macam-macam command linux :

- Basic Command
  - **cal** : fungsi menampilkan kalender
  - **date** : menampilkan tanggal dan waktu yang tertera di OS kita,dll
- **File System Commands**

  - **touch** : **membuat file baru yang kosong melalui baris perintah linux**
    **touch / home / username /web.html**
    membuat file html berjudul web dibawah directory dokumen
  - **cat** : **membuat daftar konten atau isi file pada standard output.**
    **cat nama_file.txt**
  - **cp** : **menyalin file dari directory saat ini ke directory yang berbeda**
    **cp / sinery.jpg /home / username / pitcure**
    **cp / namafile / directory tujuan**
    menyalin sinery.jpg ke directory ini ke directory pitcure
  - **mv** : **memindahkan file meskipun sebenarnya bisa digunakan untuk mengganti / mengubah nama file**

    1. memindahkan file

       **mv / nama.txt /home / username / document**

    2. mengganti nama file

       **mv / nama.txt nama_baru.txt**

  - **rm** : **menghapus directory beserta isinya.** Namun harus berhati-hati saat kita berada di directory yang ingin dihapus, karena nantinya jika sudah dihapus tidak dapat dikembalikan.

  - **mkdir** : **membuat directory baru.**
    **mkdir music**
    maka directory baru yang muncul ialah music.
  - **rmdir** : **menghapus directory. Namun hanya boleh digunakan untuk menghapus directory yang KOSONG saja.**

  - cd : menjelajahi file dan directory linux. Memerlukan path penuh nama directory tergantung nama directory saat ini kita berada.
    saat ini berada pada : /home/username/documents
    ingin membuka : photos di directory documents
    cara : cd photos
  - pwd : mencari path dari directory yang kita gunakan saat ini. Command ini akan mengembalikan path yang absolut yang pada dasarnya merupakan path semua directory yang diawali dengan garis miring.
    /home / username /

Structure commands linux :

- ls —> berfungsi untuk menampilkan semua file yang ada directory kerja, namun prakteknya yaitu command tanpa option dan parameter hampir tidak berguna , karena kita membutuhkan directory file khusus/daftar file dari directory tertentu pada isi yang kompleks.
  Jika tanpa menggunakan option dan parameters mungkin kita membutuhkan directory khusus atau daftar file
- cd

1. Buka terminal dan masukkan myscript.sh

echo —> sebuah command untuk mengabaikan semua kalimat yang akan kita buat

- ‘#!/bin/sh’ —> header untuk shell script
- > > [my-script.sh](http://myscript.sh) —> untuk menambahkan ke file , dengan nama file myscript.sh

1. Lalu buat echo hello world dan masukkan ke [my-script.sh](http://my-script.sh)
2. Kemudian cat [my-script.sh](http://my-script.sh)

   maka muncul header dan command “hello world”

3. ketik ls —> Untuk melihat file yang telah kita buat
4. ./my-script.sh —> untuk menjalankan script ini
5. ls -al —> permission yang dimiliki oleh [my-script.sh](http://my-script.sh)

   Tidak ada huruf x di my-script .sh, karena huruf x untuk execute sebuah file

   1. ubah permission dengan command

      “chmod 755 my-script.sh”

      “ls -al”

      Terdapat hirif x, maka bisa meng-eksekusi file yang telah kita buat tadi

   2. Lalu cek kembali file dengan command ./my-script.sh , maka muncul hello world , karena echo berguna untuk mengabaikan kata ataupun kalimat
