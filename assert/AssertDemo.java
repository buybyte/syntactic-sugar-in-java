/**
 * 当表达式为true时，则继续运行剩余业务代码，不会执行‘:’后边的表达式。
 * 当表达式为false时，则会执行‘:’后边的表达式，并将结果放置在AssertionError异常中，并抛出。
 */


public class AssertDemo {

   
        public static void main(String args[]) 
        {
            assert 1 == 1;
            System.out.println("A Go!");
            System.out.println("\n-----------------------------------------------\n");
            assert 1 != 1 : "Wrong";
            System.out.println("B Go!");
        }
    
    
}


/*
 * Decompiled with CFR 0.140.
 * java -jar cfr-0.140.jar AssertDemo.class --sugarasserts false

import java.io.PrintStream;

public class AssertDemo {
    static final   boolean $assertionsDisabled; //synthetic

    public static void main(String[] arrstring) {
        System.out.println("A Go!");
        System.out.println("\n-----------------------------------------------\n");
        if (!$assertionsDisabled) {
            throw new AssertionError((Object)"Wrong");
        }
        System.out.println("B Go!");
    }

    static {
        $assertionsDisabled = !AssertDemo.class.desiredAssertionStatus();
    }
}

*/