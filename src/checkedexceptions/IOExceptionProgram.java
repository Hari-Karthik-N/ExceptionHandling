package checkedexceptions;

import java.io.FileNotFoundException;

import java.io.FileReader;


public class IOExceptionProgram {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("E:\\hari.txt");
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
