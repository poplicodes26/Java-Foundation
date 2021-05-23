import java.io.*;
import java.util.*;

public class Main {

	public static StringBuilder toggleCase(String str){
	    
		StringBuilder sb = new StringBuilder(str);
		
		int n= sb.length();
		
		for(int i=0;i<n;i++){
		    char c=sb.charAt(i);
		    if(Character.isUpperCase(c)==true){
		        char cc = Character.toLowerCase(c);
		        sb.setCharAt(i, cc);
		    }
		    else if(Character.isLowerCase(c)==true){
		        char cc = Character.toUpperCase(c);
		        sb.setCharAt(i , cc);
		    }
		}

		return sb;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}