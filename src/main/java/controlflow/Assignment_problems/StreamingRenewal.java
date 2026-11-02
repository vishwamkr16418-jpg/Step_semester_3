import java.time.LocalDate;
import java.util.Scanner;

public class StreamingRenewal {
    static abstract class Plan {
        final String name;
        final LocalDate start;
        Plan(String name, LocalDate start) {
            this.name = name;
            this.start = start;
        }
        abstract int validityDays();
        LocalDate renewalDate() { return start.plusDays(validityDays()); }
    }

    static class Basic extends Plan {
        Basic(String name, LocalDate start) { super(name, start); }
        int validityDays() { return 30; }
    }

    static class Standard extends Plan {
        Standard(String name, LocalDate start) { super(name, start); }
        int validityDays() { return 90; }
    }

    static class Premium extends Plan {
        Premium(String name, LocalDate start) { super(name, start); }
        int validityDays() { return 365; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            LocalDate start = LocalDate.parse(sc.next());
            Plan p;
            if (type.equals("BASIC")) p = new Basic(name, start);
            else if (type.equals("STANDARD")) p = new Standard(name, start);
            else p = new Premium(name, start);
            out.append(name).append(": ").append(p.renewalDate()).append("\n");
        }
        System.out.println(out.toString().trim());
    }
}
