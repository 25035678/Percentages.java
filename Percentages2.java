// Percentages2.java

import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;

        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        computePercent(number1, number2);
        computePercent(number2, number1);
    }

    public static void computePercent(double number1, double number2) {

        double percent;

        percent = (number1 / number2) * 100;

        System.out.println(number1 + " is " + percent +
                " percent of " + number2);
    }
}
