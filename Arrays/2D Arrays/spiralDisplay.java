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
        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;
        int count =0;
        while(count<n*m){
            //leftwall
            for(int i=minr;i<=maxr && count<m*n;i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
            //bottomwall
            for(int i=minc;i<=maxc && count<m*n;i++){
                System.out.println(arr[maxr][i]);
                count++;
            }
            maxr--;
            //rightwall
            for(int i=maxr;i>=minr && count<m*n;i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            //topwall
            for(int i=maxc;i>=minc && count<m*n;i--){
                System.out.println(arr[minr][i]);
                count++;
            }
            minr++;
        }
        
    }

}