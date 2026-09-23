import java.util.*;
public class BMICalculator {
public static String getBmiStatus(double bmi) {
if(bmi<18.5) return "Underweight";
if(bmi<25) return "Normal";
if(bmi<30) return "Overweight";
return "Obese";
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double[] heights=new double[n];
double[] weights=new double[n];
for(int i=0;i<n;i++){
heights[i]=sc.nextDouble();
weights[i]=sc.nextDouble();
double bmi=weights[i]/(heights[i]*heights[i]);
System.out.printf("Person %d - Height: %.2f m, Weight: %.2f kg BMI: %.2f | Status: %s%n",i+1,heights[i],weights[i],bmi,getBmiStatus(bmi));
}
}
}
