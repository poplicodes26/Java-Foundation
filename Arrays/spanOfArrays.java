import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n+1];
    arr[0] = scn.nextInt();
    int max = arr[0],min = arr[0];
    for(int i=1;i<n;i++){
        arr[i] = scn.nextInt();
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
    }
    
    System.out.println(max-min);
 }

}