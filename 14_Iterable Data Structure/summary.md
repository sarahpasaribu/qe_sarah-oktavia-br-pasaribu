# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 14 program Kampus Merdeka di Alterra Academy

Iterable Data Structure

## Iterable Data Structure

## 1. Iterable

Iterable adalah objek yang memiliki iterator. Contoh iterable adalah array dan set. Iterator adalah properti dari objek yang menyediakan mekanisme untuk melintasi objek.Pada Gambar iterable diatas terjadi ketika dilakukan sebuah perulangan for yang membentuk variabel baru yaitu name untuk menyimpan variabel names lalu mencetak variabel name tersebut sehingga akan menghasilkan alterra untuk hasil pertama dan hasil kedua adalah academy.

<img src="assets/1.png" alt="soal prak sec 09" title="Jawaban Prak Section 14">

Interface
Class yang menggunakan object interface, class tersebut harus mengimplementasikan ulang seluruh fungsi yang ada di dalam interface. Dalam pemrograman berorientasi objek, penyebutan object interface sering disebut dengan interface

<img src="assets/2.png" alt="soal prak sec 09" title="Jawaban Prak Section 14">

Maksudnya adalah apabila menggunakan struktur data dari masing-masing implementasi tersebut, kita juga bisa menggunakan interface (set, list, dan deque) sebagai tipe data dari variabel tempat kita menyimpan kumpulan data tersebut.

Cara menggunakan interface iterable:
Method dalam kelas Iterable:

- forEach(Consumer<? super T>): void
- iterator(): Iterator<T>
- spliterator: Spliterator<T>

### Iterator

Interface iterable memiliki satu method iterator()
Iterator adalah kelas yang mengelola iterasi di atas iterable. itu mempertahankan keadaan di mana kita berada dalam iterasi saat ini, dan tahu apa elemen atau data selanjutnya yang akan diambil dan bagaimana mendapatkannya

## 2. Collection

Collection merupakan kumpulan dari objek atau data yang diletakkan dalam satu tempat yang sama (Collection of Objects).
Collection adalah setiap kelompok objek individu yang direpresentasikan sebagai satu unit adalah untuk mengetahui sebagai kumpulan objek

Method Collection
add()
addAll()
clear()
contains()
containsAll()
equals()
hashCode()
isEmpty()
Iterator()
remove()
removeAll()
stream()
toArray()

## 3. List

    1. Merupakan sebuah interface yang menyediakan cara untuk menyimpan data secara linear
    2. List merupakan turunan dari interface collection
    3. List juga menerima nilai yang sama , sehingga apabila meng-input 2kali data yang sama , tetap dapat dilakukan
    4. Urutan data pada list tergantung kapan data tersebut dimasukkan kedalam list, maka data yang dimasukkan pertama , akan menjadi urutan pertama , maka urutan selanjutnya akan menyusul ke urutan berikutnya.

    Method pada List :

    - Menambah
    - Menghapus
    - Mengecek

    Apakah data tersedia dalam list , dan mengecek apakah list yang satu sama dengan list yang lainnya .

    Implementasi dari interface List :

    - Abstract List
    - Array List
        - Menyediakan penyimpanan data yang dinamis artinya tidak terikat dengan kapasitas yang dapat disimpan oleh ArrayList tersebut
        - Data yang dimpan oleh ArrayList bisa sebanyak apapun , selama memori data dari komputer masih sanggup untuk menyimpan data tersebut

<img src="assets/3.png" alt="soal prak sec 09" title="Jawaban Prak Section 14">

Array List Work :

Step 1 : Pembuatan Array List (Array Initialization) yang data nya masih kosong

Step 2 : Menambah elemen pada Array List , maka masing2 posisi akan terisi

Step 3 : Ketika data sudah penuh , lalu kita tetap memaksa memasukkan data kedalam Array List maka,

Step 4 : Array List akan membuat array baru dan memindahkan seluruh data pada array tersebut

Step 5 : Akan dilakukan hal yang sama , jika kapasitas penyimpanan sudah penuh

Maka sebetulnya panjang dari Array List terbatas , tetapi Array List dapat memanjangkan dirinya sehingga seolah-olah data yang dapat disimpan iyu tidak terbatas

<img src="assets/4.png" alt="soal prak sec 09" title="Jawaban Prak Section 14">

Line 2 : terdapat variabel yang isi array list nya kosong

