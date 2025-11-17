public class ExceptionExample {
    public static void main(String[] args) {

        try {
            int number = 10;
            int result = number / 0;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        finally {
            System.out.println("Execution finished.");
        }

        System.out.println("Program continues normally...");
    }
}
