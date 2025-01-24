enum Operation {
    PLUS {
        double eval(double x, double y) { return x + y; }
    },
    MINUS {
        double eval(double x, double y) { return x - y; }
    },
    TIMES {
        double eval(double x, double y) { return x * y; }
    },
    DIVIDED_BY {
        double eval(double x, double y) { return x / y; }
    };

    // Each constant supports an arithmetic operation
    abstract double eval(double x, double y);

    public static void main(String args[]) {
        double x = 20;
        double y = 30;
        for (Operation op : Operation.values())
            System.out.println(x + " " + op + " " + y +
                               " = " + op.eval(x, y));
    }
}

/*
 
abstract class Operation
extends Enum<Operation> {
    public static final  Operation PLUS = new Operation("PLUS", 0){ //  enum

        @Override
        double eval(double d, double d2) {
            return d + d2;
        }
    };
    public static final Operation MINUS = new Operation("MINUS", 1){ // enum

        @Override
        double eval(double d, double d2) {
            return d - d2;
        }
    };
    public static final Operation TIMES = new Operation("TIMES", 2){ // enum 

        @Override
        double eval(double d, double d2) {
            return d * d2;
        }
    };
    public static final Operation DIVIDED_BY = new Operation("DIVIDED_BY", 3){ // enum

        @Override
        double eval(double d, double d2) {
            return d / d2;
        }
    };
    private static final  Operation[] $VALUES; // synthetic 

    public static Operation[] values() {
        return (Operation[])$VALUES.clone();
    }

    public static Operation valueOf(String string) {
        return Enum.valueOf(Operation.class, string);
    }

    private Operation(String string, int n) {
        super(string, n);
    }

    abstract double eval(double var1, double var3);

    public static void main(String[] stringArray) {
        double d = 20.0;
        double d2 = 30.0;
        for (Operation operation : Operation.values()) {
            System.out.println(d + " " + (Object)((Object)operation) + " " + d2 + " = " + operation.eval(d, d2));
        }
    }

    static {
        $VALUES = new Operation[]{PLUS, MINUS, TIMES, DIVIDED_BY};
    }
}
 
 */