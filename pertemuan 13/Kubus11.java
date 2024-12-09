import java.util.Scanner;
public class Kubus11 {
     // Method untuk menghitung volume kubus
     public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    // Method untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan panjang sisi : ");
        double sisi = sc.nextInt();

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
