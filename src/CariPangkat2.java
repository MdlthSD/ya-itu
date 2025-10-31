/**
 * Kelas untuk mencari pangkat dua terbesar yang lebih kecil atau sama
 * dengan bilangan yang diberikan.
 */
public class CariPangkat2 {

    /**
     * Menghitung pangkat dua terbesar yang masih kurang dari atau sama
     * dengan bilangan desimal yang diberikan.
     *
     * @param number bilangan desimal
     * @return nilai pangkat dua terbesar
     */
    static int getMaxPowerOfTwo(int number) {
        int power = 0;
        while (Math.pow(2, power) <= number) power++;
        return power - 1;
    }
}
