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
        
        // Power (num1 raised to num2)
        double power = Math.pow(num1, num2);
        System.out.println("Power (num1 ^ num2): " + power);

        // Square root
        if (num1 >= 0) {
            double sqrtNum1 = Math.sqrt(num1);
            System.out.println("Square root of num1: " + sqrtNum1);
        } else {
            System.out.println("Square root of num1: Cannot calculate square root of a negative number");
        }

        if (num2 >= 0) {
            double sqrtNum2 = Math.sqrt(num2);
            System.out.println("Square root of num2: " + sqrtNum2);
        } else {
            System.out.println("Square root of num2: Cannot calculate square root of a negative number");
        }
        
        
    }
}
