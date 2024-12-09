import java.util.Scanner;

public class Percobaan2 {
        // Kode tambahan untuk hitung pangkat
    public static int hitungPangkat(int bilangan, int pangkat) {
        if (pangkat == 0) {
            System.out.print("");
            return 1; // Base case
        }
        System.out.print(bilangan + (pangkat == 1 ? " = " : " x "));
        return bilangan * hitungPangkat(bilangan, pangkat - 1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
