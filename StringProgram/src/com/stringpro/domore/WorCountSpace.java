package com.stringpro.domore;

import java.util.Scanner;

public class WorCountSpace {

	public static void main(String[] args) {
		System.out.println("enter the sentence to count the words");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if (i==0 && ch[i]!=' '|| ch[i]!=' '&&ch[i-1]==' ') {
				count++;
			}
		}System.out.println("number of words in a string = "+count);
		sc.close();
	}
}
