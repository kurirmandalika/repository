import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KalkulatorKeuanganHarian {
    private List<Transaksi> transaksiList = new ArrayList<>();

    // Metode untuk menambahkan transaksi
    public void tambahTransaksi(Transaksi transaksi) {
        transaksiList.add(transaksi);
    }

    // Metode untuk menghitung total pemasukan
    public double hitungTotalPemasukan() {
        // ...
    }

    // Metode untuk menghitung total pengeluaran
    public double hitungTotalPengeluaran() {
        // ...
    }

    // Metode untuk menampilkan ringkasan
    public void tampilkanRingkasan() {
        // ...
    }

    public static void main(String[] args) {
        KalkulatorKeuanganHarian kalkulator = new KalkulatorKeuanganHarian();

        Scanner scanner = new Scanner(System.in);

        // Loop untuk terus meminta input transaksi
        while (true) {
            // ...
        }
    }
}