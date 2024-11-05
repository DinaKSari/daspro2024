import java.util.Scanner;
public class Porseni11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String atlet1,atlet2,atlet3,atlet4;
        System.out.println("Masukan berapa politeknik yang mendaftar ");
        int Y = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=Y;i++){
            System.out.println("--------------------------------------");
            System.out.println("Masukan nama atlet badminton ");
            atlet1 = sc.nextLine();
            System.out.println("Masukan nama atlet tenis meja ");
            atlet2 = sc.nextLine();
            System.out.println("Masukan nama atlet basket ");
            atlet3 = sc.nextLine();
            System.out.println("Masukan nama atlet bola voly ");
            atlet4 = sc.nextLine();
            System.out.print("Atlet dari politeknik ke-" +i);
            for(int H=1;H<=Y;H++){
                    System.out.print(" "+atlet1+ " "+atlet2+" "+atlet3 +" " +atlet4);
                    H++;
                    continue;
            }
            System.out.println();
        }
    }
}
