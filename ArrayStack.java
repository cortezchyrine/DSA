package cortezIS2;

/*
SOURCE CODE: ArrayStack.java
AUTHOR NAME: Cortez, Chyrine A.
GITHUB URL: github.com/cortezchyrine
LAST UPDATE: [08/18/2016]
*/

//start

import java.util.*;

public class ArrayStack {
	Scanner in = new Scanner(System.in);
	
	  private int capacity;
	  private int top = 0;
	  private String[] storage;
	 
	  public ArrayStack(int size) {
		capacity = size;
	    storage = new String[capacity];
	  }
	  
	  public void show() {
		    for (int i = capacity-1; i >= 0; i--) {
		    	System.out.println("stack[" + i + "] = " + storage[i]);
		    }
		    System.out.println();
		  }
	  
	  private boolean isEmpty() {
		    if (storage[0] == null) {
		      System.out.println("Storage is Empty");
		      return true;
		    } 
		    return false;
	  }
	
	  private boolean isFull() {
		    if (top == capacity) {
		      System.out.println("Storage is Full");
		      return true;
		    } 
		    return false;
	  }
	  
	  public void push(String value) {
		    if (isFull()) {
		      System.out.println("Add failed.");
		    } else {
		      System.out.println("Trying to push on stack[" + top + "] ...");
		      storage[top] = value;
		      top++;
		      
		      System.out.println(value + " was successfully added.");
		      System.out.println();
		    }
	  }
	  
	  public void pop() {
		    if (isEmpty()) {
		      System.out.println("Remove failed.");
		    } else {
		      System.out.println("Trying to pop stack[" + (top-1) + "] ...");
		      storage[top] = null;
		      top--;
		      System.out.println(storage[top] + " was successfully removed.");
		      System.out.println();
		    }
	  }
	  
	  public void peek() {
		    if (storage[top] == storage[0]) {
		      System.out.println("PEEK TOP = " + storage[top]);
		      System.out.println();
		    } else {
		      System.out.println("PEEK TOP = " + storage[top-1]);
		      System.out.println();
		    }
	  }
	  
	  
	  
	  public static void main(String[] args) {
		    ArrayStack storage = new ArrayStack(10);
		    System.out.println("STORAGE CAPACITY = " + storage.capacity);
		    System.out.println();

		    storage.show(); // show empty stack
		    storage.pop(); // try removing on an empty stack
		    storage.peek(); // peek top element of an empty stack
		    storage.push("one");
		    storage.show(); // show the updated stack
		    storage.peek(); // peek if top element is "one"
		    storage.push("two");
		    storage.show(); // show the updated stack
		    storage.peek(); // peek if top element is "two"
		    storage.push("three");
		    storage.show(); // show the updated stack
		    storage.peek(); // peek if top element is "three"
		    storage.push("four");
		    storage.show(); // show the updated stack
		    storage.push("five"); 
		    storage.show(); // show the updated stack
		    storage.pop(); // try removing "five"
		    storage.push("six"); 
		    storage.push("seven"); 
		    storage.push("eight"); 
		    storage.push("nine");    
		    storage.push("ten"); 
		    storage.show(); // show the updated stack
		    storage.peek(); // peek if top element is "ten"
		    // try adding "eleven"
		    // try adding "twelve"
		    // show the updated stack
	  }
	  
	  
	//end of program
}
