public class InventoryBalancer {
public static void analyzeInventory(int[] sectionA,int[] sectionB) {
int totalA=0;
int totalB=0;
int max=sectionA[0];
String section="A";
int index=0;
for(int i=0;i<sectionA.length;i++){
totalA+=sectionA[i];
if(sectionA[i]>max){
max=sectionA[i];
section="A";
index=i;
}
}
for(int i=0;i<sectionB.length;i++){
totalB+=sectionB[i];
if(sectionB[i]>max){
max=sectionB[i];
section="B";
index=i;
}
}
String status=totalA==totalB?"Balanced":"Not Balanced";
System.out.println("Section A Total: "+totalA+" | Section B Total: "+totalB+" | Status: "+status+" | Highest Quantity: "+max+" (Section "+section+", Item "+(index+1)+")");
}
public static void main(String[] args) {
int[] a={20,15,30};
int[] b={25,10,30};
analyzeInventory(a,b);
}
}
