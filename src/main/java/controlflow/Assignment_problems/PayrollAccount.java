public class PayrollAccount {
    private double basicSalary;
    private double bonus;

    public PayrollAccount(double initialSalary) {
        if (initialSalary < 0) {
            this.basicSalary = 0;
            System.out.println("Warning: Negative salary provided. Set to 0.");
        } else {
            this.basicSalary = initialSalary;
        }
        this.bonus = 0;
    }

    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid bonus amount.");
        } else {
            this.bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percentage.");
        } else {
            this.basicSalary -= this.basicSalary * (percent / 100.0);
            System.out.println("Tax deducted: " + (int)percent + "%");
        }
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }
}
