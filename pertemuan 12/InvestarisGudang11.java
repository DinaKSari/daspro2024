import java.util.Scanner;
public class InvestarisGudang11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.print("Masukan jumlah jenis barang : ");
        i = sc.nextInt();
        System.out.println("Masukan jumlah lokasi penyimpanan : ");
        j = sc.nextInt();
        int [][] stokBarang = new int[i][j];
        String [] namaKota = new String[j];
        int jenisBarang, lokasiBarang, stok = 0;
        System.out.println("Masukan nama kota untuk setiap lokasi : ");
        for(int y = 0; y<namaKota.length; y++){
            System.out.println("Kota untuk lokasi " + (y + 1) + " : ");
            namaKota[y] = sc.next();
        }
        for(i = 0; i<stokBarang.length; i++){
            System.out.println("Mengisi stok barang ...");
            System.out.println("Masukan jenis barang 0-" + (stokBarang.length - 1) + " : ");
            jenisBarang = sc.nextInt();
            System.out.println("lokasi 0-" + (stokBarang[i].length - 1) + " : ");
            lokasiBarang = sc.nextInt();
            System.out.println("Tambah stok : ");
            stokBarang[jenisBarang][lokasiBarang] = sc.nextInt();
        }
        System.out.println("Tabel stok gudang : ");
        System.out.print("\t");
        for(i=0; i<namaKota.length; i++){
            System.out.printf("    " + namaKota[i]);
        }
        System.out.println();
        for(i=0; i<stokBarang.length; i++){
            System.out.print("Barang " + (i + 1) + " : ");
            for(j = 0; j<stokBarang[i].length; j++){
                System.out.printf("\t" + stokBarang[i][j]);
            }
            System.out.println();
        }
        System.out.println("Total stock setiap jenis barang : ");
        for(i=0; i<stokBarang.length; i++){
            System.out.print("Jenis barang ke-" + (i+1));
            stok = 0;
            for(j = 0; j<stokBarang[i].length;j++){
                stok += stokBarang[i][j];
            }
            System.out.print(" : " + stok);
            System.out.println();
        }
        System.out.println("Lokasi dengan stok terbanyak berdasarkan jenis barang : ");
        for(i = 0; i<stokBarang.length; i++){
            stok=-1;
            int tertinggi=-1;
            for(j = 0; j<stokBarang[i].length;j++){
                if(stokBarang[i][j] > tertinggi){
                    stok = stokBarang[i][j];
                    tertinggi = j;
                }
            }
            System.out.println("Lokasi terbanyak barang ke-" + (i + 1) + " : " + namaKota[tertinggi] + " dengan stok " + stok);
        }
    }
}