import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int arr[][] = new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               arr[i][j] = scn.nextInt();
           }
       }
       int x = scn.nextInt();
        
        for(int i=n-1;i>=0;i--){
            boolean f = false;
            int ind = 0;
            for(int j=0;j<n;j++){
                if(x<arr[j][i]){
                    f = true;
                    ind =j;
                    break;
                }
                else if(x==arr[j][i]){
                    System.out.println(j);
                    System.out.println(i);
                    return;
                }
            }
            if(f==true){
                for(int j=0;j<n;j++){
                    if(arr[ind][j]==x){
                        System.out.println(ind);
                        System.out.println(j);
                        return;
                    }
                }
            }
        }  
        System.out.println("Not Found");
    }

}