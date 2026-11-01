# Tugas 3 - Program Hitung Gaji Karyawan

Program sederhana menggunakan **Operator**, **IF**, dan **Array** untuk
menghitung gaji karyawan berdasarkan golongan dan jumlah jam lembur.

## Soal

Sebuah perusahaan memiliki tiga golongan karyawan:

| Golongan | Gaji Pokok   | Index Array `gaji` |
|----------|-------------:|:------------------:|
| A        | Rp5.000.000  | 0                  |
| B        | Rp6.500.000  | 1                  |
| C        | Rp9.500.000  | 2                  |

Jika karyawan lembur, gaji lembur dihitung dari persentase gaji pokok
yang disimpan pada Array `lembur` (`30, 32, 34, 36, 38`):

| Jam Lembur       | Persentase | Index Array `lembur` |
|------------------|-----------:|:--------------------:|
| 1 jam            | 30%        | 0                    |
| 2 jam            | 32%        | 1                    |
| 3 jam            | 34%        | 2                    |
| 4 jam            | 36%        | 3                    |
| 5 jam atau lebih | 38%        | 4                    |

## Cara Compile

```bash
javac Main.java
```

## Menjalankan Program

Setelah proses compile selesai, jalankan program dengan:

```bash
java Main
```

## Penjelasan Program

### 1. Membaca Input

Program menggunakan `Scanner` untuk membaca input dari pengguna:

```java
Scanner input = new Scanner(System.in);
```

### 2. Deklarasi Array

Gaji pokok dan persentase lembur disimpan dalam dua array:

```java
// index 0 = Golongan A, 1 = Golongan B, 2 = Golongan C
double[] gaji = {5000000, 6500000, 9500000};

// index 0 = 1 jam, 1 = 2 jam, ... 4 = >= 5 jam
int[] lembur = {30, 32, 34, 36, 38};
```

### 3. Menentukan Gaji Pokok (IF + Array)

Pengguna memasukkan golongan. Input diubah ke huruf besar dengan
`toUpperCase()`, sehingga input `a`, `b`, atau `c` tetap diterima.
Gaji pokok kemudian diambil dari array `gaji` sesuai golongan:

```java
if (golongan.equals("A")) {
    gajiPokok = gaji[0];
} else if (golongan.equals("B")) {
    gajiPokok = gaji[1];
} else if (golongan.equals("C")) {
    gajiPokok = gaji[2];
} else {
    System.out.println("Golongan tidak valid! Gunakan A, B, atau C.");
    ...
}
```

Jika golongan bukan `A`, `B`, atau `C`, program menampilkan pesan
`Golongan tidak valid! Gunakan A, B, atau C.` lalu berhenti.

### 4. Menentukan Persentase Lembur (IF + Array)

Pengguna kemudian memasukkan jumlah jam lembur. Persentase diambil dari
array `lembur`:

| Jam Lembur       | Persentase          |
|------------------|---------------------|
| 0 atau kurang    | 0% (tidak lembur)   |
| 1 jam            | `lembur[0]` = 30%   |
| 2 jam            | `lembur[1]` = 32%   |
| 3 jam            | `lembur[2]` = 34%   |
| 4 jam            | `lembur[3]` = 36%   |
| 5 jam atau lebih | `lembur[4]` = 38%   |

### 5. Menghitung Gaji (Operator Aritmatika)

Gaji lembur dan total gaji dihitung dengan rumus:

```java
double gajiLembur = gajiPokok * persenLembur / 100;
double totalGaji  = gajiPokok + gajiLembur;
```

### 6. Menampilkan Rincian Gaji

Hasil ditampilkan menggunakan `printf` dengan format `%,.0f` agar angka
memiliki pemisah ribuan dan tanpa angka desimal.

## Contoh Penggunaan

Input golongan `B` dengan lembur 3 jam:

```text
=== PROGRAM HITUNG GAJI KARYAWAN ===
Masukkan Golongan (A/B/C) : B
Masukkan Jam Lembur       : 3

=== RINCIAN GAJI ===
Golongan      : B
Gaji Pokok    : Rp. 6.500.000
Jam Lembur    : 3 jam
Persen Lembur : 34%
Gaji Lembur   : Rp. 2.210.000
Total Gaji    : Rp. 8.710.000
```

Perhitungan:

```text
Gaji pokok  = Rp6.500.000                 (gaji[1])
Lembur      = 6.500.000 x 34% = Rp2.210.000 (lembur[2])
Total       = 6.500.000 + 2.210.000 = Rp8.710.000
```

> Pemisah ribuan (`,` atau `.`) mengikuti pengaturan *locale* sistem
> yang menjalankan program.
