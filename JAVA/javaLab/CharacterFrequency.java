import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the threshold count (n): ");
        int n = scanner.nextInt();
        
        // Count and print characters exceeding the threshold
        printExceedingCharacters(input, n);
        
        scanner.close();
    }

    public static void printExceedingCharacters(String str, int n) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

       
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > n) {
                System.out.println(ch + ": " + charCountMap.get(ch));
            }
        }
    }
}