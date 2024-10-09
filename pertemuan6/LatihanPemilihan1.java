public class LatihanPemilihan1 {
    public static void main(String[] args) {
        int bil1= 28;
        int bil2= 54;
        int bil3= 15;
        int bilMax;
        if (bil1>bil2){
            if(bil1>bil3){
                bilMax = bil3;
            }
            else{
                bilMax = bil1;
            }
        }
        else{
            if(bil2 >3){
                bilMax = bil2;
            }
            else{
                bilMax = bil3;
            }
        }
        System.out.println(bilMax);
    }
}
