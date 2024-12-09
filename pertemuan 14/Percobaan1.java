public class Percobaan1 {
    // Fungsi faktorial dengan rekursif
    public static int faktorialRekursif(int n) {
        if (n == 1) return 1; // Base case
        return n * faktorialRekursif(n - 1);
    }

    // Fungsi faktorial dengan iteratif
    public static int faktorialIteratif(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }   
    public static void main(String[] args) {
        int angka = 5; // Contoh input
        System.out.println("Faktorial Rekursif: " + faktorialRekursif(angka));
        System.out.println("Faktorial Iteratif: " + faktorialIteratif(angka));
    }
}
