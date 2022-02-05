package checkedexceptions;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

public class IOExceptionProgram {
    public static void main(String[] args) {
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception caught");
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("finally code block");
        }
        System.out.println("end");
    }
}
