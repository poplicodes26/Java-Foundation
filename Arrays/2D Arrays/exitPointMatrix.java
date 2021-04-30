import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int dir = 0;
        int i=0;
        int j=0;
        while(true){
            if(dir==0){
                while(arr[i][j]!=1){
                    
                    if(j==m-1 && arr[i][j]==0){
                        System.out.println(i);
                        System.out.println(j);
                        return;
                    }
                    j++;
                }
                dir=(dir+1)%4;
               
                i++;
            }
            if(dir==1){
                while(arr[i][j]!=1){
                    
                    if(i==n-1 && arr[i][j]==0){
                        System.out.println(i);
                        System.out.println(j);
                        return;
                    }
                    i++;
                }
                dir=(dir+1)%4;
                
                j--;
            }
            if(dir==2){
                while(arr[i][j]!=1){
                    
                    if(j==-1 && arr[i][j]==0){
                        System.out.println(i);
                        System.out.println(j);
                        return;
                    }
                    j--;
                }
                dir=(dir+1)%4;
                
                i--;
            }
            if(dir==3){
                while(arr[i][j]!=1){
                    
                    if(i==-1 && arr[i][j]==0){
                        System.out.println(i);
                        System.out.println(j);
                        return;
                    }
                    i--;
                }
                dir=(dir+1)%4;
                
                j++;
            }
        }
        
    }
}