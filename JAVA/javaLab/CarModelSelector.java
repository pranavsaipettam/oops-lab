import java.util.Scanner;

public class CarModelSelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the category of car you are looking for (SUV, SEDAN, ECONOMY, MINI): ");
        String category = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitive matching
        
        String carModel = modelOfCategory(category);
        
        if (carModel != null) {
            System.out.println("Available car model: " + carModel);
        } else {
            System.out.println("Invalid category entered.");
        }
        
        scanner.close();
    }

    // Function to return car model based on category
    public static String modelOfCategory(String category) {
        switch (category) {
            case "SUV":
                return "TATA SAFARI";
            case "SEDAN":
                return "TATA INDIGO";
            case "ECONOMY":
                return "TATA INDICA";
            case "MINI":
                return "TATA NANO";
            default:
                return null; // Return null for invalid categories
        }
    }
}