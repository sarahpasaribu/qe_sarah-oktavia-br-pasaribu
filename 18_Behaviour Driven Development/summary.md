# qe_sarah-oktavia-br-pasaribu

Pengerjaan resume Section 18 program Kampus Merdeka di Alterra Academy

# Behaviour Driven Development

BDD tidak hanya membantu untuk mendevelop software dengan benar, tetapi memastikan bahwa tahap mendevelop perangkat lunak yang benar.

BDD Format : Menggunakan bahasa gherkin yang menggunakan bahasa inggris Non technical dapat memahami dan membaca fitur dari sistem yang diaplikasikan

1. User Story ==> menjelaskan kebutuhan pengguna dan menjelaskan fungsionalitas pengguna

2. As a
   I want
   So That
   contoh : As an existing user, Iwant to login, so that i can see may homeopage

3. Menuliskan scenario ==> menggunakan gherkin bdsrkan user story

Mengimplementasikan test script dalam setiap file berdasarkan scenario

Untuk Test Script pada BDD Harus terdapat User story dan Scenario nya : User story:

4. Scenario dalam BDD :

Given ==> menjelaskan kondisi awal sebelum pengguna akan melakukan aksi
When ==> aksi yang dilakukan pengguna
And ==> aksi lanjutan yang dilakukan pengguna
Then ==> ekspektasi dari aksi yang dilakukan pengguna
Contoh :

Given : I go to Login page
When : I fill corect username & Password
Then : I see my homepage
