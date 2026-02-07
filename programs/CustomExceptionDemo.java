class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        System.out.println("Valid marks");
    }

    public static void main(String[] args) {
        try {
            checkMarks(120);
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
