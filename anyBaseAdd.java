import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int total=0,ans=0,i=0;
      while(n1>0 || n2>0){
          ans=(n1%10)+(n2%10);
          total+=(ans%b)*(Math.pow(10,i));
          n1/=10;
          n2/=10;
          if(ans>=b){
              n2+=1;
          }
          i++;
      }
      return total;
   }
  }