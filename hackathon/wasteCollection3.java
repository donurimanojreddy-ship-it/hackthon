import java.util.Scanner;

public class wasteCollection3 {
    

    // Method to calculate waste
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Enter waste collected at Point 1: ");
            double point1Waste = scanner.nextDouble();

            System.out.print("Enter waste collected at Point 2: ");
            double point2Waste = scanner.nextDouble();
            
            double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

            System.out.println("Total waste collected: " + totalWaste);
        }
    }
}

