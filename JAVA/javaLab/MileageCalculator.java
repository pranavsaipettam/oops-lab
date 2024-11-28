import java.util.Scanner;

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalMiles = 0.0;
        double totalGallons = 0.0;
        int tripCount = 0;

        while (true) {
            System.out.print("Enter miles driven for trip (or -1 to quit): ");
            double milesDriven = scanner.nextDouble();
            
            // Check for sentinel value
            if (milesDriven == -1) {
                break;
            }

            System.out.print("Enter gallons used for trip: ");
            double gallonsUsed = scanner.nextDouble();

            // Calculate miles per gallon for this trip
            double milesPerGallon = milesDriven / gallonsUsed;
            System.out.printf("Miles per gallon for this trip: %.2f\n", milesPerGallon);

            // Update totals for combined calculation
            totalMiles += milesDriven;
            totalGallons += gallonsUsed;
            tripCount++;
        }

        // Calculate and display combined miles per gallon
        if (tripCount > 0) {
            double combinedMilesPerGallon = totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon for all trips: %.2f\n", combinedMilesPerGallon);
        } else {
            System.out.println("No trips were entered.");
        }

        scanner.close();
    }
}