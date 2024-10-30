package Solution;

// Abstract class Fine declaration
public abstract class Fine implements iFine
{
    // Protected variables for storing citizen name, speed, and fine amount
    protected String citizenName;
    protected int speed;
    protected double finePayable;

    // Constructor to initialize citizen name and speed
    public Fine(String citizenName, int speed)
    {
        this.citizenName = citizenName;
        this.speed = speed;
        this.finePayable = 0.0;  // Default fine payable is set to 0.0
    }

    // Getter method for citizen's name
    public String getCitizenName()
    {
        return citizenName;
    }

    // Getter method for citizen's speed
    public int getSpeed()
    {
        return speed;
    }

    // Getter method for fine payable
    public double getFinePayable()
    {
        return finePayable;
    }

    // Method to calculate the fine amount based on speed
    public void calculateFine()
    {
        // If speed exceeds or equals 120km, multiply the speed by 10.20
        if (speed >= 120)
        {
            // Calculate the fine and round it to 2 decimal places
            finePayable = Math.round(speed * 10.20 * 100.0) / 100.0;
        }
        else
        {
            finePayable = 0.0; // No fine if speed is below 120km
        }
    }
}
