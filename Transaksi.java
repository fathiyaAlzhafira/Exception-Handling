//Child class dengan konsep inheritance (mewarisi class Barang)
public class Transaksi extends Barang {
    int jumlahBeli;
    double total;

    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.jumlahBeli = jumlahBeli;
        this.total = hargaBarang * jumlahBeli;
    }

     // Method untuk menampilkan detail transaksi
    public void displayTransaksi() {
        super.displayBarang();
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: " + total);
    }
}
