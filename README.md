# ut-algorpoj

## Cara Compile

Untuk melakukan compile program Java, jalankan perintah berikut:

```bash
javac Main.java
```

## Penjelasan Program

Program pada `Main.java` menghitung total penghasilan karyawan berdasarkan
golongan dan jumlah jam lembur.

### 1. Membaca Input

Program menggunakan `Scanner` untuk membaca input dari pengguna:

```java
Scanner input = new Scanner(System.in);
```

### 2. Menentukan Gaji Pokok

Pengguna memasukkan golongan karyawan (`A`, `B`, atau `C`). Gaji pokok
ditentukan berdasarkan golongan:

| Golongan | Gaji Pokok |
|----------|------------:|
| A        | Rp5.000.000 |
| B        | Rp6.500.000 |
| C        | Rp9.500.000 |

Jika golongan yang dimasukkan bukan `A`, `B`, atau `C`, program menampilkan
pesan `Golongan Tidak Valid` lalu berhenti.

### 3. Menentukan Persentase Lembur

Pengguna kemudian memasukkan jumlah jam lembur. Persentase lembur ditentukan
sebagai berikut:

| Jam Lembur | Persentase |
|------------|-----------:|
| Kurang dari 1 jam | 0% |
| 1 jam             | 30% |
| 2 jam             | 32% |
| 3 jam             | 34% |
| 4 jam             | 36% |
| 5 jam atau lebih  | 38% |

### 4. Menghitung Total Penghasilan

Nilai lembur dan total penghasilan dihitung menggunakan rumus:

```java
gajiLembur = gajiPokok * persen / 100;
total = gajiPokok + gajiLembur;
```

Hasil total penghasilan kemudian ditampilkan dalam format rupiah.

Contoh, jika golongan `A` dan jam lembur 2 jam:

```text
Gaji pokok  = Rp5.000.000
Lembur      = 5.000.000 x 32% = Rp1.600.000
Total       = Rp6.600.000
```

## Menjalankan Program

Setelah proses compile selesai, jalankan program dengan:

```bash
java LemburKaryawan
```

Catatan: method utama pada kode saat ini ditulis sebagai `static void main()`.
Agar dapat dijalankan menggunakan Java standar, deklarasinya seharusnya
ditulis sebagai berikut:

```java
public static void main(String[] args)
```
