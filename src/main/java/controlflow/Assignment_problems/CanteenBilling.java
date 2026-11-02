import java.util.Scanner;

public class CanteenBilling {
    static abstract class Customer {
        abstract double finalAmount(double bill);
    }

    static class Student extends Customer {
        double finalAmount(double bill) { return bill * 0.90; }
    }

    static class Staff extends Customer {
        double finalAmount(double bill) { return bill * 0.95; }
    }

    static class Guest extends Customer {
        double finalAmount(double bill) { return bill + 10.0; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Customer c;
            if (type.equals("STUDENT")) c = new Student();
            else if (type.equals("STAFF")) c = new Staff();
            else c = new Guest();
            double fin = c.finalAmount(amount);
            total += fin;
            out.append(type).append(": ").append(String.format("%.2f", fin)).append("\n");
        }
        out.append("Total: ").append(String.format("%.2f", total));
        System.out.println(out.toString().trim());
    }
}
