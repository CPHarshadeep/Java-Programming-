package com.programming;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.crypto.EncryptedPrivateKeyInfo;

public class collections {

	//take the values from the user and remove the duplicates values
	static void takeInput(int[] arr)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (Integer x : set) {
			System.out.println(x);
		}
	}
	
	//program to remove duplicate characters in string and print in insertion order
	static void removeDuplicates(String s)
	{
		//LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		TreeSet<Character> set = new TreeSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			set.add(ch);
		}
		for (Character x : set) {
			System.out.print(x);
		}
		
	}
	//print numbers in increasing order
	static void removeDuplicates(int[] a)
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer x : set) {
			System.out.println(x);
		}
	}
	
	//print unique urls in the string 
	static void uniqueUrl(String s)
	{
		String[] arr=split(s);
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			
			String res[]=arr[i].split("\\.");
			set.add(res[1]);
		}
		for (String x : set) {
			System.out.println(x);
		}
	}
	
	
	private static String[] split(String s) {
		// TODO Auto-generated method stub
		
		int n=countWords(s);
		String t="";
		int j=0;
		String[] arr=new String[n];
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=',')
			{
				t=t+s.charAt(i);
			}
			else if(t.length()>0)
			{
				arr[j]=t;
				j++;
				t="";
			}
		}
		if(t.length()>0)
		{
			arr[j]=t;
		}
	return arr;
	}

	static int countWords(String s)
	{
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			char ch=s.charAt(i);
			char ch1=s.charAt(i+1);
			if(ch==',' && ch1!=',')
				count++;
			
		}
		return s.charAt(0)==','?count:count+1;
	}
	
	//remove duplicate words and print in the first occurence 
	
	static void printRemoveDuplicate(String s)
	{
		LinkedHashSet<String> set = new LinkedHashSet<String>();
			String arr[]=s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
	
		}
		for (String x : set) {
			System.out.println(x);
		}
	}
	
	//countNoOfOccurence and concat it
	
	static void concatOccurence(String s)
	{
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				int c=map.get(ch);
				map.put(ch, c+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		String t="";
		Set<Entry<Character,Integer>> entries=map.entrySet();
		for(Entry<Character,Integer> e: entries )
		{
			t=t+e.getKey()+e.getValue();
		}
		System.out.println(t);
	}
	//array of n integers print their no of pairs present
	
	static void ArrayPairsPresent(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]))
			{
				int x=map.get(arr[i]);
				map.put(arr[i],x+1); 
			}
			else
			{
				map.put(arr[i], 1);
			}
			
		}
		Collection<Integer> val = map.values();
		int sum=0;
		
		for (Integer x : val) {
			sum=sum+x/2;
		}
		System.out.println(sum);
	
	
	}
	//print more than 3 times repeated words in a String
	
	static  void printRepeatedWords(String s)
	{	
		String[] arr=s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]))
			{
				int val=map.get(arr[i]);
				map.put(arr[i], val+1);
			}
			else
				map.put(arr[i], 1);
		}
			Set<Entry<String, Integer>> entries = map.entrySet();
			for (Entry<String, Integer> x : entries) {
				if(x.getValue()>3)
				{
					System.out.println(x.getKey());
				}
			}
	
	}

	//print the maximum repeated word 
	static void maxRepeatedWord(String s)
	{
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		String[] arr=s.split(" ");
		for (int i = 0; i < arr.length; i++) {
	/*		if(map.containsKey(arr[i]))
			{
				int val=map.get(arr[i]);
				map.put(arr[i], val+1);
			}
			else
				map.put(arr[i], 1);*/
			int v=map.getOrDefault(arr[i], 0);
			map.put(arr[i], v+1);
		}
		Set<Entry<String, Integer>> set = map.entrySet();
		int max=0;
		String index="";
		for(Entry<String,Integer> e: set)
		{
			if(e.getValue()>max)
			{
				max=e.getValue();
				index=e.getKey();
			}
		}
		System.out.println(index);
	}
	
	//program to print the safe group
	
	static int safeGroup(int[] arr)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i]))
			{
				count++;
				set.clear();
			}
			else
				set.add(arr[i]);
		}
		return count;
	}
	//encrypt a String
	
	static String encryptString(String s,int k)
	{
		 String t="";
		 
		 for(int i=0;i<s.length();i++)
		 {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				int x=ch-65;
				x=(x+k)%26;
				x=x+65;
				t=t+(char)x;
			}
			else if(ch>='a' && ch<='z')
			{
				int x=ch-97;
				x=(x+k)%26;
				x=x+97;
				t=t+(char)x;
			}
			else
				t=t+ch;
		 }
		 return t;
	}
	
		public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int k = scan.nextInt();
		String res = encryptString(s, k);
		System.out.println(res);
		
		}
}