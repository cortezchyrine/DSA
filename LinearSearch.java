public class LinearSearch {
	public static void main(String[] args){
	  Scanner input = new Scanner (System.in);
  	  Random rad = new Random();
		
  	  int size;
  	  int srch;
  	  int []arr;
  	
  		System.out.println("Enter Array size: ");
  		size= input.nextInt();
  		
  		arr = new int[size];
  		
  		for (int i=0; i<=size-1; i++){
  			arr[i]=rad.nextInt(1000);
  			System.out.println(arr[i]);
  		}
  		
  		System.out.println("Enter a Number to search: ");
  		srch = input.nextInt();
  		
  		for(int k=0; k<=size-1; k++){
  			if(srch==arr[k]){
  				System.out.println("FOUND: " + srch + " is at array[" + k + "]");
  			  break;
  			}
  			if (k==size-1){
  
  				System.out.print("NOT FOUND: " + srch + " is not in the Array");
  			}
  
  		}
  }
}
