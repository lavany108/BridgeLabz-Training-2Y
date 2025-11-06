package Wrapper_class.Scenerio;

public class BankTransactionLimits {
    public static double getRemainingLimit(Double withdrawalLimit) {
        if (withdrawalLimit == null) {
            return 0.0;
        }
        return withdrawalLimit;
    }
    public static void main(String[] args) {
        Double limit1 = 500.0;
        Double limit2 = 100.0;
        Double limit3 = null;
        double limit4 = 75.0;
        System.out.println("Limit 1(Double object): " + getRemainingLimit(limit1));
        System.out.println("Limit 2(Double object): " + getRemainingLimit(limit2));
        System.out.println("Limit 3(Null object): " + getRemainingLimit(limit3));
        System.out.println("Limit 4(primitive double): " + getRemainingLimit(limit4));
    }
}
