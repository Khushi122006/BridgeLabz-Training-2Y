import java.util.Scanner;
public class areaofcircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RADIUS:");
        double radius = sc.nextDouble();
        double area= Math.PI * radius * radius;
        System.out.println("THE AREA OF CIRCLE IS :" + area);



    }
    
}
