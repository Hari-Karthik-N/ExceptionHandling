package uncheckedexceptions;

import java.util.Scanner;

public class NumberFormatExceptionProgram {
    public static void main(String[] args) {
        try {
            int theInteger = Integer.parseInt("1.234");
        } catch (NumberFormatException e) {
            System.out.println("Number Format exception caught!");
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("finally block executed");
        }
        System.out.println("End of program");
    }
}
