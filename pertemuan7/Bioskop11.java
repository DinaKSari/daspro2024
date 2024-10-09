import java.util.Scanner;
public class Bioskop11 {
    public static void main(String[] args) {
        double ttl_harga = 0, ttl_tiket = 0, beli_tiket=0, diskon = 0, ttl_semua = 0, hrg_diskon;
        String day;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Masukan jumlah tiket ");
            beli_tiket= sc.nextInt();
            if(beli_tiket > 0){
                if(beli_tiket > 4){
                diskon = 0.1;
                } else if(beli_tiket > 10){
                    diskon = 0.15;
                } 
            } else{
                System.out.println("input tidak valid, masukan lagi nilai yang valid");
                break;
            }
            ttl_tiket = beli_tiket + ttl_tiket;
            ttl_harga = ((50000-(50000 * diskon))*beli_tiket);
            ttl_semua = ttl_semua + ttl_harga ;
            sc.nextLine();
            System.out.println("end time? (y/n))");
            day = sc.nextLine();
            if(day.equalsIgnoreCase("y")){
                break;
            } else if(day.equalsIgnoreCase("n")){
                continue;
            } else{
                System.out.println("anda akan mengulang program, mohon masukan input yang benar jika ingin menghentikan program");
                continue;
            }

        } while(true);
        System.out.println("Total penjualan tiket hari ini " + (int)ttl_tiket);
        System.out.println("Total harga penjualan tiket hari ini " + ttl_harga +" rupiah");

    }
}
