import java.util.Scanner;

/**
 * Kelas untuk menangani input bilangan dari pengguna.
 * Memastikan input berupa bilangan desimal (integer).
 */
public class InputBilangan {

    /**
     * Meminta pengguna memasukkan bilangan desimal melalui console.
     *
     * @param scanner objek Scanner yang digunakan untuk membaca input
     * @return bilangan desimal yang dimasukkan oleh pengguna
     */
    static int getInput(Scanner scanner) {
        System.out.print("Masukkan bilangan desimal: ");
        return scanner.nextInt();
    }
}
