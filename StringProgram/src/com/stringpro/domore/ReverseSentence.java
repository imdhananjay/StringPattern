package com.stringpro.domore;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		String s2="";
		for (int i = ch.length-1; i >= 0; i--) {
			int u=i;
			while (i>=0&&ch[i]!=' ') {
				i--;
			}
			for (int j =i+1; j <= u; j++) {
				s2=s2+ch[j];
			}
			if (i>=0) {
				s2=s2+ch[i];
			}
		}System.out.println(s2);
	}

}
