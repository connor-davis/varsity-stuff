package bmicalculator;

import java.io.IOException;
import java.util.Scanner;

public class BMICalculator {
    private Double bodyMassIndex, heightInInches, heightInMeters, weightInPounds, weightInKilograms;
    private final Double GRAMS_TO_POUNDS = 453.59;
    private final Double GRAMS_TO_KG = 1000.0;
    private final Double CM_TO_INCHES = 2.54;
    private final Double CM_TO_METERS = 100.0;

    public BMICalculator() {
    }

    public void getData() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your height in inches:");
            System.out.write("> ".getBytes());

            heightInInches = scanner.nextDouble();

            while (heightInInches != 0) {
                System.out.println("Please enter your weight in pounds:");
                System.out.write("> ".getBytes());

                weightInPounds = scanner.nextDouble();

                calculateBMI();

                System.out.println("Please enter your height in inches:");
                System.out.write("> ".getBytes());

                heightInInches = scanner.nextDouble();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void calculateBMI() {
        weightInKilograms = (weightInPounds * GRAMS_TO_POUNDS) / GRAMS_TO_KG;
        heightInMeters = (heightInInches * CM_TO_INCHES) / CM_TO_METERS;
        bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);

        if (bodyMassIndex <= 18.5) {
            System.out.println("You are underweight.");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            System.out.println("You are healthy.");
        } else if (bodyMassIndex >= 25 && bodyMassIndex <= 29.9) {
            System.out.println("You are overweight.");
        } else if (bodyMassIndex >= 30) {
            System.out.println("You are obese.");
        }
    }
}
