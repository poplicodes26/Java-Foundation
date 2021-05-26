import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        int p = power(x,n/2)*power(x,n/2);
        if(n%2!=0){
            p = p*x;
        }
        return p;
    }

}