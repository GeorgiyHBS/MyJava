
public class Conditionals_learnjavaonline {

	public static void main(String[] args) {
		Main a = new Main() {
			@Override
			public boolean equals(Object obj){
				return true;
			}			
		}; 
		
		Main b = a;
		
		Main c = new Main(){
		public boolean equals(Object obj) {
			return false;
		}
	};	
		
		// TODO Auto-generated method stub
//		        String a = new String("Wow");
//		        String b = "Wow";
//		        String c = a;
//		        String d = c;

		        boolean b1 = a == b;
		        boolean b2 = b.equals(b + "!");
		        boolean b3 = !c.equals(a);

		        if (b1 && b2 && b3) {
		            System.out.println("Success!");
		        }
		}	
	}
