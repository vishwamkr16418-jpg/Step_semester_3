import java.util.Scanner;

public class FestivalBonus {
    static abstract class Employee {
        final String name;
        final double salary;
        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        abstract double bonus();
    }

    static class FullTime extends Employee {
        FullTime(String name, double salary) { super(name, salary); }
        double bonus() { return salary * 0.10; }
    }

    static class PartTime extends Employee {
        PartTime(String name, double salary) { super(name, salary); }
        double bonus() { return salary * 0.05; }
    }

    static class Intern extends Employee {
        Intern(String name, double salary) { super(name, salary); }
        double bonus() { return 2000.0; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();
            Employee e;
            if (type.equals("FULLTIME")) e = new FullTime(name, salary);
            else if (type.equals("PARTTIME")) e = new PartTime(name, salary);
            else e = new Intern(name, salary);
            double b = e.bonus();
            total += b;
            out.append(name).append(": ").append(String.format("%.2f", b)).append("\n");
        }
        out.append("Total Bonus: ").append(String.format("%.2f", total));
        System.out.println(out.toString().trim());
    }
}
