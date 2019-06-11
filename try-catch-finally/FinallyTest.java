public class FinallyTest {
	public static void main(String[] args) {

		int r = test();
		System.out.println(r);

	}

	public static int test() {
		try {
			System.out.println("try");
			return 0;
		} catch (Exception e) {
			System.out.println("exception");
			return 100;
		} finally {
			System.out.println("finally");

		}

	}
}

/**

java -jar cfr-0.140.jar FinallyTest.class --decodefinally false
 Decompiled with CFR 0.140.
 
import java.io.PrintStream;

public class FinallyTest {
    public static void main(String[] arrstring) {
        int n = FinallyTest.test();
        System.out.println(n);
    }

    public static int test() {
        try {
            System.out.println("try");
            int n = 0;
            System.out.println("finally");
            return n;
        }
        catch (Exception exception) {
            try {
                System.out.println("exception");
                int n = 100;
                System.out.println("finally");
                return n;
            }
            catch (Throwable throwable) {
                System.out.println("finally");
                throw throwable;
            }
        }
    }
}

**/
