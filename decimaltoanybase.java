import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int total=0,i=0;
       while(n>0){
           total+=(n%b)*(Math.pow(10,i));
           n/=b;
           i++;
       }
       return total;
   }
  }