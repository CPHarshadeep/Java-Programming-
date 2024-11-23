package com.programming;


import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

public class Strings {
	//reverse string
	public static String reverseString(String s){
		String temp="";
		for (int i = s.length()-1; i >=0; i--) {
			temp+=s.charAt(i);
		}
		return temp;
	}
	//check palindrome of a string
	static String isPalindrome(String s) {
//		String temp="";
//		for (int i = s.length()-1; i >=0; i--) {
//			temp+=s.charAt(i);
//		}
//		if(s.equals(temp)) {
//			System.out.println("palindrome");
//		}
//		else
//			System.out.println("not palindrome");
//	}
	int i=0,j=s.length()-1;
	while(i<j) {
		if(s.charAt(i)==s.charAt(j))
		{
			i++;
			j--;
		}
		else
		{
			return "not palindrome";
		}
	}
	return "palindrome";
	}
	//no of spaces in a string
	static int noOfSpaces(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	//count no of words
	static int  countWords(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				count++;
		}
		return s.charAt(0)==' '?count:count+1;
		
	}
	//count the vowels
	static int countVowels(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
		||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		return count;
	}
	//count consonants
	static int countConsonants(String s) {
		//return (s.length()-vc); length-vowelcount
		int cc=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if((ch>='A'&& ch<='Z')|| (ch>='a' && ch<='z')) {
				if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
		||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			
						cc++;
			}
		}
		return cc;
	}
	//count vowels alphabets characters
	static void countAllCharacters(String s) {
		int vc=0,cc=0,nc=0,spc=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if ((ch>='A' && ch<='Z') || (ch>='a'&& ch<='z')) {
				if ((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
		||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
					vc++;
				} else {
					cc++;
				}
			} 
			else if(ch>='0' && ch<='9') {
					nc++;
			}
			else
				spc++;
		}
		System.out.println("vowels "+vc);
		System.out.println("consonats "+cc);
		System.out.println("numerical characters "+nc);
		System.out.println("special characters "+spc);
		
	}
	//remove special characters
	static String removeSpecialCharacter(String s) {
		String t="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch>='A' && ch<='Z'||ch>='a' && ch<='z'|| 
				ch>='0' && ch<='9') {
				t=t+ch;
				//System.out.print(ch);
			}
		}
		return t;
	}
	//print alphabets together and number together
	static String printAllCharactersTogether(String s) {
		String t1="",t2="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch>='A' && ch<='Z'||ch>='a' && ch<='z') {
				t1+=ch;
			} else if(ch>='0' && ch<='9'){
				t2+=ch;

			}
		}
		return t1+t2;
	}
	//print alphabets and count together
	static String AlphabetsAndNumericalSum(String s) {
			int sum=0;
			String t="";
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
					t=t+ch;
				} else if(ch>='0' && ch<='9') {
					sum=sum+ch; //because of implicit typecasting 
					//subtract 0 ascii value
				}
			}
			return t+sum;
		
	}
	//convert to lowercase
	static String lowerCase(String s) {
			String temp="";
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				if((ch>='A' && ch<='Z')) {
					temp=temp+(char)(ch+32);//A-> 65 a-> 97 
					//convert upper to lower add 32
					//convert lower to upper substract 32
				}
				else
					temp+=ch;
					
			}
			return temp;
	}
	//convert into uppercase
	static String upperCase(String s){
		String t="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='a'&& ch<='z') {
				t=t+(char)(ch-32);
			} else {
				t+=ch;
			}
		}
		return t;
	}
	//swap the case
	static String swapCase(String s){
		
		String t="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch>='A'&&ch<='Z') {
				t=t+(char)(ch+32);
			} else if (ch>='a'&& ch<='z') {
				t=t+(char)(ch-32);
			}
			else
				t+=ch;

			}
		return t;
		}
	//removing starting and ending spaces
	static String trimStartAndEnd(String s){
		int si=0,ei=0;
		String t="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i >=0; i--) {
			if(s.charAt(i)!=' ') {
				ei=i;
				break;
			}
		}
		for (int i = si; i <=ei; i++) {
			t+=s.charAt(i);
		}
		return t;
	}
		
	//remove all the spaces
	static String trimAllSpace(String s){
		int si=0,ei=0;
		String t="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i >=0; i--) {
			if(s.charAt(i)!=' ' ) {
				ei=i;
				break;
			}
		}
		for (int i = si; i <=ei; i++) {
			if(s.charAt(i)!=' ' || s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
				t+=s.charAt(i);
			}
				
		}
		return t;
	}
	//program to print * before a
	static String printStarbeforeA(String s) {
		String temp="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a')
			{
				temp=temp+'*'+s.charAt(i);
			}
			else
				temp+=s.charAt(i);
		}
		return temp;
	}
	//count uppercase vowels
	static int countUpperCaseVowels(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					count++;
				}
			}
		}
		return count;
	}
	
	
	//linear search program (print the index of k in string)
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
	
	//find t string in the s string subsequently
	static String subsequenceString(String s,String t) {
		int i=0,j=0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
			}
			else
				i++;
		}
		
		return j==t.length()?"yes":"no";
	}
	//substring of user length
	
	static void subString(String s,int size) {
		for (int i = 0; i <= s.length()-size; i++) {
			String t="";
			for (int j = i; j < i+size; j++) {
				t=t+s.charAt(j);
			}
			System.out.println(t);
			
		}
	}
	//string s2 is present in s1 find substring present or not
	static String subStringPresentInS1(String s1,String s2) {
		int size=s2.length();
		for (int i = 0; i <= s1.length()-size; i++) {
			String t="";
			for (int j = i; j < i+size; j++) {
				t=t+s1.charAt(j);
			}
			if(t.equals(s2)) {
				return "yes";
			}
		}
		return "no";
	}
	//count how many times string have occured in substring
	static int countOccurenceOfString(String s1,String s2) {
		int size=s2.length();
		int count=0;
		for (int i = 0; i <= s1.length()-size; i++) {
			String temp="";
			for (int j = i; j < i+size; j++) {
				temp+=s1.charAt(j);
			}
			if(temp.equals(s2))
				count++;
		}
		return count;
	}
	
	//print the palindrome subString 
	static void printPalindromeSubString(String s,int size) {
		for (int i = 0; i <=s.length()-size; i++) {
			String t="";
			for (int j = i; j <i+size; j++) {
				t=t+s.charAt(j);
			}
			if((isPalindromeCheck(t))) {
				System.out.println(t);
			}
		}
	}
	
	static boolean isPalindromeCheck(String t){
		int i=0,j=t.length()-1;
		while(i<j) {
			if(t.charAt(i)==t.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				
				return false;
			}
		}
		return true;
	}
	
	//print substring have vowels in it
	
	static void printVowelSubString(String s,int size) {
		for (int i = 0; i <= s.length()-size; i++) {
			String t="";
			for (int j = i; j < i+size ; j++) {
				t=t+s.charAt(j);
			}
			if(countConsonants(t)>0)
			{
				System.out.println(t);
			}
		}
	}
	
	//printAll substrings in a string
	static void allSubString(String s) {
		for (int size = s.length(); size>0 ; size--) {
			for (int i = 0; i <=s.length()-size; i++) {
				String t="";
				for (int j = i; j < i+size; j++) {
					t+=s.charAt(j);
				}
	
				
			}
		}
	}
	//longest palindrome substring
	static void longestPalindromeSubString(String s) {
		for (int size = s.length(); size>0 ; size--) {
			for (int i = 0; i <=s.length()-size; i++) {
				String t="";
				for (int j = i; j < i+size; j++) {
					t+=s.charAt(j);
				}
				if(isPalindromeCheck(t)) {
					System.out.println(t);
					return;
				}
			}
		}
	}
	
	//fibonacci series
	
	static void fibonacciSeries(int n) {
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		for (int i = 0; i < n; i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
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
	
		
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			fibonacciSeries(n);
	}
}