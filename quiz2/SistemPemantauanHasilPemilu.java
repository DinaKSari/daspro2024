import java.util.Scanner;
public class SistemPemantauanHasilPemilu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calon, wilayah, i = 0, j= 0, pilihCal, pilihWil, pilMen;
        System.out.println("Masukan jumlah calon ");
        calon = sc.nextInt();
        System.out.println("Masukan jumlah wilayah ");
        wilayah = sc.nextInt();
        String namaWilayah[] = new String[wilayah];
        int Pungutan[][] = new int[calon][wilayah];
        sc.nextLine();
        //masukan nama wilayah
        for(i = 0; i<namaWilayah.length;i++){
            System.out.println("Masukan nama wilayah ke-" + (i+1));
            namaWilayah[i] = sc.next();
        }
        //tampilan menu
        System.out.println("=== Menu ===");
        System.out.println("1. Pemungutan Suara");
        System.out.println("2. Menampilkan tabel");
        System.out.println("Pilih 1-2 : ");
        pilMen = sc.nextInt();
        if (pilMen == 1) {
            System.out.println("=== Pemungutan Suara ===");
            System.out.println(" Pilih calon 0-" + (Pungutan.length-1));
            pilihCal = sc.nextInt();
            System.out.println("Pilih wilayah 0-" + (Pungutan[i].length-1));
            pilihWil = sc.nextInt();
            System.out.println("Masukan hasil suara : ");
            Pungutan[pilihCal][pilihWil] = sc.nextInt();
        } if (pilMen == 2) {
            for(i=1; i< Pungutan.length; i++){
                for(j=0; j< Pungutan[i].length; j++){
                    
                }
            }
        } else {
            System.out.println("masukan dengan benar ");
            System.out.println();
        }

    }
}