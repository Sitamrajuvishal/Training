package Assignments;

public class SimpleCalculator {

	public static void main(String[] args) {
		
//Reading the Input from CLA.
        double op1 = Double.parseDouble(args[0]);
        double op2 = Double.parseDouble(args[1]);
        double op3 = Double.parseDouble(args[2]);
        
// Addition
        double sum = op1 + op2 + op3;
//Subtraction
        double difference = op1 - op2 - op3;
//Multiplication
        double product = op1 * op2 * op3;
        
// Check if operand3 is not zero to avoid division by zero error
        double division = 0;
        if (op3 != 0) {
            division = op1 / op2 / op3;
        } else {
            System.out.println("Error: Division by zero");
            return;
        }
        
// Displaying the results
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Difference of the numbers: " + difference);
        System.out.println("Product of the numbers: " + product);
        System.out.println("Quotient of the numbers: " + division);
    }
}
