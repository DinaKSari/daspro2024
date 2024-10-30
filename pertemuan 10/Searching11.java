public class Searching11 {
    public static void main(String[] args) {
        int arrNilai[] = {80,86,87,29,90,27,33};
        int key = 90;
        int hasil = 0;
        
        for (int i = 0;i< arrNilai.length; i++){
            if (key == arrNilai[i]){
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+key+" ketemu di index ke-" +hasil);
        System.out.println();
    }
}
