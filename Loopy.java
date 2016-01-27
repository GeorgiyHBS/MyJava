
//A while loop runs everything with a block as long as the condition test is true. 
//If the conditional is false, the while loop code block won't run, and execution will
//move down to the code immediately after the loop block.

public class Loopy {

	public static void main(String[] args) {
		
	int x = 1;
	System.out.println("Before the Loop");
	while (x == 20){
		System.out.println("In the loop");
		System.out.println("Value of x is"  +  x);
		x = x + 1;
	}
	
	System.out.println("This is after the loop");
	
	}

}
