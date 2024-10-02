package pertemuan6;
import java.util.Scanner;
public class Pemilihan2Percobaan111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun;
        System.out.println("Masukan tahun : ");
        tahun = sc.nextInt();
        if((tahun % 4)== 0){
            if((tahun % 100)!= 0){
                System.out.println("Tahun kabisat");
            } else{
                if(tahun %400 == 0){
                    System.out.println("tahun kabisat");
                }
                else{
                    System.out.println("bukan tahun kabisat");
                } 
                
            }
        }
        else{
            System.out.println("bukan tahun kabisat");
        }
    }
}
