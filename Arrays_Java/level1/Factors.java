import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] factors = new int[10];
        int index = 0, maxSize = 10;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");
        scanner.close();
    }
}
    
