import java.util.Scanner;

public class BioskopTugas20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        double harga, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            harga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                harga = harga - (harga * 0.15);
                System.out.println("Diskon 15%");
            } else if (jumlahTiket > 4) {
                harga = harga - (harga * 0.10);
                System.out.println("Diskon 10%");
            }

            System.out.println("Total bayar: Rp " + harga);

            totalTiket += jumlahTiket;
            totalPenjualan += harga;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
    }
}