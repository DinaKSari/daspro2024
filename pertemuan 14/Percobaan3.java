import java.util.Scanner;

public class Percobaan3 {
    public static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) return saldo; // Base case
        return 1.11 * hitungLaba(saldo, tahun - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = sc.nextDouble();
        System.out.print("Masukkan jumlah tahun: ");
        int tahun = sc.nextInt();

        System.out.println("Saldo setelah " + tahun + " tahun: " + hitungLaba(saldoAwal, tahun));
    }
}
