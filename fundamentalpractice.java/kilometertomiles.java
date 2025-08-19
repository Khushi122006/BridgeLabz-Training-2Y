import java.util.Scanner; 
public class kilometertomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER DISTANCE IN KILOMETERS:");
        double km = sc.nextDouble();
        double miles = km * 0.621371;

        System.out.println("THE DISTANCE IN KILOMETERS IN MILES IS:" + miles);
    }
    
}
