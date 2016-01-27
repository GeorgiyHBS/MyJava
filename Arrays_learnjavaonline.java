
public class Arrays_learnjavaonline {
	
	    public static void main(String[] args) {
	    	
	        int[] intNumbers = {1, 2, 3};       
	     // an array of chars
	     // char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
	        int length = intNumbers[2];
	        char[] chars = new char[length];
	        chars[intNumbers.length - 2] = 'y';
	        System.out.println("Done!");
	    }
	}

