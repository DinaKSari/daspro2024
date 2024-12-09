import java.util.Scanner;
public class TotalNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah angka
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = scanner.nextInt();

        // Input angka-angka
        int[] numbers = new int[n];
        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            numbers[n - i] = scanner.nextInt();
        }

        // Menghitung total dengan iterasi
        int totalIterative = jumlahIteratif(numbers);

        // Menghitung total dengan rekursi
        int totalRecursive = jumlahRekursif(numbers, n);

        // Menampilkan hasil
        System.out.println("Total dari " + n + " angka yang dimasukkan (Iteratif) adalah: " + totalIterative);
        System.out.println("Total dari " + n + " angka yang dimasukkan (Rekursif) adalah: " + totalRecursive);

        scanner.close();
    }

    // Fungsi iteratif untuk menghitung total
    public static int jumlahIteratif(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // Fungsi rekursif untuk menghitung total
    public static int jumlahRekursif(int[] numbers, int n) {
        if (n == 0) {
            return 0; // Basis kasus: jika tidak ada angka
        }
        return numbers[n - 1] + jumlahRekursif(numbers, n - 1); // Penjumlahan angka terakhir
    }
}
