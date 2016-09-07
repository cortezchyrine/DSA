package cortez;
import java.util.*;
public class TotalMax {
	
	public static void main (String[] args){
		 Scanner in = new Scanner(System.in);
		 
		 int[] array = {3, 10, 500, 4};
		 int sum = 0;
		 int max = 0;
		 

		 
		 for (int i = 0; i < array.length; i++){
			 
			 if (array[i] > max){
				 max = array[i];
			 }
			 System.out.println("Enter an Arrays");
			 System.out.println("array["+i+"] = " + array[i]);
			
		 }
		 System.out.println("");
		 for (int i: array){
			 sum += i;
		 }
		 double average = sum / array.length;
		 
		 System.out.println("Sum = " + sum);
		 System.out.println("Average = " + average);
		 System.out.println("Max = " + max);
		 
		 
	 }
}
