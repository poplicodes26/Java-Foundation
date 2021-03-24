package first;

import java.util.*;
import java.lang.Math;

public class program {
	  
	  public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	  
	      int t = scn.nextInt();
	      
	      while(t>0){
	        int n = scn.nextInt();
	        boolean flag = true;
	        
	        for(int i=2;i*i<=n;i++){
	            if(n%i==0){
	              System.out.println("not prime");
	              flag=false;
	              break;
	            }
	        }
	        if(flag==true){
	            System.out.println("prime");
	        } 
	        t--;
	      }
	  
	  }
}
	

	
