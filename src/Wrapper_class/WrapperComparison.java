package Wrapper_class;

public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println("Result of a == b (Reference Comparison): " + (a == b));
        System.out.println("Reason: 100 is in the Integer cache, so 'a' and 'b' refer to the same object.");
        System.out.println("Result of c == d (Reference Comparison): " + (c == d));
        System.out.println("Reason: 200 is outside the cache. Auto-boxing creates two distinct objects.");
        System.out.println("Result of a.equals(b) (Value Comparison): " + (a.equals(b)));
        System.out.println("Reason: The equals() method compares the underlying numeric value, which is the same(100).");
    }
}