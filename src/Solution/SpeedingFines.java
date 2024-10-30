package Solution;

// SpeedingFines class that extends the Fine class
public class SpeedingFines extends Fine
{
    // Constructor to initialize citizen name and speed
    public SpeedingFines(String citizenName, int speed)
    {
        // Call to the superclass constructor
        super(citizenName, speed);
        // Calculate the fine amount for this citizen
        calculateFine();
    }

    // Implementation of the PrintFine() method from the iFine interface
    @Override
    public void PrintFine()
    {
        // Displaying the citizen's details and the fine amount with two decimal places
        System.out.println("*****************************************");
        System.out.println("PERSON: " + getCitizenName());
        System.out.println("SPEED: " + getSpeed() + "km");
        // Print fine payable with two decimal places using printf
        System.out.printf("FINE PAYABLE: R%.2f%n", getFinePayable());
        System.out.println("*****************************************");
    }
}
