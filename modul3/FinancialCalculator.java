import java.util.Scanner;

public class FinancialCalculator {

    // Method utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pemasukan: ");
        double income = scanner.nextDouble();

        System.out.print("Masukkan jumlah pengeluaran: ");
        double expense = scanner.nextDouble();

        double balance = calculateBalance(income, expense);

        System.out.printf("Saldo harian Anda adalah: %.2f%n", balance);
    }

    // Blok kode rumus perhitungan
    public static double calculateBalance(double income, double expense) {
        return income - expense; // Rumus saldo harian
    }
}
