package com.stringpro.domore;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println("enter the sentence to reverse the words");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2="";
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int u=i;
			while (i<ch.length&&ch[i]!=' ') {
				i++;
			}
			int j=i-1;
			while (j>=u) {
				s2=s2+ch[j];
				j--;
			}
			if (i<ch.length) {
				s2=s2+ch[i];
			}
		}
		System.out.println(s2);
		sc.close();
	}

}
