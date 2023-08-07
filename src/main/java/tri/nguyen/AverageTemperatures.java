/*
* Created by Tri Nguyen, 8/7/2023
**      Calculate the average temperatures in both Fahrenheit and Celsius
***         Converting temperatures in the given Fahrenheit to Celsius
***         Display the conversion of temperature from Fahrenheit to Celsius
***          Calculate and display the average temperatures in Fahrenheit and Celsius
*
 */
package tri.nguyen;

import java.util.Arrays;

public class AverageTemperatures {
    public static void main(String[] args){
    double[] temperaturesF = {70.2, 72.5, 80.0, 85.2, 68.7, 78.6, 72.0, 75.2, 69.8, 75.0, 70.0};

    // Convert Fahrenheit scale to Celsius scale
    double temperaturesC = 0;
    for (int i = 0; i < temperaturesF.length; i++){
        temperaturesC = (temperaturesF[i] - 32) * 5/9; // C = 5/9 * (F-32)
        System.out.printf("The temperature of %.2f F degree is about %.2f C degree. \n", temperaturesF[i], temperaturesC);
    }

    // Calculate Average Temperature
    double sumF = 0;
    // Calculate the total Temperature
    for (int i = 0; i < temperaturesF.length; i++){
        sumF += temperaturesF[i];
   }

    double averageTemperatureF = sumF / temperaturesF.length;
    System.out.printf("The average temperature in Fahrenheit is %.2f F degree. \n", averageTemperatureF);
    double sumC = (sumF - 32) * 5/9; // convert sum in Celsius to Fahrenheit
    double averageTemperatureC = sumC / temperaturesC;
        System.out.printf("The average temperature in Celsius is %.2f C degree. \n", averageTemperatureC);
    }
}

