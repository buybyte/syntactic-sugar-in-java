public enum RequestTypeEnum {
    // GET_REQUEST_TYPE as 枚举常量的名称，作为 Enum 类的构造函数 Enum(String name, int ordinal) 的第一个参数,第二个参数从 0 开始算。
    GET_REQUEST_TYPE(10, "GET"),
    POST_REQUEST_TYPE(20, "POST"),
    PUT_REQUEST_TYPE(30, "PUT"),
    DELETE_REQUEST_TYPE(40, "DELETE");

    private Integer requestTypeId;
    private String requestTypeName;

    // constructor
    RequestTypeEnum(Integer requestTypeId, String requestTypeName) {
        this.requestTypeId = requestTypeId;
        this.requestTypeName = requestTypeName;
    }
}

/*
 // Decompiled with CFR 0.152.
 public final class RequestTypeEnum
        extends Enum<RequestTypeEnum> {
    public static final RequestTypeEnum GET_REQUEST_TYPE = new RequestTypeEnum("GET_REQUEST_TYPE", 0, 10, "GET");  // enum
    public static final RequestTypeEnum POST_REQUEST_TYPE = new RequestTypeEnum("POST_REQUEST_TYPE", 1, 20, "POST"); // enum 
    public static final RequestTypeEnum PUT_REQUEST_TYPE = new RequestTypeEnum("PUT_REQUEST_TYPE", 2, 30, "PUT"); // enum 
    public static final RequestTypeEnum DELETE_REQUEST_TYPE = new RequestTypeEnum("DELETE_REQUEST_TYPE", 3, 40, "DELETE"); // enum 
    private Integer requestTypeId;
    private String requestTypeName;
    private static final RequestTypeEnum[] $VALUES; // synthetic 所有枚举值的数组

    public static RequestTypeEnum[] values() {
        return (RequestTypeEnum[]) $VALUES.clone();
    }

    public static RequestTypeEnum valueOf(String string) {
        return Enum.valueOf(RequestTypeEnum.class, string);
    }

    private RequestTypeEnum(String string, int n, Integer n2, String string2) {
        // 注意编译器生成的构造函数调用了 Enum 的构造函数 super(string,n) 
        super(string, n);
        this.requestTypeId = n2;
        this.requestTypeName = string2;
    }

    private static RequestTypeEnum[] $values() { //synthetic 
        return new RequestTypeEnum[]{GET_REQUEST_TYPE, POST_REQUEST_TYPE, PUT_REQUEST_TYPE, DELETE_REQUEST_TYPE};
    }

    static {
        $VALUES = RequestTypeEnum.$values();
    }
}

*/
