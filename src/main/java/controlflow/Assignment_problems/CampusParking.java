import java.util.Scanner;

public class CampusParking {
    static abstract class Vehicle {
        abstract double charge(int hours);
    }

    static class Bike extends Vehicle {
        double charge(int hours) { return 10.0 * hours; }
    }

    static class Car extends Vehicle {
        double charge(int hours) { return 30.0 + 20.0 * (hours - 1); }
    }

    static class Truck extends Vehicle {
        double charge(int hours) { return Math.max(100.0, 50.0 * hours); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();
            Vehicle v;
            if (type.equals("BIKE")) v = new Bike();
            else if (type.equals("CAR")) v = new Car();
            else v = new Truck();
            double c = v.charge(hours);
            total += c;
            out.append(type).append(": ").append(String.format("%.2f", c)).append("\n");
        }
        out.append("Total: ").append(String.format("%.2f", total));
        System.out.println(out.toString().trim());
    }
}
