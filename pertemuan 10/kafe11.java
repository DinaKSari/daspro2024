import java.util.Scanner;

public class kafe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jumlah pesanan ");
        int N = sc.nextInt();
        String nama[]= new String[N];
        double harga[]= new double[N];  
        String menu[] = {"Brownis" , "Kopi", "Teh"};
        double total =0;
        int i=0;
        String key, answer, hasil;      
        System.out.println("------ Menu -----");
        for(int Y = 0;Y<menu.length;Y++){
            System.out.println((Y + 1) + ". " + menu[Y]);
        }
        System.out.println("Mencari menu? y/n");
        answer = sc.next();
        if(answer.equalsIgnoreCase("y")){
            System.out.println("Masukan nama menu yang ingin dicari: ");
            key = sc.next();
            for(int K = 0; K<menu.length;K++){
                if(key.equalsIgnoreCase(menu[K])){
                    hasil = menu[K];
                    System.out.println("Menu " + hasil + " tersedia.");
                    break;
                }
            }            
        } else{

        }

        do { 
            System.out.println("Masukan nama pesanan ke-" +(i+1));
            nama[i]=sc.next();
            sc.nextLine();
            System.out.println("-------------------------");
            System.out.println("Masukan harga pesanan ke-" +(i+1));
            harga[i]=sc.nextDouble();

            total += harga[i];
            i++;
        } while (i <N);
        System.out.println("--- Daftar Pesanan ---");
        for(int Z = 0;Z<N;Z++){
            System.out.print(nama[Z] + " , ");
        }
        System.out.println();
        System.out.println("ini harga keseluruhan " +total);
    }
}
