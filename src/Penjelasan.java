/**
 * Kelas untuk menampilkan penjelasan mengenai pangkat dua terbesar
 * yang digunakan dalam proses konversi.
 */
public class Penjelasan {

    /**
     * Menampilkan penjelasan tentang pangkat dua terbesar dari bilangan desimal.
     *
     * @param number bilangan desimal
     * @param power  pangkat dua terbesar yang ≤ number
     */
    static void printPowerExplanation(int number, int power) {
        System.out.println("\nPenjelasan:");
        System.out.println("\tPangkat 2 terbesar ≤ " + number +
                " → 2^" + power + " ≤ " + number +
                " → " + (int)Math.pow(2, power) + " ≤ " + number);
    }
}
