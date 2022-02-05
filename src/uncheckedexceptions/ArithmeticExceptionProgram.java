package uncheckedexceptions;

public class ArithmeticExceptionProgram {
    public static void main(String[] args) {
        int theNumber = 17;
        try {
            System.out.println("On dividing by 0: " + (theNumber/0));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught");
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program Ended!");
    }
}
