import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int a = 0;
      int b=1;
      System.out.println(a);
      System.out.println(b);
      for(int i=2;i<n;i++){
          int temp =b;
          b=a+b;
          System.out.println(b);
          a=temp;
      }
    }
  }