// 100
//while loop 
//-1 "bottles"
//1  "bottle" 
public class Test100 {

	public static void main(String[] args) {
		int numbers = 100;
		System.out.println("Welcome to juice factory!");

		while ( numbers  > 0 )
			{
			
			if ( numbers == 1 ){
				System.out.println("One bottle in the basket! " + numbers);
				}
			else {
			System.out.println( "Bottles in the basket: " + numbers );
			}
			numbers = numbers - 1;
		}	
	}
}
