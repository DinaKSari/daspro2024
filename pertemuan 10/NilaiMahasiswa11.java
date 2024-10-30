import java.util.Scanner;
public class NilaiMahasiswa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs[] = new int[10];
        int rata2, nilaiR = 100, nilaiT= 0;
        int total = 0, lulus =0, takLulus=0;
        for (int i = 0;i<10; i++){
            System.out.println("masukan nilai ke-" +(i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------------");
        for (int i = 0;i < 10;i++){
            System.out.println("Nilai akhir ke-" +(i+1)+ " adalah " + nilaiMhs[i]);
        }
        System.out.println("-----------------------------------------");
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata rata nilai = " +rata2);

        for(int i = 0; i < 10; i++){
            if(nilaiMhs[i] > nilaiT){
                nilaiT = nilaiMhs[i];
            }
            if(nilaiMhs[i] < nilaiR){
                nilaiR = nilaiMhs[i];
            }
            if(nilaiMhs[i] <= 60){
                ++takLulus;
            }
            else{
                ++lulus;
            }
        }
        System.out.println("Nilai tertinggi " + nilaiT);
        System.out.println("Nilai terendah " + nilaiR);
        System.out.println("Jumlah mahasiswa yang lulus " +lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus " + takLulus);
    }
}
