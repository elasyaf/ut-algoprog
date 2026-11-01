import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array gaji pokok: index 0 = Golongan A, 1 = Golongan B, 2 = Golongan C
        double[] gaji = {5000000, 6500000, 9500000};

        // Array persen lembur: index 0 = 1 jam, 1 = 2 jam, ... 4 = >= 5 jam
        int[] lembur = {30, 32, 34, 36, 38};

        System.out.println("=== PROGRAM HITUNG GAJI KARYAWAN ===");
        System.out.print("Masukkan Golongan (A/B/C) : ");
        String golongan = input.next().toUpperCase();

        // Menentukan gaji pokok berdasarkan golongan (IF + Array)
        double gajiPokok;
        if (golongan.equals("A")) {
            gajiPokok = gaji[0];
        } else if (golongan.equals("B")) {
            gajiPokok = gaji[1];
        } else if (golongan.equals("C")) {
            gajiPokok = gaji[2];
        } else {
            System.out.println("Golongan tidak valid! Gunakan A, B, atau C.");
            input.close();
            return;
        }

        System.out.print("Masukkan Jam Lembur       : ");
        int jamLembur = input.nextInt();

        // Menentukan persen lembur berdasarkan jam lembur (IF + Array)
        int persenLembur;
        if (jamLembur <= 0) {
            persenLembur = 0;
        } else if (jamLembur == 1) {
            persenLembur = lembur[0];
        } else if (jamLembur == 2) {
            persenLembur = lembur[1];
        } else if (jamLembur == 3) {
            persenLembur = lembur[2];
        } else if (jamLembur == 4) {
            persenLembur = lembur[3];
        } else { // jamLembur >= 5
            persenLembur = lembur[4];
        }

        // Operator aritmatika untuk menghitung gaji lembur dan total gaji
        double gajiLembur = gajiPokok * persenLembur / 100;
        double totalGaji = gajiPokok + gajiLembur;

        System.out.println("\n=== RINCIAN GAJI ===");
        System.out.println("Golongan      : " + golongan);
        System.out.printf("Gaji Pokok    : Rp. %,.0f%n", gajiPokok);
        System.out.println("Jam Lembur    : " + jamLembur + " jam");
        System.out.println("Persen Lembur : " + persenLembur + "%");
        System.out.printf("Gaji Lembur   : Rp. %,.0f%n", gajiLembur);
        System.out.printf("Total Gaji    : Rp. %,.0f%n", totalGaji);

        input.close();
    }
}
