
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1: ");
        int num1 = sc.nextInt();

         System.out.println("enter num2: ");
        int num2 = sc.nextInt();

         System.out.println("enter num3: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("yes num1, it is the largest of all the three numbers. ");
        }
        
        else if(num2>num1 && num2>num3){
            System.out.println("yes num2, it is the largest of all the three numbers.");

        }
        else{
            System.out.println("yes num3, it is the largest of all the three numbers.");
         
        }
            
        }
        
        
        
    }
    

