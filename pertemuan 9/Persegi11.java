public class Persegi11 {
    public static void main(String[] args) {
        int n = 5;
        for(int h = 1;h<=n;h++){
            for(int i=1;i<=n;i++){
                if(h==1 || h==n || i==1 || i==n){
                    System.out.print(n);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
