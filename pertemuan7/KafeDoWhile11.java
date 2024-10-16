import java.util.Scanner;
public class KafeDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String nama;
        double hrg_kopi=12000, hrg_teh=7000, hrg_roti=20000, ttl_hrg;
        do {
            System.out.println("Masukan nama pelanggan (ketik 'batal' untuk keluar)");
            nama = sc.nextLine();
            if(nama.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("Jumlah kopi ");
            kopi = sc.nextInt();
            System.out.println("jumlah teh ");
            teh = sc.nextInt();
            System.out.println("jumlah roti");
            roti = sc.nextInt();
            ttl_hrg= (kopi *hrg_kopi)+(teh*hrg_teh)+(roti*hrg_roti);
            System.out.println("Total harga yang harus dibayarkan adalah Rp-."+ttl_hrg);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai");
    }
}
