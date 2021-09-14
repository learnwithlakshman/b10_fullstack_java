package com.careerit.cj.day8;

public class CountVowelsAndOtherCharacters {

	public static void main(String[] args) {

		String name = "Rama Krishna";

		// no vowels 'a','e','i','o','u'
		// no other character

		int vcount = 0;
		int ocount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vcount++;
				break;
			default:
				ocount++;
			}
		}
		System.out.println("Vowel count is :" + vcount);
		System.out.println("Other characters count is :" + ocount);
	}
}
