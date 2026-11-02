import java.util.Scanner;

public class HostelElectricity {
    static abstract class Room {
        abstract double bill(double units);
    }

    static class Single extends Room {
        double bill(double units) { return 8.0 * units; }
    }

    static class Shared extends Room {
        private final int occupants;
        Shared(int occupants) { this.occupants = occupants; }
        double bill(double units) { return (6.0 * units) / occupants; }
    }

    static class AC extends Room {
        double bill(double units) { return 10.0 * units + 200.0; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double units = sc.nextDouble();
            Room r;
            if (type.equals("SINGLE")) r = new Single();
            else if (type.equals("SHARED")) r = new Shared(sc.nextInt());
            else r = new AC();
            double b = r.bill(units);
            total += b;
            out.append(type).append(": ").append(String.format("%.2f", b)).append("\n");
        }
        out.append("Total: ").append(String.format("%.2f", total));
        System.out.println(out.toString().trim());
    }
}
