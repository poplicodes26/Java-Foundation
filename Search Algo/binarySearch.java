import java.util.*;

public class main {
	public static void main(String args[]) {
		 int arr[]  = {10,20,30,40,50,60,70,80,90,100};
		 Scanner scn = new Scanner(System.in);
		 int x = scn.nextInt();
		 int low = 0;
		 int high = arr.length-1;
		 while(low<=high) {
			 int mid = (low+high)/2;
			 if(x>arr[mid]) {
				 low = mid+1;
			 }
			 else if(x<arr[mid]) {
				 high = mid-1;
			 }
			 else {
				 System.out.println("Found at "+mid+" index!");
				 return;
			 }
		 }
		 System.out.println("Not found!");
	}
	    
}
