/*
 * Decompiled with CFR 0.140.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

class TryWithResourceDecode {
    Test() {
    }

    public static void main(String[] arrstring) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("test"));
            System.out.println(fileInputStream.read());
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException.getMessage(), iOException);
        }
        finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException.getMessage(), iOException);
                }
            }
        }
    }
}