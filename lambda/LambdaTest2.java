import java.util.List;

public class LambdaTest2 {

    public void printArrayUseLambda(List<String> lists){
        lists.forEach(list->System.out.println(list));
    }

}

/*
$ java -jar cfr-0.140.jar LambdaTest2.class --decodelambdas false

 * Decompiled with CFR 0.140.
 *
import java.io.PrintStream;
import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest2 {
    public void printArrayUseLambda(List<String> list) {
        list.forEach((Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$printArrayUseLambda$0(java.lang.String ), (Ljava/lang/String;)V)());
    }

    private static  void lambda$printArrayUseLambda$0(String string) {  //synthetic 
        System.out.println(string);
    }
}
*/