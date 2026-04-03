import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = sc.next().toUpperCase().charAt(0);

        double c = 0, f = 0, k = 0;

        if (unit == 'C') {
            c = temp;
            f = (c * 9/5) + 32;
            k = c + 273.15;
        }
        else if (unit == 'F') {
            f = temp;
            c = (f - 32) * 5/9;
            k = c + 273.15;
        }
        else if (unit == 'K') {
            k = temp;
            c = k - 273.15;
            f = (c * 9/5) + 32;
        }
        else {
            System.out.println("Invalid unit entered!");
            return;
        }

        System.out.println("\nConverted Values:");
        System.out.println("Celsius: " + c);
        System.out.println("Fahrenheit: " + f);
        System.out.println("Kelvin: " + k);

        sc.close();
    }
}
