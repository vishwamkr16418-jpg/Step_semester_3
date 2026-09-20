public class TrafficStreakAnalyzer {
public static void findLongestStreak(String signalLog) {
int max=1;
int current=1;
char maxColor=signalLog.charAt(0);
for(int i=1;i<signalLog.length();i++){
if(signalLog.charAt(i)==signalLog.charAt(i-1)) current++;
else current=1;
if(current>max){
max=current;
maxColor=signalLog.charAt(i);
}
}
System.out.println("Longest Streak: '"+maxColor+"' repeated "+max+" times");
}
public static void main(String[] args) {
findLongestStreak("RRGGGYRR");
}
}
