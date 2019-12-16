package com.stringpro.domore;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("enter the sentence to reverse");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}sc.close();
	}

}
