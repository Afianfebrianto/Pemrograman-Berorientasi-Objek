import java.util.Scanner;

public class PBO02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input detik dari user
        System.out.print("Masukkan jumlah detik: ");
        int detik = input.nextInt();

        // Menghitung jumlah jam, menit, dan detik
        int jam = detik / 3600;
        int sisaDetik = detik % 3600;
        int menit = sisaDetik / 60;
        detik = sisaDetik % 60;

        // Menampilkan waktu dalam format jam:menit:detik
        System.out.printf("Waktu: %d:%02d:%02d", jam, menit, detik);
    }
}
