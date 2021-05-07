package paki4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Stolici {

	public static void main(String[] args) {
		
		Map<String, String> capitals = new HashMap<String, String>();
		int points = 0, countries = 0;

		capitals.put("Bulgaria", "Sofia");
		capitals.put("England", "London");
		capitals.put("Germany", "Berlin");
		capitals.put("China", "Beijing");
		capitals.put("Turkey", "Ankara");
		capitals.put("Greece", "Atina");
		capitals.put("Serbia", "Belgrade");
		capitals.put("France", "Paris");
		capitals.put("Spain", "Madrid");
		capitals.put("Italy", "Rome");
		
		Scanner sc = new Scanner(System.in);
		List<String> keys = new ArrayList<String>(capitals.keySet());
		Collections.shuffle(keys);
		for (String country : keys) {
			System.out.println(country);
			String capital = sc.nextLine();
			if (capital.equals(capitals.get(country))) {
				points++;
			}else {
				points--;
			}
			countries++;
		}
		sc.close();
		System.out.println("You have " + points + "/" + countries);
	
	}
}
