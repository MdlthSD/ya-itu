import java.util.Scanner;

/**
 * Kelas utama yang menjalankan keseluruhan proses konversi bilangan desimal
 * ke bentuk biner dan polinomial. Program akan terus berjalan hingga pengguna
 * memilih untuk berhenti.
 *
 * @author brona
 * @version 1.0
 */
public class Main {

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = InputBilangan.getInput(scanner);
            int power = CariPangkat2.getMaxPowerOfTwo(number);

            Penjelasan.printPowerExplanation(number, power);
            UraianBilanganDes.printDecimalDecomposition(number);

            System.out.println("\nProses konversi " + number + " ke biner:");
            String binary = KonversiKeBiner.convertToBinary(number, power);
            String polynomial = KonversiKePolinomial.convertToPolynomial(number, power);

            System.out.println("\nBentuk polinomial:");
            System.out.println(number + " = " + polynomial);
            System.out.println("\nBentuk biner dari " + number + " adalah: " + binary);

            if (!askContinue(scanner)) break;
            System.out.println();
        }

        System.out.println("Program selesai. Terima kasih!");
        scanner.close();
    }

    /**
     * Menanyakan kepada pengguna apakah ingin melakukan konversi lagi.
     *
     * @param scanner objek Scanner untuk membaca input pengguna
     * @return true jika pengguna ingin melanjutkan, false jika berhenti
     */
    private static boolean askContinue(Scanner scanner) {
        System.out.print("\nMau konversi lagi? (y/n): ");
        String lagi = scanner.next();
        return lagi.equalsIgnoreCase("y");
    }
}
