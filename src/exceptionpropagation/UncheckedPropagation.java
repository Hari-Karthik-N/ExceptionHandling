package exceptionpropagation;

public class UncheckedPropagation {
    static void firstMethod() {
        throw new ArithmeticException("user throwed me :( ");
    }
    static void secondMethod() {
        firstMethod();
    }
    static void thirdMethod() {
        try {
            secondMethod();
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        thirdMethod();
        System.out.println("last line");
    }
}
