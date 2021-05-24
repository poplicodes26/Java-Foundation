import java.io.*;
import java.util.*;

public class Main {
    
    public static int fact(int n){
        int f = 1;
        for(int i=2;i<=n;i++){
            f*=i;
        }
        return f;
    }

	public static void solution(String str){
		StringBuilder sb = new StringBuilder(str);
		
		int n = sb.length();
		
		for(int i=0;i<fact(n);i++){
		    int d = i;
		    for(int j=0;j<n;j++){
		        int r = d%(n-j);
		        d/=(n-j);
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		    }
		    sb = sb.append(str);
		    System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}