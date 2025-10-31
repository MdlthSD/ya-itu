README – Program Konversi Bilangan Desimal ke Biner dan Polinomial
1️⃣ Kelas Main

Deskripsi:
Kelas utama yang menjalankan seluruh proses program konversi bilangan desimal ke biner dan polinomial.
Program berjalan berulang hingga pengguna memilih untuk berhenti.

Fungsi:

Mengatur alur program secara keseluruhan.

Memanggil kelas-kelas pendukung:
InputBilangan, CariPangkat2, Penjelasan, UraianBilanganDes, KonversiKeBiner, KonversiKePolinomial.

Menampilkan hasil konversi dan menanyakan apakah pengguna ingin mengulang.

Metode:

main(String[] args) → titik masuk utama program.

askContinue(Scanner scanner) → menanyakan kelanjutan program (y/n).

2️⃣ Kelas InputBilangan

Deskripsi:
Kelas untuk membaca input bilangan desimal dari pengguna.

Fungsi:

Melakukan input angka dengan menggunakan objek Scanner.

Metode:

getInput(Scanner scanner) → membaca dan mengembalikan nilai bilangan desimal yang dimasukkan pengguna.

3️⃣ Kelas CariPangkat2

Deskripsi:
Menentukan pangkat dua terbesar yang masih lebih kecil atau sama dengan bilangan desimal yang dimasukkan.

Fungsi:

Menentukan nilai maksimum dari 2^n yang ≤ bilangan input.

Metode:

getMaxPowerOfTwo(int number) → mengembalikan nilai pangkat dua terbesar.

Contoh:
Input = 19
Hasil: 2^4 = 16 ≤ 19, maka power = 4.

4️⃣ Kelas Penjelasan

Deskripsi:
Menampilkan penjelasan matematis mengenai pangkat dua terbesar yang ditemukan.

Fungsi:

Menampilkan hubungan antara bilangan input dan pangkat dua yang paling besar di bawahnya.

Metode:

printPowerExplanation(int number, int power)
→ contoh keluaran:
Pangkat 2 terbesar ≤ 19 → 2^4 ≤ 19 → 16 ≤ 19

5️⃣ Kelas UraianBilanganDes

Deskripsi:
Menjelaskan bentuk desimal dari bilangan dengan memecah setiap digit berdasarkan nilai tempatnya (10^n).

Fungsi:

Mengubah bilangan desimal menjadi bentuk uraian nilai tempat.

Metode:

printDecimalDecomposition(int number)
→ contoh keluaran:
245 = (2×10^2) + (4×10^1) + (5×10^0)

6️⃣ Kelas KonversiKeBiner

Deskripsi:
Melakukan konversi bilangan desimal ke bentuk biner, sekaligus menampilkan proses pengurangannya langkah demi langkah.

Fungsi:

Menampilkan setiap langkah perhitungan bit dari 2^n hingga 2^0.

Metode:

convertToBinary(int number, int power) → menghasilkan bentuk biner dan menampilkan prosesnya.

Contoh keluaran proses:

19 - 16 = 3   (a_4 = 1)
a_3 = 0
a_2 = 0
3 - 2 = 1   (a_1 = 1)
1 - 1 = 0   (a_0 = 1)


Hasil biner: 10011

7️⃣ Kelas KonversiKePolinomial

Deskripsi:
Mengonversi bilangan desimal ke bentuk polinomial biner, menunjukkan nilai setiap bit sebagai hasil kali dengan 2^n.

Fungsi:

Menampilkan bentuk ekspresi polinomial dari hasil konversi biner.

Metode:

convertToPolynomial(int number, int power) → menghasilkan bentuk polinomial.

Contoh keluaran:

(1×2^4) + (0×2^3) + (0×2^2) + (1×2^1) + (1×2^0)

8️⃣ Alur Program Singkat

Program meminta input bilangan desimal dari pengguna.

Mencari pangkat dua terbesar yang ≤ bilangan tersebut.

Menampilkan penjelasan pangkat dua tersebut.

Menampilkan uraian bentuk desimal.

Mengonversi bilangan ke biner dan menampilkan prosesnya.

Mengonversi bilangan ke bentuk polinomial.

Menanyakan apakah pengguna ingin melanjutkan atau keluar.

9️⃣ Contoh Hasil Output
Masukkan bilangan desimal: 19

Penjelasan:
Pangkat 2 terbesar ≤ 19 → 2^4 ≤ 19 → 16 ≤ 19
19 = (1×10^1) + (9×10^0)

Proses konversi 19 ke biner:
19 - 16 = 3   (a_4 = 1)
a_3 = 0
a_2 = 0
3 - 2 = 1   (a_1 = 1)
1 - 1 = 0   (a_0 = 1)

Bentuk polinomial:
19 = (1×2^4) + (0×2^3) + (0×2^2) + (1×2^1) + (1×2^0)

Bentuk biner dari 19 adalah: 10011