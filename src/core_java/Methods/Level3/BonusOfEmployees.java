package core_java.Methods.Level3;

public class BonusOfEmployees {
    public int[][] generateSalaryAndService(int size) {
        int[][] data = new int[size][2];
        for (int i = 0; i < size; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }
    public double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }
    public void display(int[][] data, double[][] result) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("ID\tSalary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = result[i][1];
            double newSalary = result[i][0];
            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
            System.out.println((i + 1) + "\t" + salary + "\t" + years + "\t" +
                    String.format("%.2f", bonus) + "\t" + String.format("%.2f", newSalary));
        }
        System.out.println("TOTAL\t" + (int) totalOldSalary + "\t-\t" +
                String.format("%.2f", totalBonus) + "\t" +
                String.format("%.2f", totalNewSalary));
    }
    public static void main(String[] args) {
        BonusOfEmployees obj = new BonusOfEmployees();
        int[][] data = obj.generateSalaryAndService(10);
        double[][] result = obj.calculateBonusAndNewSalary(data);
        obj.display(data, result);
    }
}
