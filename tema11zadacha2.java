package paki4;

import java.util.LinkedList;
import java.util.Scanner;

public class tema11zadacha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// O(n^2)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string.");
		String string = input.nextLine();
		
		LinkedList<Character> max = new LinkedList<>();
		
		LinkedList<Character> list = new LinkedList<>();
		
		for (int i = 0; i<string.length(); i++) {
			list.add(string.charAt(i));
			for(int j = i+1; j < string.length(); j++) {
				if(string.charAt(j) > list.getLast()) {
					list.add(string.charAt(j));
				}
			}
			if (list.size() > max.size()) {
				max.clear();
				max.addAll(list);
			}
			list.clear();
		}
		
		System.out.println(max.toString());
	}

}