import java.util.Scanner;
public class latihanPemilihan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.println("masukan sebuah angka");
        angka = sc.nextInt();
        String hasil;
        hasil = (angka % 2 == 0) ? " termasuk angka genap" : " termasuk angka ganjil";
        System.out.println("angka = " + angka + hasil);
}
}
