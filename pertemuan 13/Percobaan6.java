import java.util.Scanner;
public class Percobaan6 {
    static int hitungluas(int pnj, int lbr) { 
        int Luas = pnj * lbr;
        return Luas;
    }
    static int hitungVolume(int tinggi,int a, int b){
        int volume = hitungluas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int p,l,t,L, vol;
        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt(); 
        System.out.println("Masukkan tinggi"); 
        t=input.nextInt(); 
        L= hitungluas(p, l); 
        System.out.println("Luas Persegi Panjang adalah "+L);
        vol= hitungVolume(t,p,1); 
        System.out.println("Volume Balok adalah "+vol);
    }
}
