import java.io.*;
import java.lang.Exception;
class TryWithResource{
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream(new File("test"))) {
            System.out.println(inputStream.read());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
    }
	
/**
   java -jar cfr-0.140.jar TryWithResource.class --sugarboxing false
 
 * Decompiled with CFR 0.140.
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

class TryWithResource {
    TryWithResource() {
    }

    public static void main(String[] arrstring) {
        try {
            FileInputStream fileInputStream = new FileInputStream((File)new File((String)"test"));
            Throwable throwable = null;
            try {
                System.out.println((int)fileInputStream.read());
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                if (fileInputStream != null) {
                    if (throwable != null) {
                        try {
                            fileInputStream.close();
                        }
                        catch (Throwable throwable3) {
                            throwable.addSuppressed((Throwable)throwable3);
                        }
                    } else {
                        fileInputStream.close();
                    }
                }
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)iOException.getMessage(), (Throwable)iOException);
        }
    }
}






**/
