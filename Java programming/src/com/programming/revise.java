package com.programming;

import java.util.Iterator;
import java.util.Scanner;

public class revise {

	//reverse a string
	static String reverseString(String s) {
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}
			else
				return "not palindrome";
		}
		return "palindrome";
	}
	
	//no of words
	static int noOfWords(String s) {
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return s.charAt(0)==' '?count-1:count;
	}
	
	//no of consonants in an word
	static int noOfConsonants(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			{
				if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
					ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
				{
					count++;
				}
			}
		}
		return count;
	}
	
	//swap the case
	
	static String swapCase(String s) {
		
		String t="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				t=t+(char)(ch+32);
			}
			else if(ch>='a' && ch<='z')
			{
				t=t+(char)(ch-32);
			}
			else
				t=t+ch;
		}
		return t;
	}
	
	//trim all the spaces start and ending
	static void trimSpace(String s) {
		int ei=0,si=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ')
			{	si=i;
				break;
			}
		}
		for (int i = s.length()-1; i >=0; i--) {
			if(s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
		}
		for (int i = si; i <=ei; i++) {
			char ch=s.charAt(i);
			char ch1=s.charAt(i+1);
			if(ch!=' '||(ch==' ' && ch1!=' '))
				System.out.print(ch);
		}
	}
	
	//print * before a 
	static String printStarBeforeA(String s) {
		
		String t="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='a')
			{
				t=t+'*'+ch;
			}
			else
				t+=ch;
		}
		return t;
	}
	//linear search program
	
	static int linearSearch(String s,char k)
	{
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==k)
			{
				return i;
			}
		}
		return -1;
	}
	//subsequence of a string
	static String subSequenceOfTwoString(String s,String t) {
	
		int i=0,j=0;
		while(i<s.length() && j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else
				i++;
		}
		
		return j==t.length()?"Yes":"No";
		
		
	}
	//subString of length 4
	static int subString(String s1,String s2) {
		int count=0;
		int size=s2.length();
		for (int i = 0; i <= s1.length()-size; i++) {
			String t="";
			for (int j = i; j < i+size; j++) {
				t+=s1.charAt(j);
			}
			if(t.equals(s2))
				count++;
		}
		return count;
	}
	//substring palindrome
	static void subStringPalindrome(String s,int size) {
		for (int i = 0; i <= s.length()-size; i++) {
			String t="";
			for (int j = i; j < i+size; j++) {
				t=t+s.charAt(j);
			}
			if(isPalindrome(t))
				System.out.println(t);
		}
	}
	static boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}
			else
				return false;
		}
		
		return true;
		
	}
	//all substrings
	static void allSubString(String s) {
		for (int size = 1; size < s.length(); size++) {
			for (int i = 0; i <= s.length()-size; i++) {
				String t="";
				for (int j = i; j < i+size; j++) {
					t=t+s.charAt(j);
				}
				System.out.println(t);
			}
		}
	}
	//remove all vowels in the string
	static void removeVowelsSubString(String s) {
		for (int size = 1; size <=s.length(); size++) {
			for (int i = 0; i <= s.length()-size; i++) {
				String temp="";
				for (int j = i; j < i+size; j++) {
					temp+=s.charAt(j);
				}
				String res=isVowelremover(temp);
				if(res.length()>0) {
					System.out.println(res);
				}
			}
		}
	}
	public static String isVowelremover(String temp) {
		// TODO Auto-generated method stub
		String t="";
		for(int i=0;i<temp.length();i++)
		{
			char ch=temp.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			{
				if(!(ch=='a' || ch=='e' || ch=='o' || ch=='u'||ch=='i'
					||ch=='A' || ch=='E' || ch=='O' || ch=='U'||ch=='I'))
				{
					t=t+ch;
				}
			}
		}
		return t;
	}

	//fibonacci series
	static void fibonacci(int n) {
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		for (int i = 0; i <n; i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
	//count words
	static int countWords(String s)
	{
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return s.charAt(0)==' ' ? count:count+1;
	}
	//split words into an array
	static String[] split(String s)
	{
		int j=0;
		String t="";
		int size=countWords(s);
		String[] arr=new String[size];
		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i)!=' ')
			{
				t+=s.charAt(i);
			}
			else if(t.length()>0)
			{
				arr[j]=t;
				j++;
				t="";
			}
		}
		if(t.length()>0)
			arr[j]=t;
		return arr;
	}
	//reverse a string 
	static String reverse(String s)
	{
		String t="";
		for (int i = s.length()-1; i>=0; i--) {
			t+=s.charAt(i);
		}
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			String[] res = split(s);
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
			for (int i = res.length-1; i >=0; i--) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
			for (int i = 0; i < res.length; i++) {
				System.out.print(reverse(res[i])+" ");
			}
			System.out.println();
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i]+res[i].length()+" ");
			}
			System.out.println();
			for (int i = 1; i < res.length; i+=2) {
				System.out.print(res[i]+" "+res[i-1]+' ');
			}
			System.out.println();
			for (int i = 0,j=res.length-1; i <j; i++,j--) {
				System.out.print(res[i]+' '+res[j]+" ");
			}
			System.out.println();
			for (int i = 0,j=res.length-1; i <j; i++,j--)
			{
				System.out.print(reverse(res[j])+' '+res[i]+' ');
			}
	}

}
