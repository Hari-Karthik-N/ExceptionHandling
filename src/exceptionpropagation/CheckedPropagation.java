package exceptionpropagation;

import java.io.IOException;

public class CheckedPropagation {
    static void firstMethod() throws IOException {
        throw new IOException("user throwed me :( ");
    }
    static void secondMethod() throws IOException {
        firstMethod();
    }
    static void thirdMethod() {
        try {
            secondMethod();
        } catch(IOException e) {
            System.out.println(e.getMessage());
            System.out.println("below e message");
        }
    }

    public static void main(String[] args) {
        thirdMethod();
        System.out.println("last line");
    }
}
