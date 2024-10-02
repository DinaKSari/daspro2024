package pertemuan6;
import java.util.Scanner;
public class Pemilihan2Percobaan311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
        System.out.println("Masukan ketegori : ");
        kategori = sc.nextLine();
        System.out.println("Masukan penghasilan : ");
        penghasilan = sc.nextInt();
        if(kategori.equalsIgnoreCase("pekerja")){
            if(penghasilan <= 2000000){
                pajak = 0.1;
            } 
            else if(penghasilan <= 3000000){
                pajak = 0.15;
            } 
            else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan- (penghasilan * pajak));
            System.out.println("Penghasilan bersih " + gajiBersih);
        } 
        else if(kategori.equalsIgnoreCase("pebisnis")){
            if(penghasilan <=2500000){
                pajak = 0.15;
            } else if(penghasilan <=3500000){
                pajak = 0.2;
            } else{
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan- (penghasilan * pajak));
            System.out.println("Penghasilan bersih " + gajiBersih);
        } else{
            System.out.println("katergori yang dimasukan salah");
        }
    }
}
