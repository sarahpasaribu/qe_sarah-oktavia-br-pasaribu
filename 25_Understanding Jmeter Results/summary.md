# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 25 program Kampus Merdeka di Alterra Academy

# Understanding Jmeter Results


## Introduction to JMeter

Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk membuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya.


Aplikasi open source berbasis Java yang dapat dipergunakan untuk performance test. Bagi seorang QA Engineer jMeter bisa digunakan untuk melakukan load/stress testing Web Application, FTP Application dan Database server test.

jMeter bisa dijalankan dengan 2 cara, dengan GUI atau non-GUI ( Command line ). Untuk beginner lebih baik saya sarankan menggunakan cara yang pertama. Mudah dan tanpa melakukan scripting tertentu. Tinggal membuat Test Plan, mengisikan berapa thread & sample yang akan diujicobakan, running dan menganalisa hasil/report.

### Pros of Jmeter

- Open source
- Easy to use GUI/Non GUI

### Cara Install tools

- Install JDK (Java Development KIt) Software for compile java code
- Search Jmeter
- Download file , Find the binary and download file apache-jmeter.zip
- Open file, Extract file apache-jmeter.zip by double click it

### Open JMeter

- Open terminal
- Navigate to the bin folder cd this/is/your/folder apache-jmeter-version/bin
- Run JMeter .\jmeter.bat


### Open JMeter

Some components of JMeter script

- Test plan, rencana besar tes yang akan dilakukan (paarent)

- Thread Groups, Kumpulan yang menjalankan skenario yang sama

- Samplers, sebutan untuk request yang dikirim ke server
Config elements, Elemen yang digunakan untuk konfigurasi atau modifikasi sampler requests yang dikirim ke server

- Listeners, perekam data yang dihasilkan dari tes

- Timers, fitur ini akan jalan duluan sebelum semua fitur yang lain berjalan

- Assertions, seperti assert API/Web/Testing, merupakan kriteria tambahan apakah pass/tidak

- Pres-post-processors, fitur yang memproses renponse data sebelum/sesudah tes.


### Enable HTTPS Test Script recorder
- Click on the HTTP(S) Test Script Recorder (1)
- Then, select toggle (2) to enable HTTPS (S) Test Script recorder

