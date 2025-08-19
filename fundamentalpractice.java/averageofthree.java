import java.util.Scanner; 
public class averageofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NO:");
        int num1= sc.nextInt();
        System.out.println("ENTER THE SECOND NO:");
        int num2= sc.nextInt();
        System.out.println("ENTER THE THIRD NO:");
        int num3= sc.nextInt();

        int average = (num1+num2+num3)/3;
        System.out.println("THE AVERAGE OF THE THREE NUMBERS IS : " + average);

    }
    
}
