package throwthrows;

import java.io.IOException;

public class CheckedThrowTryCatch {
    public static void main(String[] args) {
        try {
            throw new IOException("thrown down!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("last line");
    }
}
