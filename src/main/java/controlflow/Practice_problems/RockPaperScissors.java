import java.util.*;
public class RockPaperScissors {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Random r=new Random();
int wins=0,losses=0,draws=0;
for(int i=1;i<=n;i++){
String player=sc.next();
int x=r.nextInt(3);
String computer=x==0?"Rock":x==1?"Paper":"Scissors";
System.out.print("Round "+i+" - Player: "+player+", Computer: "+computer+" ");
if(player.equalsIgnoreCase(computer)){
System.out.println("Draw");
draws++;
}else if((player.equalsIgnoreCase("Rock")&&computer.equals("Scissors"))||(player.equalsIgnoreCase("Paper")&&computer.equals("Rock"))||(player.equalsIgnoreCase("Scissors")&&computer.equals("Paper"))){
System.out.println("Player Wins");
wins++;
}else{
System.out.println("Computer Wins");
losses++;
}
}
System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",wins,losses,draws,wins*100.0/n);
}
}
