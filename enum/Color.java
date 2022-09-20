// A simple enum example where enum is declared 
// outside any class (Note enum keyword instead of 
// class keyword) 
enum Color 
{ 
    RED, GREEN, BLUE; 
} 
  



/*
 * Decompiled with CFR 0.140.
 * java -jar cfr-0.140.jar Color.class --sugarenums false
 
final class Color
extends Enum<Color> {
    public static final  Color RED = new Color("RED", 0); // enum 
    public static final  Color GREEN = new Color("GREEN", 1); // enum 
    public static final  Color BLUE = new Color("BLUE", 2); // enum 
    private static final   Color[] $VALUES;  //synthetic 人工合成的

    public static Color[] values() {
        return (Color[])$VALUES.clone();
    }

    public static Color valueOf(String string) {
        return Enum.valueOf(Color.class, string);
    }

   // constructor
    private Color(String string, int n) {
        super(string, n);
    }

    // Color array
    static {
        $VALUES = new Color[]{RED, GREEN, BLUE};
    }
}

*/
