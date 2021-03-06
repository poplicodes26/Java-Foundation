import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a,int l,int r){
      int n = r-l+1;
      int k = l;
      int j = r;
      for(int i=0;i<n/2;i++){
          int temp = a[k];
          a[k] = a[j];
          a[j] = temp;
          k++;
          j--;
      }
  }

  public static void rotate(int[] a, int k){
    int n = a.length;
    k=k%n;
    if(k<0){
        k=k+n;
    }
    reverse(a,0,n-k-1);
    reverse(a,n-k,n-1);
    reverse(a,0,n-1);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}