public class SimpleCalculator {

    public static void main(String[] args) {
        // Hardcoded numbers
        double num1 = 10;
        double num2 = 5;

        // Addition
        double sum = num1 + num2;
        System.out.println("Addition: " + sum);

        // Subtraction
        double difference = num1 - num2;
        System.out.println("Subtraction: " + difference);

        // Multiplication
        double product = num1 * num2;
        System.out.println("Multiplication: " + product);

        // Division
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        
        
    }
}
