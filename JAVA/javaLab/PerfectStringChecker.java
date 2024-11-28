import java.util.HashSet;
import java.util.Scanner;

public class PerfectStringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        boolean isPerfect = isPerfectString(input);
        
        if (isPerfect) {
            System.out.println("The string is a perfect string.");
        } else {
            System.out.println("The string is not a perfect string.");
        }
        
        scanner.close();
    }

    
    public static boolean isPerfectString(String str) {
        HashSet<Character> charSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            // If the character is already in the set, it's not a perfect string
            if (!charSet.add(ch)) {
                return false;
            }
        }
        
        return true;
    }
}