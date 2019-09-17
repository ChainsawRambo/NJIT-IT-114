import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.*;  
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Review from Assignment Sept 12-17

		//Reverse shuffle

		List<String> strings = new ArrayList<String>();
		strings.add("b");
		strings.add("c");
		strings.add("a");
		strings.add("d");

		Collections.sort(strings, Collections.reverseOrder());

		//How to shuffle

		Collections.shuffle(strings);

		for(int i = 0; i < strings.size(); i++) {
		System.out.println(strings.get(i));
		}

		//Create a List of numbers, set each value of each index to that index (0, 1, 2, 3, etc) for 10 entries.
		//Sum this list and output the total
		//In a separate test, iterate through the list and display each value along with "odd" or "even" depending if that particular index's value is odd or even.

		List<Integer> ints = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
		ints.add(i);
		}
		int total = 0;
		for(int i = 0; i < ints.size(); i++) {
		total += ints.get(i);
		System.out.println(ints.get(i));
		}
		System.out.println("total = " + total);
		for(int i = 0; i < ints.size(); i++) {
		int t = ints.get(i);
		System.out.println(t + " is " +(t%2==0?"even":"odd"));
		}



		//Knuth's Shuffle

		int n = strings.size();
		for(int i = 0; i < n; i++) {
		double mr = Math.random();
		System.out.println("Rand: " + mr);
		int r = (int)(mr * (i+1));
		System.out.println("Rand index: " + r);
		System.out.println("Current index: " + i);
		Object swap = strings.get(r);
		strings.set(r, strings.get(i));
		strings.set(i, (String)swap);
		}
		System.out.println("Knuthed");

		//In Class Lab

		Object test = 1;
		System.out.println("My Type is " + test.getClass().getName() + " change my value and rerun");

		String sample = "hi";
		Object test2 = sample;
		System.out.println("My val: " + test2);

		Object test3 = "bye";
		String sample2 = (String)test3;
		System.out.println("My val: " + sample2);

		String numberString = "";
		int number = 20;
		try {
		number = Integer.parseInt(numberString);
		}
		catch(Exception e) {
		//just ignoring it
		//e.printStackTrace();

		}
		System.out.println("My num: " + number);
		System.out.println("");
		String ImBroken = null;
		System.out.println("Broken String: " + ImBroken);


		Queue<TestKVP> q = new LinkedList<TestKVP>();
		List<String> t = new ArrayList<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		
		//My first attempt at using another method for queues
		
		System.out.println("head:"+q.element());

		for(int i = 0; i < 10; i++) {
		Collections.shuffle(t);
		String temp = ""+t.get(0);
	//	q.add(new TestKVP(i, temp));

		}
		System.out.println("Show queue: " + q);
		TestKVP first = q.remove();
		System.out.println("First: " + first);
		System.out.println("Altered Queue: " + q);
		
		TestKVP peek = q.peek();
		System.out.println("Viewing First: " + peek);
		System.out.println("Unaltered Queue: " + q);
		
		//My second attempt at using another method for queues
		
		q.poll();
		System.out.println(q);
		

		}
		class TestKVP{
		public int key;
		public String value;
		public TestKVP(int k, String v) {
		this.key = k;
		this.value = v;
		}

		//My attempt to use Overriding toString() method
		
		@Override
		public String toString() {
		return "{'key':'" +this.key;
		}
	
		
		//Example of Overriding toString() method found online
		
		/*@Override
    public String toString() { 
        return String.format(re + " + i" + im); 
    } 
    */
		
		//Methods for queues not covered in class
		
		//queue.poll() and queue.element()
	}

}
