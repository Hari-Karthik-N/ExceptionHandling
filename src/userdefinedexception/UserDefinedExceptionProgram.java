package userdefinedexception;

class UserDefinedException extends Exception {
    UserDefinedException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionProgram {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("User throwed me ! ");
        } catch (UserDefinedException e) {
            System.out.println("caught user defined exception");
            System.out.println(e.getMessage());
        }
        System.out.println("last line");
    }
}
