import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input data transaksi
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Exception Handling
            if (hargaBarang < 0 || jumlahBeli < 0) {
                throw new IllegalArgumentException("Harga atau jumlah beli tidak boleh negatif.");
            }

            // Membuat objek transaksi
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Output
            System.out.println("\n=== Detail Transaksi ===");
            System.out.println("No Faktur: " + noFaktur);
            transaksi.displayTransaksi();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
