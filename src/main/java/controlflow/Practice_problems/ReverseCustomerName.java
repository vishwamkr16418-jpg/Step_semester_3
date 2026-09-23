import java.util.*;
public class ReverseCustomerName {
public static String reverseCustomerName(String customerName) {
StringBuilder result=new StringBuilder(customerName);
return result.reverse().toString();
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String customerName=sc.nextLine();
System.out.println("Original Name: "+customerName);
System.out.println("Reversed Name: "+reverseCustomerName(customerName));
}
}
