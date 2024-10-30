import java.util.Scanner;
public class Siakad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, i = 1;
        float nilai, totalNilai, rataNilai;
        for (j =1;j<=5;i++){
            totalNilai = 0;
            for(j = 1;j <= 5;j++){
                System.out.println("Nilai ke-" +j +" = ");
                nilai = sc.nextInt();
                totalNilai+=nilai;
            }
            rataNilai = totalNilai/5;
            i++;
        }
    }
}
