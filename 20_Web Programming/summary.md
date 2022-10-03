# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 20 program Kampus Merdeka di Alterra Academy

# Web Programming

## 1. Introduction

- Front-End
  Merupakan suatu elemen pada webiste yang berperan memberikan tampilan menarik
- Back-End
  Merupakan suatu elemn pada website yang berperan dalam sistem di balik layar yang mengolah database dan juga server.

## 2. HTML

HTML merupakan standar yang digunakan untuk menampilkan halaman web

### 1. Kegunaan HTML

• Membuat struktur dari halaman website.
• Mengatur tampilan dan isi dari halaman web.
• Membuat tabel dengan tag HTML table.
• Membuat form HTML.
• Membuat gambar dengan canvas.
• Mempublikasikan halaman website secara online.

### 2. HTML Editors : Notepad, sublime, viscode

• <! DOCTYPE html> = berfungsi untuk mendefinisikan dokumen ini sebagai HTML5
• <html> = elemen root dari halaman HTML
• <head> = berisi informasi meta tentang dokumen
• <title> = menentukan judul untuk dokumen
• <body> = berisi konten halaman yang terlihat

### 3. TAG HTML

• Tag div : untuk konten
• Tag heading : <h1>-<h6> dan tag paragraf <p>
• Styling : <strong>=lebih tebal, <em>=italic, <s>=text garis tercoret>, <br>=garis baru
• tag link : <a href="">
• tag image : <img src="">
• tag list : <ol> <li> <ul type = "">
• tag form : <form><fieldsheet><label><input id="" type="" placeholder="">

## 3. CSS

### 1 Analogi CSS (Cascading Style Sheet)

CSS digunakan untuk menghias halaman web seperti color, size, font background, width, height, dll dan mengatur halaman web(float, align display, psosition)

### 2. Menambah file css

• External : <link rel=”stylesheet” href=”main.css”>
• Internal : Didefinisikan di dalam elemen <style>, di dalam bagian <head> atau <body>.
• Inline : <h1 style=”color: #19355f;”>Hello World</h1>
Syntax
h1{ color: pink; font-size: 15px; }

### 3. CSS Selector

• ID: (#) tiap elemen memiliki satu tag id, pada 1 halaman tidak boleh ada 2 penamaan id yang berbeda
• Class : (.) tag class dengan nama sama dapat digunakan berulang pada satu halaman satu elemen boleh punya class berbeda yang lebih dari satu

### 4. CSS Grouping

Teknik menuliskan perintah CSS dimana elemen yang memiliki style CSS yang sama akan dikelompokkan/digroupkan dengan elemen lainnya. Tujuannya ialah untuk meminimalisir penulisan perintah CSS yang sama secara berulang-ulang.

### 5. CSS Font

• Font : Menetapkan semua properti font dalam satu deklarasi
• Font-family : Menentukan kelompok font teks
• Font-size : Menentukan ukuran font teks
• Font-weight : Menentukan ketebalan untuk font teks
• Font-style : Menentukan font teks menjadi miring

### 6. CSS Background

- Background-color : Menetapkan warna background pada suatu elemen
- Background-image : Menentukan gambar background pada suatu elemen
- Background-repeat :Menentukan gambar background untuk di ulang
- Background-size : Menentukan ukuran gambar untuk background
- Background-position : Mengatur posisi awal gambar

### 7. CSS Link Event

- :hover = Kondisi style ketika mouse berada diatas elemen.
- :active = Style ketika link “a” ditekan.
- :visited = Style dimana elemen link “a” telah di kunjungi / di klik.

### 8. CSS Transisi

Transisi CSS ditujukan untuk mengubah value properti dengan lebih halus dalam durasi yang ditentukan

### 9. CSS Display

Ditujukan untuk tampilan dari elemen

- Block : Elemen block selalu dimulai pada baris baru. (dimulai dari kiri ke kanan).
- Inline-block : Elemen inline-block membutuhkan lebar sesuai yang diperlukan.
- None : Menyembunyikan elemen untuk tidak ditampilkan.

### 10. CSS Table

- Border : Menambahkan border pada table, th dan td
- Border-collapse : Membuat border menjadi single border
- :nth-child(even) : Membuat background stripe
