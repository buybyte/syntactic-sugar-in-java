/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }


    public static void main(String[] args) {
        Box<Integer> box = new Box<Integer>();
        box.set(1);
        System.out.println(box.get() + 1);
    }
}

/**
 * 
 * 
 * $ java -jar cfr-0.140.jar Box.class --sugarboxing false
 * Decompiled with CFR 0.140.
 *
import java.io.PrintStream;

public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return (T)this.t;
    }

    public static void main(String[] arrstring) {
        Box<Integer> box = new Box<Integer>();
        box.set(Integer.valueOf((int)1));
        System.out.println((int)(((Integer)box.get()).intValue() + 1));
    }
}

 */


/** 
javap -v Box.class
  Syntactic-sugar-in-java/boxing/Box.class
  Last modified 2019-3-8; size 830 bytes
  MD5 checksum fa59bb30e0334e105c0d4bc6b90e7ba8
  Compiled from "Box.java"
public class Box<T extends java.lang.Object> extends java.lang.Object
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #12.#32        // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#33         // Box.t:Ljava/lang/Object;
   #3 = Class              #34            // Box
   #4 = Methodref          #3.#32         // Box."<init>":()V
   #5 = Methodref          #9.#35         // java/lang/Integer.valueOf:(I)Ljava/lang/Integer; //装箱
   #6 = Methodref          #3.#36         // Box.set:(Ljava/lang/Object;)V
   #7 = Fieldref           #37.#38        // java/lang/System.out:Ljava/io/PrintStream;
   #8 = Methodref          #3.#39         // Box.get:()Ljava/lang/Object;
   #9 = Class              #40            // java/lang/Integer
  #10 = Methodref          #9.#41         // java/lang/Integer.intValue:()I    //拆箱
  #11 = Methodref          #42.#43        // java/io/PrintStream.println:(I)V
  #12 = Class              #44            // java/lang/Object
  #13 = Utf8               t
  #14 = Utf8               Ljava/lang/Object;
  #15 = Utf8               Signature
  #16 = Utf8               TT;
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Utf8               Code
  #20 = Utf8               LineNumberTable
  #21 = Utf8               set
  #22 = Utf8               (Ljava/lang/Object;)V
  #23 = Utf8               (TT;)V
  #24 = Utf8               get
  #25 = Utf8               ()Ljava/lang/Object;
  #26 = Utf8               ()TT;
  #27 = Utf8               main
  #28 = Utf8               ([Ljava/lang/String;)V
  #29 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;
  #30 = Utf8               SourceFile
  #31 = Utf8               Box.java
  #32 = NameAndType        #17:#18        // "<init>":()V
  #33 = NameAndType        #13:#14        // t:Ljava/lang/Object;
  #34 = Utf8               Box
  #35 = NameAndType        #45:#46        // valueOf:(I)Ljava/lang/Integer;
  #36 = NameAndType        #21:#22        // set:(Ljava/lang/Object;)V
  #37 = Class              #47            // java/lang/System
  #38 = NameAndType        #48:#49        // out:Ljava/io/PrintStream;
  #39 = NameAndType        #24:#25        // get:()Ljava/lang/Object;
  #40 = Utf8               java/lang/Integer
  #41 = NameAndType        #50:#51        // intValue:()I
  #42 = Class              #52            // java/io/PrintStream
  #43 = NameAndType        #53:#54        // println:(I)V
  #44 = Utf8               java/lang/Object
  #45 = Utf8               valueOf
  #46 = Utf8               (I)Ljava/lang/Integer;
  #47 = Utf8               java/lang/System
  #48 = Utf8               out
  #49 = Utf8               Ljava/io/PrintStream;
  #50 = Utf8               intValue
  #51 = Utf8               ()I
  #52 = Utf8               java/io/PrintStream
  #53 = Utf8               println
  #54 = Utf8               (I)V
{
  public Box();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 5: 0

  public void set(T);
    descriptor: (Ljava/lang/Object;)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #2                  // Field t:Ljava/lang/Object;
         5: return
      LineNumberTable:
        line 9: 0
    Signature: #23                          // (TT;)V

  public T get();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #2                  // Field t:Ljava/lang/Object;
         4: areturn
      LineNumberTable:
        line 10: 0
    Signature: #26                          // ()TT;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: new           #3                  // class Box
         3: dup
         4: invokespecial #4                  // Method "<init>":()V
         7: astore_1
         8: aload_1
         9: iconst_1
        10: invokestatic  #5                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer; //装箱
        13: invokevirtual #6                  // Method set:(Ljava/lang/Object;)V
        16: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
        19: aload_1
        20: invokevirtual #8                  // Method get:()Ljava/lang/Object;
        23: checkcast     #9                  // class java/lang/Integer
        26: invokevirtual #10                 // Method java/lang/Integer.intValue:()I //拆箱
        29: iconst_1
        30: iadd
        31: invokevirtual #11                 // Method java/io/PrintStream.println:(I)V
        34: return
      LineNumberTable:
        line 14: 0
        line 15: 8
        line 16: 16
        line 17: 34
}
Signature: #29                          // <T:Ljava/lang/Object;>Ljava/lang/Object;
SourceFile: "Box.java"

*/