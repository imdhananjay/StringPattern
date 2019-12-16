package com.stringpro.domore;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		System.out.println("enter the sentence to count the words");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int count=1;
		for (int i = 0; i < s1.length(); i++) {
			//if ((i==0 && s1.charAt(i)!=' ')|| (s1.charAt(i)!=' '&&s1.charAt(i-1)!=' ')) {
			if (s1.charAt(i)==' '&& i<s1.length()-1 && s1.charAt(i+1)!=' ') {
				count++;
			}
		}System.out.println("number of words in a string = "+count);
		sc.close();
	}

}
