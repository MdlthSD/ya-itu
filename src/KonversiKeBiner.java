/**
 * Kelas untuk mengonversi bilangan desimal ke bentuk biner.
 * Menampilkan langkah-langkah proses pengurangan di setiap bit.
 */
public class KonversiKeBiner {

    /**
     * Mengonversi bilangan desimal menjadi biner dan menampilkan prosesnya.
     *
     * @param number bilangan desimal
     * @param power  pangkat dua terbesar yang ≤ number
     * @return representasi biner dalam bentuk String
     */
    static String convertToBinary(int number, int power) {
        StringBuilder binary = new StringBuilder();
        int temp = number;
        for (int i = power; i >= 0; i--) {
            int value = (int) Math.pow(2, i);
            if (temp >= value) {
                temp -= value;
                binary.append("1");
                System.out.println((temp + value) + " - " + value + " = " + temp + "   (a_" + i + " = 1)");
            } else {
                binary.append("0");
                System.out.println("a_" + i + " = 0");
            }
        }
        return binary.toString();
    }
}
