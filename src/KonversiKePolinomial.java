/**
 * Kelas untuk mengonversi bilangan desimal ke bentuk polinomial biner.
 * Bentuk polinomial menunjukkan setiap bit dikalikan dengan 2^n.
 */
public class KonversiKePolinomial {

    /**
     * Mengonversi bilangan desimal ke bentuk polinomial biner.
     *
     * @param number bilangan desimal
     * @param power  pangkat dua terbesar yang ≤ number
     * @return representasi polinomial dalam bentuk String
     */
    static String convertToPolynomial(int number, int power) {
        StringBuilder polynomial = new StringBuilder();
        int temp = number;
        for (int i = power; i >= 0; i--) {
            int value = (int) Math.pow(2, i);
            int bit = (temp >= value) ? 1 : 0;
            if (bit == 1) temp -= value;
            if (polynomial.length() > 0) polynomial.append(" + ");
            polynomial.append("(").append(bit).append("×2^").append(i).append(")");
        }
        return polynomial.toString();
    }
}
