import java.util.Scanner; 
public class feet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("distance in feet: ");
        double distanceinfeet = sc.nextDouble();
        double yard = distanceinfeet/3;
        double miles = yard/1760;

        System.out.println(" distance in  feet in yards  is = " + yard );
        System.out.println(" distance in  feet in miles  is = " + miles );

    }
    
}
