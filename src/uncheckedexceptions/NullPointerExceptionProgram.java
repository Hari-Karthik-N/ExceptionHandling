package uncheckedexceptions;

public class NullPointerExceptionProgram {
    public static void main(String[] args) {
        String theString = null;
        try {
            System.out.println("The String Length: " + theString.length());
        } catch(NullPointerException e) {
            System.out.println("Null pointer exception caught");
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("program ended!");
    }
}
