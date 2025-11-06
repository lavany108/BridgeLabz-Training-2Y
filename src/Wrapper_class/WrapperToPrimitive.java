package Wrapper_class;

public class WrapperToPrimitive {

    public static void main(String[] args) {
        Double doubleObject = Double.valueOf(45.67);
        System.out.println("Original Wrapper Object= " + doubleObject);
        double primitiveDouble = doubleObject;
        System.out.println("Converted to primitive(double)= " + primitiveDouble);
        int primitiveInt = doubleObject.intValue();
        System.out.println("Converted to primitive(int) using Casting= " + primitiveInt);
        System.out.println("All values:");
        System.out.println("Double Object= " + doubleObject);
        System.out.println("Primitive (double)= " + primitiveDouble);
        System.out.println("Primitive (int)= " + primitiveInt);
    }
}
