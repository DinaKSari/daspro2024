import java.util.Scanner;
public class KafeIbuMariana11 {
    public static void tampilkanArray(int[][] array, String[] namaMenu, String[] hari) {
        for(int i = 0;i<hari.length;i++){
            System.out.printf("\t\t" + hari[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf(namaMenu[i]+"\t");
            for (int j = 0; j < array[i].length; j++) {
                if(i == 0 || i == 1){
                    System.out.print("\t" + array[i][j] + "\t");
                } else{
                    System.out.print(array[i][j] + "\t\t");
                }
            }
            System.out.println();
        }
    }
    public static void inputDataPenjualan(int[][] array, String[] namaMenu, String[] hari) {
        Scanner sc2 = new Scanner(System.in);
        int pilihMenu, pilihHari;

        System.out.println("=== Input Data Penjualan ===");
        System.out.println("Pilih Menu antara 0-" + (namaMenu.length - 1));
        pilihMenu = sc2.nextInt();

        System.out.println("Pilih Hari antara 0-" + (hari.length - 1));
        pilihHari = sc2.nextInt();

        System.out.println("Masukkan total penjualan pada hari ke-" + (pilihHari + 1) + " : ");
        array[pilihMenu][pilihHari] = sc2.nextInt();

        System.out.println("Data penjualan berhasil dimasukkan!");
    }
    public static void  topMenu(int array [][], String namaMenu[]){
        int top = 0, pesananTop = 0;
        for(int i = 0; i<array.length;i++){
            int terjual = 0;
            for(int j = 0; j < array[i].length;j++){
                terjual += array[i][j];
            }
            if(terjual > top){
                top = terjual;
                pesananTop = i;
            }
        }
        System.out.println("Menu dengan total penjualan terbanyak : " + namaMenu[pesananTop]); 
    }
    public static void tampilkanRataRataPenjualan(int[][] array) {
        System.out.println("=== Rata-Rata Penjualan Tiap Menu ===");
        for (int i = 0; i < array.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < array[i].length; j++) {
                totalPenjualan += array[i][j];
            }
            double rataRata = (double) totalPenjualan / array[i].length;
            System.out.printf("Menu %d: %.2f%n", (i + 1), rataRata);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int[][] array = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };
        int i = 0;
        String namaMenu[] = {"Kopi","Teh","Es Degan","Roti Bakar","Gorengan"};
        String hari[] = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

        //menginput data penjualan
        System.out.println("Apakah ingin menginput data penjualan? y/n");
        String answer = sc.next();
        if(answer.equalsIgnoreCase("y")){
            inputDataPenjualan(array, namaMenu, hari);
        } else{
            System.out.println("...Melanjutkan Menampilkan Tabel");
        }

        //menampilkan tabel
        tampilkanArray(array,namaMenu,hari);

        //menampilkan menu yang memiliki penjualan terbanyak
        topMenu(array, namaMenu);

        // menampilkan rata rata penjualan tiap menu
        tampilkanRataRataPenjualan(array);
    }
}
