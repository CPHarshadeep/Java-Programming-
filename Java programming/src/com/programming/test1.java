package com.programming;

import java.util.Scanner;

public class test1 {

 	  // M numbers greater than N
 	static void nPrime(int n,int m)
 	{
 		int count=0;
 		
 		for(int i=m;count<=n;i++)
 		{
 			if(isPrime(i))
 			{
 				System.out.print(i+" ");
 				count++;
 			}
 		}
 	}
 	static boolean isPrime(int i)
 	{
 		for(int j=2;j*j<=i;j++)
 		{
 			if(i%j==0)
 			{
 				return false;
 			}
 		}
 		return true;
 	}
 	
 	
 	
 	
	

	//factorial of a number
 	static int fact(int n)
 	{
 		if(n!=0)
 			return n*fact(n-1);
		else
			return 1;
	}
 	//factorial of a number
 	static void fact1() {
 		int fact=1;
 		int n=5; //number to find factorial
 		for(int i=1;i<n;i++)
 		{
 			fact+=fact*i;     
 		}
 		System.out.println(fact);

 	}
 	static int largestOccurenceCount(int[] arr) {
 		int count=1;
 		int max=arr[arr.length-1];
 		for(int i=arr.length-2;i>=0;i--) {
 			if(arr[i]==max) {
 				count++;
 			}
 		}
 		return count;
 	}
 	static int sasiLogic(int[] arr) {
 		int max=arr[0];
 		int count=0;
 		for(int i=0;i<arr.length;i++) {
 			if(arr[i]>max) {
 				max=arr[i];
 			}
 		}
 		for (int i = 0; i < arr.length; i++) {
			if(max==arr[i])
			{
				count++;
			}
		}
 		
 		
 		
 		return count;
 	}
 	
 	static int noOfOdds(int num) {
 		int count=0;
 		for(;num>0;) {
 			int rem=num%10;
 			if(rem%2==1)
 				count++;
 			num=num/10;
 		}
 		return count;
 	}
 	static int[] mergeArray(int[] arr1,int[] arr2) {
 		int[] res=new int[arr1.length+arr2.length];
 		int i=arr1.length-1,j=0,k=0;
 		while(i>=0 && j<arr2.length) {
 			if(arr1[i]<arr2[j]) {
 				res[k++]=arr1[i--];
 			}
 			else 
 			{
 				res[k++]=arr2[j++];
 			}
 		}
 		while(i>=0) {
 			res[k++]=arr1[i--];
 		}
 		while(j<arr2.length) {
 			res[k++]=arr2[j++];
 		}
 		return res;
 	}
 	
 	public static void main(String[] args) {
 		
 		Scanner scan =new Scanner(System.in);
 		int num1=scan.nextInt();
 		int[] arr1=new int[num1];
 		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=scan.nextInt();
		}
 		int num2=scan.nextInt();
 		int[] arr2=new int[num2];
 		
 		for (int j = 0; j < arr2.length; j++) {
			arr2[j]=scan.nextInt();
		}
 		
 		int res[]=mergeArray(arr1, arr2);
 		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
}

}
