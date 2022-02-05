package throwthrows;

import java.io.FileNotFoundException;

public class CheckedThrowUsingThrows {
    public static void main(String[] args) throws FileNotFoundException {
        throw new FileNotFoundException("I've been thrown by user :( ");
    }
}
