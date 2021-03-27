import java.util.*;
  
public class Main{
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int a,b;
        if(num1>num2){
            a=num1;
            b=num2;
        }
        else{
            a=num2;
            b=num1;
        }
        int r=1;
        int temp = 0;
        while(r!=0){
            r = a%b;
            a = b;
            temp = b;
            b = r;
        }
        int gcd = temp;
        System.out.println(gcd);
    
        int lcm = (num1*num2)/gcd;
        System.out.println(lcm);
    }
}