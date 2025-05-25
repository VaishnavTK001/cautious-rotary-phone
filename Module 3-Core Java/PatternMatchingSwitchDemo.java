public class PatternMatchingSwitchDemo {

    public static void checkObjectType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It is Integer: " + i);
            case String s -> System.out.println("It is String: " + s);
            case Double d -> System.out.println("It is Double: " + d);
            case null -> System.out.println("It is null");
            default -> System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        checkObjectType(12);
        checkObjectType("Hello");
        checkObjectType(1.23);
        checkObjectType(true); 
        checkObjectType(null);
    }
}
