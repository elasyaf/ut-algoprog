import java.util.Scanner;
class LemburKaryawan {
    static void main() {
        Scanner input = new Scanner(System.in);
        double gajiPokok;
        System.out.print("Masukkan Golongan (A/B/C): ");
        String gol = input.next().toUpperCase();
        if (gol.equals("A")) {
            gajiPokok = 5_000_000;
        } else if (gol.equals("B")) {
            gajiPokok = 6_500_000;
        } else if (gol.equals("C")) {
            gajiPokok = 9_500_000;
        } else {
            // Gol != a,b,c
            System.out.println("Golongan Tidak Valid");
            input.close();
            return;
        }

        int persen;
        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();
        if (jamLembur < 1) {
            persen = 0;
        } else if (jamLembur == 1) {
            persen = 30;
        } else if (jamLembur == 2) {
            persen = 32;
        } else if (jamLembur == 3) {
            persen = 34;
        } else if (jamLembur == 4) {
            persen = 36;
        } else { // jam_lembur >= 5
            persen = 38;
        }

        double gajiLembur = gajiPokok * persen / 100;
        double total = gajiPokok + gajiLembur;

        // Output
        System.out.printf("Jumlah Penghasilan   : Rp %,.0f%n", total);
        input.close();
    }
}
