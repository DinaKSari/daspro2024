public class KafeFe11 {
    public static void Menu (String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang," + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!"); 
         } 
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Berikan diskon 50%");
        } else if(kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Berikan diskon 30%");
        } else{
            System.out.println("Kode Invalid");
        }
        System.out.println("======= MENU RESTO KAFE ======="); 
        System.out.println("1. Kopi Hitam Rp 15,000");
        System.out.println("2. Cappuccino Rp 20,000");
        System.out.println("3. Latte Rp 22,000"); 
        System.out.println("4. Teh Tarik Rp 12,000"); 
        System.out.println("5. Roti Bakar Rp 10,000"); 
        System.out.println("6. Mie Goreng Rp 18,000");
        System.out.println("======================================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
    }
}