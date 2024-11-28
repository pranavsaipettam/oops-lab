import java.util.Scanner;

public class PatternOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter range (a b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

       
        System.out.print("Enter pattern: ");
        String pattern = scanner.next();

        int count = 0;

      
        for (int i = a; i <= b; i++) {
            
            String currentNumber = String.valueOf(i);
            
            if (currentNumber.contains(pattern)) {
                count++;
            }
        }

        
        System.out.println("The number of times " + pattern + " occurred between " + a + " and " + b + ": " + count);
    }
}