package practice;

 public class ExceptionExample01 {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero, which will throw an ArithmeticException
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch and handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // This block always executes, regardless of exception
            System.out.println("Execution completed.");
        }
    }

    // Method that throws an exception
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
