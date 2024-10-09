import java.util.Scanner;
public class PemilihanHari11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dateType;
        System.out.println("Input day name ");
        dayName = sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dateType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dateType = "weekend";
                break;
            default:
            dateType = "Invalid day name";
        }
        System.out.println( dayName + " is a " + dateType);
    }
}
