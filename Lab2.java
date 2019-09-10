
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*	for (int k = 0; k< 20; k++) {
			int count =0;
			float floatCount = 0.0f;
			
			//float total = 0f;
		for(int i = 0; i < 10; i++) {
			count ++;
			floatCount += 0.1f;
		}
		System.out.println("Count: " + count);
		System.out.println("Float Count: " + floatCount );
		if(floatCount == 1) {
			System.out.println("It's actually 10!");
		}
	  }
	*/  
		
	String name = "Bob"; //If "Bob" is replaced by null; you will get an error here
	if("Bob".equals(name)) {
		System.out.println("Bob equals name");
	}
	if(name.equals("Bob")) {
		System.out.println("Name equals Bob");
	}
	if("Bob" == (name)) {
		System.out.println("Bob is name");
	}
	}
	

}
