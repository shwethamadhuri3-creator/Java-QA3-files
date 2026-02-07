public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        finally {
            System.out.println("Finally block always executes");
        }
    }
}
