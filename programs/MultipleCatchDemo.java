public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            int result = 100 / 0;        // ArithmeticException
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (Exception e) {
            System.out.println("General exception occurred");
        }
    }
}
