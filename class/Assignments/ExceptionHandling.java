package Assignments;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
	}
	
	public static void divideByZero() {
        int num = 10;
        int deno = 0;

        int result = num / deno;
        System.out.println("Result of division: " + result);
    }

}
