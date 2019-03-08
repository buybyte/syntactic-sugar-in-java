enum Fruit
{
    APPLE, BANANA, ORANGE, WATERMELON
}

public class SwitchDemoEnum
{
    public static void main(String[] args)
    {
        for(Fruit fruit : Fruit.values())
        {
          testEnumSwitch(fruit);
        }
    }
     
    public static void testEnumSwitch(Fruit fruit)
    {
        switch (fruit)
        {
            case APPLE:
                System.out.println("This is an apple");
                break;
            case BANANA:
                System.out.println("This is a banana");
                break;
            case ORANGE:
                System.out.println("This is an orange");
                break;
            case WATERMELON:
                System.out.println("This is a watermelon");
                break;
 
            default:
                break;
        }
    }
}

/**
 * 
 * 
 * java -jar cfr-0.140.jar SwitchDemoEnum.class --decodeenumswitch false
 * Decompiled with CFR 0.140.
 
import java.io.PrintStream;

public class SwitchDemoEnum {
    public static void main(String[] arrstring) {
        for (Fruit fruit : Fruit.values()) {
            SwitchDemoEnum.testEnumSwitch(fruit);
        }
    }

    public static void testEnumSwitch(Fruit fruit) {
        switch (1.$SwitchMap$Fruit[fruit.ordinal()]) {
            case 1: {
                System.out.println("This is an apple");
                break;
            }
            case 2: {
                System.out.println("This is a banana");
                break;
            }
            case 3: {
                System.out.println("This is an orange");
                break;
            }
            case 4: {
                System.out.println("This is a watermelon");
                break;
            }
        }
    }

}
 */

 /**
  * 
  java -jar cfr-0.140.jar SwitchDemoEnum$1.class
*
 * Decompiled with CFR 0.140.
 
static class SwitchDemoEnum.1 {
    static final  int[] $SwitchMap$Fruit; //synthetic 

    static {
        $SwitchMap$Fruit = new int[Fruit.values().length];
        try {
            SwitchDemoEnum.1.$SwitchMap$Fruit[Fruit.APPLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SwitchDemoEnum.1.$SwitchMap$Fruit[Fruit.BANANA.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SwitchDemoEnum.1.$SwitchMap$Fruit[Fruit.ORANGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SwitchDemoEnum.1.$SwitchMap$Fruit[Fruit.WATERMELON.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
  **/