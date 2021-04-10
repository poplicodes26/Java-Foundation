import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int sub=0,total=0,i=0,borrow=0;
       while(n2>0){
           int d1=n2%10;
           int d2=n1%10;
           sub=d1-d2-borrow;
           if(sub<0){
               borrow=1;
               sub+=b;
           }
           else{
               borrow=0;
           }
           total+=(sub)*(Math.pow(10,i));
           i++;
           n1/=10;
           n2/=10;
       }
       return total;
   }
  
  }