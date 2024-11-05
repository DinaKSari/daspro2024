import java.util.Scanner;

public class kafe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jumlah pesanan ");
        int N = sc.nextInt();
        String nama[]= new String[N];
        double harga[]= new double[N];
        double total =0;
        int i=0;
        do { 
            System.out.println("Masukan nama pesanan ke-" +(i+1));
            nama[i]=sc.nextLine();
            sc.nextLine();
            System.out.println("-------------------------");
            System.out.println("Masukan harga pesanan ke-" +(i+1));
            harga[i]=sc.nextDouble();

            total += harga[i];
            i++;
        } while (i <N);
        System.out.println("ini harga keseluruhan " +total);
    }
}
