import java.util.Scanner;

public class calDrivingCost{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesDriven= scanner.nextDouble();

        System.out.print("cost per gallon of gasoline: ");
        double costGasoline= scanner.nextDouble();

        System.out.print("Enter milage: ");
        double mileage= scanner.nextDouble();

        System.out.print("avg fees per day: ");
        double fees= scanner.nextDouble();

        System.out.print("Tolls per day: ");
        double tolls= scanner.nextDouble();

        double fuelCostPerDay= (milesDriven/mileage)*costGasoline;
        double totalDailyCost= fuelCostPerDay + fees + tolls;

        System.out.print("Your total driving cost is: "+ totalDailyCost);

        scanner.close();
    }
}
