package pertemuan6;
import java.util.Scanner;
public class Pemilihan2Percobaan211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        double diskon;
        String member;
        int jumlah_beli;
        double total_bayar, harga;
        System.out.println("----------------");
        System.out.println("====MENU JTI====");
        System.out.println("----------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Paket bundling (Ricebowl + ice tea)");
        System.out.println("------------------");
        System.out.println("Masukan angka untuk memilih menu : ");
        menu = sc.nextInt();
        sc.nextLine();
        System.out.println("Apakah mempunyai member? y/n");
        member = sc.nextLine();
        System.out.println("------------------");
        if(member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon adalah 10%");
            if(menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                System.out.println("Jumlah beli : ");
                jumlah_beli = sc.nextInt();
            } else if(menu == 2){
                harga = 3000;
                System.out.println("Harga Ice tea = " + harga);
                System.out.println("Jumlah beli : ");
                jumlah_beli = sc.nextInt();
            } else if(menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
                System.out.println("Jumlah beli : ");
                jumlah_beli = sc.nextInt();
            } else{
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }

            //menghitung total bayar
            total_bayar = (harga - (harga * diskon))* jumlah_beli;
            System.out.println("Total bayar setelah diskon : " +total_bayar);
        }
        else if(member.equalsIgnoreCase("n")){
            if(menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                System.out.println("Jumlah beli : ");
                jumlah_beli = sc.nextInt();
            } else if(menu == 2){
                harga = 3000;
                System.out.println("Harga Ice tea = " + harga);
                System.out.println("Jumlah beli : ");
                jumlah_beli = sc.nextInt();
            } else if(menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
                System.out.println("Jumlah beli : ");
                jumlah_beli = sc.nextInt();
            } else{
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }
            // menghitung ttl byr
            System.out.println("Total bayar = " +harga * jumlah_beli);
        }
        else{
            System.out.println("Member tidak valid");
        }
        System.out.println("-----------------");
    }
}
