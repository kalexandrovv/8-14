package paki4;

import java.util.*;

public class PriorityQueueZad {

	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<String>(Arrays.asList("George" ,"George","John","Blake","Kevin","Michael" ));
		PriorityQueue<String> q2 = new PriorityQueue<String>(Arrays.asList("George","Katie","Kevin","Michelle","Ryan"));
	

		System.out.println(q1 + "\n" + q2);
		PriorityQueue<String> union = new PriorityQueue<> (q1);
		union.addAll(q2);
		
		PriorityQueue<String> intersection = new PriorityQueue<> (q1);
		intersection.retainAll(q2);
		
		PriorityQueue<String> difference = new PriorityQueue<> (union);
		difference.removeAll(intersection);
		
		System.out.println("Union of sets: " + union);
		System.out.println("Difference of sets: " + difference);
		System.out.println("Intersection of sets: " + intersection);
	}

}