import java.util.Scanner;
public class Star11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Masukan nilai N");
        N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.print("*");
        }
    }
}