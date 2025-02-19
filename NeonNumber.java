// Java program to check whether a given number is a Neon Number
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int square = num * num;
        int sum = 0;
        
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        
        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }
        
        scanner.close();
    }
}
