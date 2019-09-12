import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Lab3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myStrings = new ArrayList<String>();

		String[] stringArray = new String[3];

		myStrings.add("Hi");
		myStrings.add("Bye");
		myStrings.add("Hi again");
		myStrings.add("And I'm still here");
		myStrings.add("See you tomorrow");

		//How to sort a list alphabetically
		Collections.sort(myStrings);

		//How to sort in descending order
		Collections.sort(myStrings, Collections.reverseOrder());

		//How to shuffle
		Collections.shuffle(myStrings);

		//Create a list of int, each index as a value of its index sum and show result (size of 10)
		List<Integer> myInts = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
		myInts.add(i);
		}
		int total = 0;
		for(int i = 0; i< 10; i++) {
		total += myInts.get(i);
		//total = total + myInts.get(i);
		}
		System.out.println("My Total: " + total);

		//Using the integer list, print the value and if it's odd or even
		for(int i = 0; i< 10; i++) {
		if(i % 2 == 0) {
		System.out.println(i + " even");
		}
		else {
		System.out.println(i + " odd");
		}

		}

		/*stringArray[0] = "Hi";
		stringArray[1] = "Bye";
		stringArray[2] = "Hi again";


		//How to switch first and last element without hard coding again for stringArray
		String temp = stringArray[2];
		stringArray[2] = stringArray[0];
		stringArray[0] =temp;
		*/

		//myStrings.add(1);
		/*int myInt =1;
		String testString = myInt+"";
		System.out.println(testString);
		if(testString.equals(myInt)) {
		System.out.println("testString = myInt");
		}
		else {
		System.out.println("testString != myInt");
		}
		*/

		//myStrings.set(2,  "It's me");

		int size = myStrings.size();
		for(int i = 0; i < size; i++) {
		/*if(i == 1) {
		myStrings.remove(i);
		}*/
		System.out.println("Index[" + i + "] =>" + myStrings.get(i));
		//System.out.println(myStrings.get(i));
		//System.out.println((Object)"string");
		//System.out.println("Array Index[" + i + "] =>" + stringArray[i]);
		}

		
		//Knuth Shuffle (couldn't find any way to do this with strings, only integers, this is what I found)
		
		
		 
		
		

		}

}
