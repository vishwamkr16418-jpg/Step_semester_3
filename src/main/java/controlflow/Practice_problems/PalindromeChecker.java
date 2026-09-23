import java.util.*;
public class PalindromeChecker {
public static boolean isPalindromeIterative(String text) {
int i=0,j=text.length()-1;
while(i<j){
if(text.charAt(i)!=text.charAt(j)) return false;
i++;
j--;
}
return true;
}
public static boolean isPalindromeRecursive(String text) {
return recursive(text,0,text.length()-1);
}
public static boolean recursive(String text,int i,int j) {
if(i>=j) return true;
if(text.charAt(i)!=text.charAt(j)) return false;
return recursive(text,i+1,j-1);
}
public static boolean isPalindromeArrayReversal(String text) {
char[] a=text.toCharArray();
char[] b=text.toCharArray();
for(int i=0,j=b.length-1;i<j;i++,j--){
char temp=b[i];
b[i]=b[j];
b[j]=temp;
}
return Arrays.equals(a,b);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String text=sc.nextLine();
System.out.println("Iterative: "+(isPalindromeIterative(text)?"Palindrome":"Not Palindrome")+" | Recursive: "+(isPalindromeRecursive(text)?"Palindrome":"Not Palindrome")+" | Array Reversal: "+(isPalindromeArrayReversal(text)?"Palindrome":"Not Palindrome"));
}
}
