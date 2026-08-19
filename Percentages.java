// Percentages.java

public class Percentages {

    public static void main(String[] args) {

        double number1 = 2.0;
        double number2 = 5.0;

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
