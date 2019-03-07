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
 */
final class Color
extends Enum<Color> {
    public static final /* enum */ Color RED = new Color("RED", 0);
    public static final /* enum */ Color GREEN = new Color("GREEN", 1);
    public static final /* enum */ Color BLUE = new Color("BLUE", 2);
    private static final /* synthetic */ Color[] $VALUES;

    public static Color[] values() {
        return (Color[])$VALUES.clone();
    }

    public static Color valueOf(String string) {
        return Enum.valueOf(Color.class, string);
    }

    private Color(String string, int n) {
        super(string, n);
    }

    static {
        $VALUES = new Color[]{RED, GREEN, BLUE};
    }
}
