package Solution;

// Main application class to capture input and instantiate SpeedingFines class
import java.util.Scanner;

public class SpeedingFineApplication
{
    public static void main(String[] args)
    {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the citizen's name
        System.out.print("Enter the person's name: ");
        String name = scanner.nextLine();

        // Prompting the user to enter the citizen's speed
        System.out.print("Enter person's speed (in km): ");
        int speed = scanner.nextInt();

        // Creating an instance of SpeedingFines with user input
        SpeedingFines speedingFine = new SpeedingFines(name, speed);

        // Calling the PrintFine() method to display the citizen's fine details
        speedingFine.PrintFine();

        // Closing the scanner
        scanner.close();
    }
}
