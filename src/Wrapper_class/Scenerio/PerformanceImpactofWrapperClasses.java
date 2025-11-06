package Wrapper_class.Scenerio;

import java.util.ArrayList;
import java.util.List;

public class PerformanceImpactofWrapperClasses {
    private static final int COUNT = 1000000;
    public static void main(String[] args) {
        long startTime, endTime;
        long sum;
        int[] intArray = new int[COUNT];
        startTime = System.nanoTime();
        sum = 0;
        for (int i = 0; i < COUNT; i++) {
            intArray[i] = i;
            sum += intArray[i];
        }
        endTime = System.nanoTime();
        long intTime = endTime - startTime;
        System.out.println("For Primitive int[]:-");
        System.out.println("Time taken (in ns)= " + intTime);
        System.out.println("Result= " + sum);
        List<Integer> integerList = new ArrayList<>(COUNT);
        startTime = System.nanoTime();
        sum = 0;
        for (int i = 0; i < COUNT; i++) {
            integerList.add(i);
        }
        for (int i : integerList) {
            sum += i;
        }
        endTime = System.nanoTime();
        long integerTime = endTime - startTime;
        System.out.println("For Wrapper ArrayList<Integer>:-");
        System.out.println("Time taken (in ns)= " + integerTime);
        System.out.println("Result= " + sum);
    }
}
