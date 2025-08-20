import java.util.Scanner; 
public class footandinches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height");
        double cm= sc.nextDouble();
        double inch = cm*2.54;
        double  foot = inch * 12;
        System.out.println("YOUR  HEIGHT IN CM IS = "+ cm +" AND IN FOOT IS= "+ foot + " AND IN INCH IS= "+ inch );
        
    }
}
    
