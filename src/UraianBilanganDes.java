/**
 * Kelas untuk menampilkan uraian bentuk desimal dari bilangan.
 * Setiap digit diuraikan sesuai nilai tempatnya (10^n).
 */
public class UraianBilanganDes {

    /**
     * Menampilkan uraian desimal dari bilangan input.
     *
     * @param number bilangan desimal yang akan diuraikan
     */
    static void printDecimalDecomposition(int number) {
        String numStr = String.valueOf(number);
        StringBuilder decomposition = new StringBuilder();
        int length = numStr.length();
        for (int i = 0; i < length; i++) {
            if (i > 0) decomposition.append(" + ");
            decomposition.append("(")
                    .append(numStr.charAt(i))
                    .append("×10^")
                    .append(length - i - 1)
                    .append(")");
        }
        System.out.println(number + " = " + decomposition.toString());
    }
}
