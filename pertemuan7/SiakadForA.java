import java.util.Scanner;
public class SiakadForA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lulus= 0, takLulus = 0;
        Double nilai, tertinggi = 0.0, terendah= 100.0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Masukan nilai mahasiswa ke-" +i + ":");
            nilai = sc.nextDouble();
            if(nilai > tertinggi){
                tertinggi = nilai;
            }
            if(nilai < terendah){
                terendah = nilai;
            }
            if(nilai <= 60.0){
                ++takLulus;
            }
            else{
                ++lulus;
            }
        }
        System.out.println("Nilai tertinggi " + tertinggi);
        System.out.println("Nilai terendah " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus " +lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus " + takLulus);
    }
}