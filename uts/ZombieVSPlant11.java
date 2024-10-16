import java.util.Scanner;
public class ZombieVSPlant11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi variable
        int nyawa_pelindung, nyawa_penyerang, nyawa_zombie;
        int serangan_plant, serangan_zombie, ronde = 0;
        //input nilai
        System.out.println("Masukan nyawa tanaman pelindung : ");
        nyawa_pelindung = sc.nextInt();
        System.out.println("Masukan nyawa tanaman penyerang : ");
        nyawa_penyerang = sc.nextInt();
        System.out.println("Masukan nyawa zombie");
        nyawa_zombie = sc.nextInt();
        System.out.println("Masukan poin serangan tanaman penyerang : ");
        serangan_plant = sc.nextInt();
        System.out.println("Masukan poin serangan zombie : ");
        serangan_zombie = sc.nextInt();
        //status awal
        System.out.println("Zombie vs plant");
        System.out.println("___________________________________________________________");
        System.out.println("Status awal pertarungan:");
        System.out.println("Nyawa zombie : " + nyawa_zombie);
        System.out.println("Poin serangan zombie : "+serangan_zombie);
        System.out.println("Nyawa tanaman pelindung : "+nyawa_pelindung);
        System.out.println("Nyawa tanaman penyerang : "+nyawa_penyerang);
        System.out.println("Poin serangan tanaman penyerang : "+serangan_plant);
        System.out.println("_____________________________________________________");
        //perulangan ronde
        do{
            if(nyawa_pelindung > 0 && nyawa_penyerang > 0 && nyawa_zombie > 0){
                ronde++;
                //proses perhitungan nyawa dan serangan
                nyawa_zombie = nyawa_zombie - serangan_plant;
                nyawa_pelindung = nyawa_pelindung - serangan_zombie;
                //output
                System.out.println("Ronde "+ronde);
                System.out.println("_____________________________________________________");
                System.out.println("Tanaman penyerang menyerang zombie!");
                System.out.println("Nyawa zombie sekarang : " + nyawa_zombie + " poin");
                System.out.println("Zombie menyerang tanaman pelindung!");
                System.out.println("Nyawa tanaman pelindung sekarang : "+nyawa_pelindung +" poin");
                System.out.println("_____________________________________________________");

            } else if (nyawa_pelindung <= 0 && nyawa_penyerang > 0 && nyawa_zombie>0) {
                ronde++;
                //proses nyawa dan serangan
                nyawa_zombie = nyawa_zombie - serangan_plant;
                nyawa_penyerang = nyawa_penyerang - serangan_zombie;
                //output
                System.out.println("Ronde "+ronde);
                System.out.println("_____________________________________________________");
                System.out.println("Tanaman penyerang menyerang zombie!");
                System.out.println("Nyawa zombie sekarang : " + nyawa_zombie + " poin");
                System.out.println("Zombie menyerang tanaman penyerang!");
                System.out.println("Nyawa tanaman penyerang sekarang : "+nyawa_penyerang +" poin");
                System.out.println("_____________________________________________________");
            } else if(nyawa_pelindung <= 0 && nyawa_penyerang <= 0 && nyawa_zombie > 0){
                System.out.println("tanaman telah hancur! zombie menang!");
                break;
            } else if(nyawa_pelindung <= 0 && nyawa_penyerang > 0 && nyawa_zombie <= 0 ){
                System.out.println("zombie telah hancur! tanaman menang!");
                break;
            } else if(nyawa_pelindung >= 0 && nyawa_penyerang > 0 && nyawa_zombie <= 0 ){
                System.out.println("zombie telah hancur! tanaman menang!");
                break;
            } else{
                System.out.println("tanaman & zombie telah hancur!");
                System.out.println("Pertarungan seri!");
                break;
            }

        } while(true);
    }
}