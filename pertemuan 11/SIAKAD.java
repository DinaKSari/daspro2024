import java.util.Scanner;

public class SIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int I, J;
        System.out.println("Masukan jumlah siswa ");
        I = sc.nextInt();
        System.out.println("Masukan jumlah matkul ");
        J = sc.nextInt();
        int[][] nilai = new int[I][J];
        for (int i=0; i < nilai.length; i++) { 
            System.out.println("Input nilai mahasiswa ke-" + (i + 1)); 
            double totalPerSiswa=0;
            for (int j = 0; j < nilai [i].length; j++) { 
                System.out.print("Nilai mata kuliah " + (j+1) + ": "); 
                nilai[i][j] = sc.nextInt(); 
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("nilai rata per siswa - " + totalPerSiswa);
        }
        for (int i=0; i < nilai.length; i++) { 
            System.out.println("Input nilai mahasiswa ke-" + (i + 1)); 
            double totalPerSiswa = 0; for (int j = 0; j < nilai [i].length; j++) { 
                System.out.print("Nilai mata kuliah" + (j+1) + ": "); 
                nilai[i][j] = sc.nextInt(); 
                totalPerSiswa += nilai[i][j];
            }
        }
    }
}
