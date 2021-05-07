package paki4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Broene {

	public static void main(String[] args) throws Exception {
		File file = new File("src/paki4/textText.txt");
		if (file.exists()) {
			prebroi(file);
		}else {
			System.out.println("File does not exist");
		}
		
	}
		
		public static void prebroi (File file) throws Exception {
			Character[] a = { 'a', 'o', 'e', 'u', 'i' , 'A', 'O', 'E', 'U', 'I' };
			Set<Character> set = new HashSet<Character>(Arrays.asList(a));
			int vowels = 0;
			int consonants = 0;
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			int c = 0 ;
			boolean conflict = false;
			while ((c= br.read()) != -1) {
				char character = (char) c;
				if (character > 'a' && character < 'z' || character > 'A' && character < 'Z') {
					if(set.contains(character)) {
						vowels++;
					}else {
						consonants++;
					}
					
				}
				
				}
			System.out.println("Vowels: " + vowels + " , consonants: " + consonants);
				
		
				}
			
		

		
		}

