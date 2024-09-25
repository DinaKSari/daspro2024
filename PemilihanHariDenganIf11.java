import java.util.Scanner;
public class PemilihanHariDenganIf11 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int angka;
        System.out.println("Masukan angka ");
        angka = sc.nextInt();
        if(angka >0 && angka<6){
            System.out.println(angka + " adalah weekday");
        }
        else if(angka>5 && angka<8){
            System.out.println(angka + " adalah weekend");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
