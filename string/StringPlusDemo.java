public class StringPlusDemo{
    public static void main(String[] args) {
        String s = "";
        for(int i=0; i < 100; i++){
            s += "A";

        }
        System.out.println(s);
    }
}






/*
 * Decompiled with CFR 0.140.
 * java -jar cfr-0.140.jar StringPlusDemo.class --stringbuilder false
 * 分析 + 每次新产生一个StringBuilder对象去调用append方法
 
import java.io.PrintStream;
public class StringPlusDemo {
    public static void main(String[] arrstring) {
        String string = "";
        for (int i = 0; i < 100; ++i) {
            string = new StringBuilder().append(string).append("A").toString();
        }
        System.out.println(string);
    }
}
**/