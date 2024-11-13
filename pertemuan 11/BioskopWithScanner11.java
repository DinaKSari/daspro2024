import java.util.Scanner;
public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String penonton [][]= new String[4][2];
        String menu [] = {"Input", "Tampilkan", "Exit"};
        int baris = 0, kolom=0 ;
        String next, nama, pilMen, pilCase;
        int i = 0;
        //menu
        System.out.println("=== Menu ===");
        for(int men= 0; men<menu.length; men++){
            System.out.println((men + 1)+". " + menu[men]);
        }

        System.out.println("Pilih menu : ");
        pilMen = sc.next();
        sc.nextLine();
        switch (pilMen) {
            case "1":
                while (true) { 
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if(penonton [baris-1] [kolom-1] == null){
                        penonton [baris-1] [kolom-1] = nama;
                    } else{
                        System.out.println("Maaf tapi kursi ini sudah ada yang isi");
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")){ 
                        break; 
                    }
                }
                System.out.println("tampilkan?");
                pilCase = sc.next();
                if(pilCase.equalsIgnoreCase("y")){
                    for(i = 0; i<penonton.length; i++){
                       for(int j=0; j<penonton[i].length; j++){
                        if(penonton[i][j] == null){
                            penonton[i][j]="***";
                        }
                    } 
                    }
                    System.out.printf("%s \t %s\n", penonton [0] [0], penonton [0][1]);
                    System.out.printf("%s \t %s\n", penonton [1] [0], penonton [1][1]);
                    System.out.printf("%s \t %s\n", penonton [2] [0], penonton [2] [1]);
                    System.out.printf("%s \t %s\n", penonton [3] [0], penonton [3] [1]);
                    break;
                } else{
                    break;
                }
                
            case "2":
                System.out.printf("%s \t %s\n", penonton [0] [0], penonton [0][1]);
                System.out.printf("%s \t %s\n", penonton [1] [0], penonton [1][1]);
                System.out.printf("%s \t %s\n", penonton [2] [0], penonton [2] [1]);
                System.out.printf("%s \t %s\n", penonton [3] [0], penonton [3] [1]);
                break;
            case "3":
                break;
            }
        }
    }