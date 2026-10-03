import java.util.Scanner;

public class WasteCollection2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter waste collected (kg): ");
        double waste = scanner.nextDouble();

        if (waste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}

