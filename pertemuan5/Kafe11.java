import java.util.Scanner;
public class Kafe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        System.out.println("masukan menu ");
        menu = sc.nextLine();
        System.out.println("Masukan ukuran cup ");
        ukuranCup = sc.next().charAt(0);
        System.out.println("Masukan jumlah ");
        jumlah = sc.nextInt();
        System.out.println("Masukan keanggotaan True/false ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;
        switch (menu.toLowerCase()){
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        double totalHarga = hargaMenu * jumlah;
        switch (ukuranCup){
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("size tidak tersedia");
                break;
        }
        double diskon = keanggotaan ? 0 : 0.1;
        double nominamBayar = totalHarga - (diskon * totalHarga);
        System.out.println("Item pembelian " +jumlah + " " +menu + " dengan ukuran cup " +ukuranCup);
        System.out.println("Nominal bayar " +nominamBayar);
    }
}