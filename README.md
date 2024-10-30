# Speeding Fine Application

## Overview
The Speeding Fine Application is a Java program that calculates and displays the fine for a citizen based on their speed. The application prompts the user to input the citizen's name and speed, and then it calculates the fine if the speed exceeds a specified limit.

## Features
- **Input Handling**: Captures citizen's name and speed using console input.
- **Fine Calculation**: Calculates fines based on a speed threshold (120 km/h).
- **Display of Results**: Outputs the citizen's details and the calculated fine.

## Structure
The application consists of the following classes:

1. **SpeedingFineApplication**: 
   - The main application class responsible for user interaction and application flow.
   - Prompts the user for input and displays the fine.

2. **iFine Interface**: 
   - An interface that declares the `PrintFine` method, ensuring any class implementing it provides the necessary functionality.

3. **Fine Abstract Class**: 
   - Serves as a base class for fine calculations.
   - Contains methods for fine computation and holds common attributes like citizen's name and speed.

4. **SpeedingFines Class**: 
   - Extends the `Fine` class.
   - Implements the `PrintFine` method to display the fine details.

## Usage
1. Compile the Java files in the `Solution` package.
2. Run the `SpeedingFineApplication` class.
3. Follow the prompts to enter the citizen's name and speed.
4. View the output displaying the fine payable.

## Example
```
# Speeding Fine Application

## Overview
The Speeding Fine Application is a Java program that calculates and displays the fine for a citizen based on their speed. The application prompts the user to input the citizen's name and speed, and then it calculates the fine if the speed exceeds a specified limit.

## Features
- **Input Handling**: Captures citizen's name and speed using console input.
- **Fine Calculation**: Calculates fines based on a speed threshold (120 km/h).
- **Display of Results**: Outputs the citizen's details and the calculated fine.

## Structure
The application consists of the following classes:

1. **SpeedingFineApplication**: 
   - The main application class responsible for user interaction and application flow.
   - Prompts the user for input and displays the fine.

2. **iFine Interface**: 
   - An interface that declares the `PrintFine` method, ensuring any class implementing it provides the necessary functionality.

3. **Fine Abstract Class**: 
   - Serves as a base class for fine calculations.
   - Contains methods for fine computation and holds common attributes like citizen's name and speed.

4. **SpeedingFines Class**: 
   - Extends the `Fine` class.
   - Implements the `PrintFine` method to display the fine details.

## Usage
1. Compile the Java files in the `Solution` package.
2. Run the `SpeedingFineApplication` class.
3. Follow the prompts to enter the citizen's name and speed.
4. View the output displaying the fine payable.

## Example
```
Enter Citizen's Name: John Doe
Enter Citizen's Speed (in km): 130
Citizen Name: John Doe
Speed: 130km
Total Fine Payable: R1326.00
```

## Requirements
- Java Development Kit (JDK) 8 or higher.
- Basic understanding of Java and console applications.

## Notes
- The fine is calculated at a rate of R10.20 per km for speeds at or above 120 km/h.
- No fine is imposed for speeds below 120 km/h.

## Future Improvements
- Implement additional speed tiers with varying fine rates.
- Add error handling for invalid input (e.g., non-integer speed).
- Enhance the user interface for better user experience.

Feel free to contribute or modify the application as needed!
```

## Requirements
- Java Development Kit (JDK) 8 or higher.
- Basic understanding of Java and console applications.

## Notes
- The fine is calculated at a rate of R10.20 per km for speeds at or above 120 km/h.
- No fine is imposed for speeds below 120 km/h.

## Future Improvements
- Implement additional speed tiers with varying fine rates.
- Add error handling for invalid input (e.g., non-integer speed).
- Enhance the user interface for better user experience.

Feel free to contribute or modify the application as needed!
