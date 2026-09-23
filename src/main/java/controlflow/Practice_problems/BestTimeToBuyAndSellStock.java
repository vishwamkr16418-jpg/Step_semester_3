import java.util.*;
public class BestTimeToBuyAndSellStock{
public static int maxProfit(int[] prices){
int min=prices[0];
int max=0;
for(int i=1;i<prices.length;i++){
if(prices[i]<min)min=prices[i];
else if(prices[i]-min>max)max=prices[i]-min;
}
return max;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] prices=new int[n];
for(int i=0;i<n;i++)prices[i]=sc.nextInt();
System.out.println(maxProfit(prices));
}
}
