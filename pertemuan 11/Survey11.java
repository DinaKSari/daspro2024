import java.util.Scanner;
public class Survey11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNilai[][] = new int [10][6];
        int responNilai[] = new int[10];
        int quesNilai[] = new int[10];
        int total =0;
        int N = 0, nilai = 0, i = 0, nilaiRata = 0;
        for(i = 0; i<arrNilai.length ; i++){
            System.out.println("Responden ke-" + (i+1) + " ");
            for(int j = 0; j<arrNilai[i].length; j++){
                System.out.println("Seberapa puas anda dengan pertanyaan ke-" + (j + 1));
                arrNilai[i][j] = sc.nextInt();
                nilai += arrNilai[i][j];
            }
            responNilai[i] += nilai/6;
            quesNilai[i] += nilai/10;
            total += nilai;
            nilai = 0;
        }
        nilaiRata = total/10;
        for(i = 0;i<responNilai.length; i++){
            System.out.println("Nilai rata responden ke-" + (i+1) + " " + responNilai[i]);
        }
        System.out.println("---------------------------");
        for(i=0;i<quesNilai.length;i++){
            System.out.println("Nilai rata question ke-" + (i + 1) + " " + quesNilai[i]);
        }
        System.out.println("---------------------------");

        System.out.println("nilai rata-rata " + nilaiRata);

    }
}