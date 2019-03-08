import java.util.ArrayList;
import java.util.List;

public class ForEach{

    public static void main(String [] args) {
        List<Integer> integers = new ArrayList<>();
        for(int i=0; i < 10;i++){
            integers.add(i);
        }
        for (Integer  integer : integers) {
            System.out.println(integer);
        }
    }

}

/** 
javap -v ForEach.class
Classfile ForEach.class
  Last modified 2019-3-8; size 830 bytes
  MD5 checksum 31605832fae0231c0b709e4ad7274f2c
  Compiled from "ForEach.java"
public class ForEach
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #13.#25        // java/lang/Object."<init>":()V
   #2 = Class              #26            // java/util/ArrayList
   #3 = Methodref          #2.#25         // java/util/ArrayList."<init>":()V
   #4 = Methodref          #9.#27         // java/lang/Integer.valueOf:(I)Ljava/lang/Integer; //自动装箱
   #5 = InterfaceMethodref #28.#29        // java/util/List.add:(Ljava/lang/Object;)Z
   #6 = InterfaceMethodref #28.#30        // java/util/List.iterator:()Ljava/util/Iterator; //for-each
   #7 = InterfaceMethodref #31.#32        // java/util/Iterator.hasNext:()Z
   #8 = InterfaceMethodref #31.#33        // java/util/Iterator.next:()Ljava/lang/Object;
   #9 = Class              #34            // java/lang/Integer
  #10 = Fieldref           #35.#36        // java/lang/System.out:Ljava/io/PrintStream;
  #11 = Methodref          #37.#38        // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #12 = Class              #39            // ForEach
  #13 = Class              #40            // java/lang/Object
  #14 = Utf8               <init>
  #15 = Utf8               ()V
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               main
  #19 = Utf8               ([Ljava/lang/String;)V
  #20 = Utf8               StackMapTable
  #21 = Class              #41            // java/util/List
  #22 = Class              #42            // java/util/Iterator
  #23 = Utf8               SourceFile
  #24 = Utf8               ForEach.java
  #25 = NameAndType        #14:#15        // "<init>":()V
  #26 = Utf8               java/util/ArrayList
  #27 = NameAndType        #43:#44        // valueOf:(I)Ljava/lang/Integer;
  #28 = Class              #41            // java/util/List
  #29 = NameAndType        #45:#46        // add:(Ljava/lang/Object;)Z
  #30 = NameAndType        #47:#48        // iterator:()Ljava/util/Iterator;
  #31 = Class              #42            // java/util/Iterator
  #32 = NameAndType        #49:#50        // hasNext:()Z
  #33 = NameAndType        #51:#52        // next:()Ljava/lang/Object;
  #34 = Utf8               java/lang/Integer
  #35 = Class              #53            // java/lang/System
  #36 = NameAndType        #54:#55        // out:Ljava/io/PrintStream;
  #37 = Class              #56            // java/io/PrintStream
  #38 = NameAndType        #57:#58        // println:(Ljava/lang/Object;)V
  #39 = Utf8               ForEach
  #40 = Utf8               java/lang/Object
  #41 = Utf8               java/util/List
  #42 = Utf8               java/util/Iterator
  #43 = Utf8               valueOf
  #44 = Utf8               (I)Ljava/lang/Integer;
  #45 = Utf8               add
  #46 = Utf8               (Ljava/lang/Object;)Z
  #47 = Utf8               iterator
  #48 = Utf8               ()Ljava/util/Iterator;
  #49 = Utf8               hasNext
  #50 = Utf8               ()Z
  #51 = Utf8               next
  #52 = Utf8               ()Ljava/lang/Object;
  #53 = Utf8               java/lang/System
  #54 = Utf8               out
  #55 = Utf8               Ljava/io/PrintStream;
  #56 = Utf8               java/io/PrintStream
  #57 = Utf8               println
  #58 = Utf8               (Ljava/lang/Object;)V
{
  public ForEach();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 4: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1      // args_size = 1 this对象
         0: new           #2                  // class java/util/ArrayList
         3: dup
         4: invokespecial #3                  // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: iconst_0
         9: istore_2
        10: iload_2
        11: bipush        10
        13: if_icmpge     33
        16: aload_1
        17: iload_2
        18: invokestatic  #4                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        21: invokeinterface #5,  2            // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        26: pop
        27: iinc          2, 1
        30: goto          10
        33: aload_1
        34: invokeinterface #6,  1            // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        39: astore_2
        40: aload_2
        41: invokeinterface #7,  1            // InterfaceMethod java/util/Iterator.hasNext:()Z
        46: ifeq          69
        49: aload_2
        50: invokeinterface #8,  1            // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        55: checkcast     #9                  // class java/lang/Integer
        58: astore_3
        59: getstatic     #10                 // Field java/lang/System.out:Ljava/io/PrintStream;
        62: aload_3
        63: invokevirtual #11                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        66: goto          40
        69: return
      LineNumberTable:
        line 7: 0
        line 8: 8
        line 9: 16
        line 8: 27
        line 11: 33
        line 12: 59
        line 13: 66
        line 14: 69
      StackMapTable: number_of_entries = 4
        frame_type = 253 // append 
          offset_delta = 10
          locals = [ class java/util/List, int ]
        frame_type = 250 //chop 
          offset_delta = 22
        frame_type = 252 // append
          offset_delta = 6
          locals = [ class java/util/Iterator ]
        frame_type = 250 // chop 
          offset_delta = 28
}
SourceFile: "ForEach.java"
*/