package second;
import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	      int  destBase= scn.nextInt();
	      int d = baseChange(n,sourceBase,destBase);
	      System.out.println(d);
	   }   
	   
	   public static int baseChange(int n,int b1,int b2){
	       int t=0,i=0;
	       while(n>0){
	           t+=(n%10)*(Math.pow(b1,i));
	           n/=10;
	           i++;
	       }
	       int total=0,j=0;
	       while(t>0){
	           total+=(t%b2)*(Math.pow(10,j));
	           t/=b2;
	           j++;
	       }
	       return total;
	   }
}