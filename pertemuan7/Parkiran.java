import java.util.Scanner;
public class Parkiran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        double total = 0;


        do {
            System.out.println("_______________________");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.println("Masukan jenis kendaraan");
            jenis = sc.nextInt();
            if (jenis==1 || jenis==2){
                System.out.println("Masukan durasi");
                durasi = sc.nextInt();
                if(durasi >5){
                    total +=12500;
                } else {
                    if(jenis == 1){
                        total += durasi*3000;
                    } else if(jenis==2){
                        total += durasi *2000;
                    }
                }
            } else{
                System.out.println("Input tidak valid");
                break;
            }
        System.out.println("Total keseluruhan pembayaran Rp-." + total);
        } while (true);
        
    }
}
