package uncheckedexceptions;

public class IndexOutOfBoundsExceptionProgram {
    public static void main(String[] args) {
        int[] theArray = {1,2,3,4,5};
        String theString = "mystring";
        try {
            try {
                System.out.println(theArray[10]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("array index out of bounds exception caught");
                System.out.println(e.getLocalizedMessage());
            }
            finally {
                System.out.println("finally block for array executed");
            }
            try {
                System.out.println(theString.charAt(8));
            } catch(StringIndexOutOfBoundsException e) {
                System.out.println("string index out of bounds exception caught");
                System.out.println(e.getLocalizedMessage());
            }
            finally {
                System.out.println("finally block for string executed");
            }
        } catch (Exception e) {
            System.out.println("parent exception class caught");
            e.getLocalizedMessage();
        }
        finally {
            System.out.println("Finally block for parent exception executed");
        }
        System.out.println("End of program");
    }
}