Line 3-5 : pada variabel tersebut , akan kita tambahkan 3 buah data

Line 6 : akan kita tampilkan pada layar data yang terletak pada urutan ke 2

Array List memberi urutan data mulai dari 0 , sehingga :

Urutan 0 = 17

Urutan 1 = 60

Urutan 2 = 30

Maka yang akan tampil ke layar adalah 30

<img src="assets/5.png" alt="soal prak sec 09" title="Jawaban Prak Section 14">

- Linkedlist
  - Merupakan struktur data yang menyimpan setiap elemen nya saling terhubung satu sama lain , cara Linked List menghubungkan satu elemen dengan elemen yang lainnya adalah dengan menyimpan alamat memori dari masing-masing elemen , baik elemen setelah atau sebelumnya .
  - Jadi apabila ada sebuah elemen terdapat dalam Linked List , pada elemen tersebut akan menyimpan alamat memori dari elemen yang sebelumnya
  - Lalu elemen sebelumnya juga akan menyimpan alamat memori dari elemen yang sebelumnya lagi

<img src="assets/6.png" alt="soal prak sec 09" title="Jawaban Prak Section 14">

### Perbedaan Array List dan Linked List :

1. Secara Structure /Alur :

   Pada Array List —> Terbentuk ruang kosong , lalu akan diisi data

   pada Linked List :

   - Berbentuk seperti gerbong kereta api , elemen pertama akan menyimpan data yang akan disimpan (tidak kosong)
   - menyimpan alamat memori data yang berikutnya, maka akan terhubung elemen satu dengan elemen yang lainnya

2. Secara Time Complexity :

<img src="assets/7.png" alt="soal prak sec 09" title="Jawaban Prak Section 14">

Ket :

- Accessing element :
  - Array List O(1) artinya konstan
  - Linked List O(n) artinya mengakses elemen yang memiliki kemungkinan untuk memerlukan waktu yang lebih lama
- Insert/remove from beginning
  - Array List O(n) artinya bisa lebih lama dari Linked List
  - Linked List memiliki waktu yang lebih cepat yaitu O(1)
- Insert / remove from end
  - Array List dan Linked List memiliki waktu yang sama
- Insert /remove from middle
  - Array List dan Linked List memiliki waktu yang sama

## 3. Stack

Stack menyimpan data secara linear tetapi dalam proses penambahan dan pengambilan datanya, menggunakan last-in-first-out (LIFO), artinya data yang baru dimasukkan akan dikeluarkan terlebih dahulu Contohnya tumpukan buku.

Method:

- Stack();
- empty(): boolean
- peek(): E, method untuk mengintip data
- pop(): E, method untuk mengambil data
- push(E) : E, method untuk menambah data
- search[Object]: Int
- serialVersion

## 4. Set

Set merupakan sebuah struktur data yang dapat menyimpan sekumpulan data secara linear seperti ist, tetapi set tidak dapat menerima data yang duplikat.

Comparing Set
HashSet Vs LinkedHashSet Vs EnumSet Vs TreeSet

<img src="assets/8.png" alt="soal prak sec 09" title="Jawaban Prak Section 14">

Method Hash Set
HashSet();
add()
clear();
close();
isEmpty();
iterator();

## LinkedHashSet

LinkedHashSet menggunakan double linked list di semua elemen. LinkedHashSet memungkinkan kita untuk melakukan iterasi melalui unsur-unsur dalam urutan di mana mereka dimasukkan (inserted).

## Enum set

- Hanya dapat berisi nilai enum dan semua nilai harus dimiliki oleh enum yang sama
- Memungkinkan untuk menambahkan nilai nol, melemparkan NullPointerException dalam upaya untuk melakukannya
- Bukan thread-safe, jadi kita perlu menyinkronkannya secara eksternal jika diperlukan
- Elemen-elemen disimpan mengikuti urutan di mana mereka dideklarasikan dalam enum

## Queue

- Antrian dapat didefinisikan sebagai daftar terurut yang memungkinkan operasi penyisipan dilakukan di satu ujung yang disebut REAR dan operasi hapus dilakukan di ujung lain yang disebut FRONT.
- Antrian termasuk First In First Out (FIFO)

## Dequeue

Dequeue adalah proses mengeluarkan satu elemen data dari suatu antrian.
Dequeue merupakan Proses Queue dalam Struktur Data yang berfungsi untuk menghapus elemen terdepan / pertama ( head ) dari antrian.
