/*
 * Connor Davis
 * @author ST10068305
 */
package fahrenheittocelsius;

import javax.swing.JOptionPane;

public class App {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Declare the variables
        double temperatureInFahrenheit;
        double temperatureInCelsius;

        // House keeping
        JOptionPane.showMessageDialog(null, "Welcome to Fahrenheit to Celsius Converter",
                "Fahrenheit to Celsius Converter", JOptionPane.INFORMATION_MESSAGE);

        // Get the temperature in fahrenheit from the user
        temperatureInFahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Please enter the temperature in fahrenheit,\nWe will convert it for you :)",
                "Fahrenheit to Celsius Converter", JOptionPane.QUESTION_MESSAGE));

        // Call the conversion method and save the temperature in celsius
        temperatureInCelsius = convertFahrenheitToCelsius(temperatureInFahrenheit);

        // Output the temperature in celsius to the user
        JOptionPane.showMessageDialog(null, "The temperature in celsius is " + temperatureInCelsius + "°C",
                "Fahrenheit to Celsius Converter", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method will calculate the temperature in celsius of the temperature in
     * fahrenheit
     * 
     * @param temperatureInFahrenheit
     * @return temperatureInCelsius
     */
    public static double convertFahrenheitToCelsius(double temperatureInFahrenheit) {
        // Declare the variables
        double temperatureInCelsius;

        // Calculate the temperature in celcius
        temperatureInCelsius = temperatureInFahrenheit - 32;

        // Return the temperature in celcius
        return temperatureInCelsius;
    }
}
