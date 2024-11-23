package com.programming;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays {

	static void firstNprime(int n)
	{
		int count=0;
		for(int i=2;count<n;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	static boolean isPrime(int i)
	{
		for(int j=2;j*j<=i;j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
	}
	//print all multiples of n till x
	static void multipleOfnTillX(int n,int x)
	{
		for(int i=n;i<=x;i++)
		{
			if(i%n==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	//common multiples of a and b till n
	static void commonMultipleOfa_b_till_N(int a,int b,int n)
	{
		for(int i=a;i<=n;i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	//common multiples of and b
	static void commonMultiples(int n,int a,int b) {
		int count=0;
		
		for(int i=2;count<n;i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		
	}

	//first n common multiples of a and b 
	static void firstCommonMultipleOfa_b(int a,int b,int n)
	{
		int count=0;
		for(int i=a;count<n;i++)
		{
			if(i%a==0 && i%b==0)
			{
				count++;
				System.out.print(i+" ");
			}
		}
	}
	//common factors of n1 and n2
	static void commonFactorsOf_n1_And_n2(int n1,int n2)
	{	
		int res=n1<n2?n1:n2;
		for(int i=1;i<res;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.println(i+ " ");
			}
		}
	}
	
	
	//hcf of two numbers
	
	static int hcf(int a,int b) {
		
		int x=0;
		int min=a<b? a :b;
		for (int i = min; i >=1; i--) {
			if (a%i==0 && b%i==0) {
				x=i;
				break;
			}
		}
		return x;
	}
	
	//count no of digits
	static int countDigits(int n) {
		int count=0;
		
		while(n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	//sum of digits
	static int sumOfDigits(int n) {
		int sum=0;
		
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	//reverse of a number
	
	static int reverseNumber(int n)
	{
		int rem=0,rev=0;
		while(n>0)
		{
			 rem=n%10;  //5432
			 rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	//finding the small element
	static int smallElement(int[] a)
	{
		int small=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[i+1])
			{
				small=a[i];
			}
		}
		
		
		return small;
	}
	
	//occurence of largest number in an array

	static void occurenceOfLargestNumber(int[] arr) {
		int count=0;
		int max_value=max(arr); //finding the max value in array
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max_value)
			{
				count++;
			}
		}
		System.out.println(count);
	
	}
	//finding the sum of the array
	static int sum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	//finding the product of an array
	static int product(int[] arr) {
		int product=1;
		for(int i=0;i<arr.length;i++) {
			product*=arr[i];
		}
		return product;
	}
	//finding the max value in array
	static int max(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	//occurence of smallest number in an array
	
	static void occurenceOfSmallestNumber(int[] arr) {
		int count=0;
		int min_value=min(arr); //finding the max value in array
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==min_value)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	//finding the min value in array
	static int min(int[] arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	//hcf program
	static int hcf1(int n,int m) {
		int res=0;
		int min= n<m ? n : m;
		for(int i=2;i<=min;i++)
		{
			if(n%i==0 && m%i==0)
			{
				res=i;
				break;
			}
		}
		return res;
	}
	//largest element in an array
	static void largestElement(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	//index of largest element
	
	static void indexLargest(int[] a) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=i;
				
			}
		}
		System.out.println(max);
	}
	//number of occurence of k
	static void no_Of_Occurence(int[] arr,int k) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==k) {
				count++;
			}
		}
		System.out.println(count);
	}
	//index of k
	static void indexOfK(int[] arr,int k){
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==k) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}
	//minimum maximum pair combination
	static void minMaxPair(int[] arr) {
		int sum=sum(arr);
		int min=min(arr);
		int max=max(arr);
		int minPair=sum-max;
		int maxPair=sum-min;
		System.out.println(minPair);
		System.out.println(maxPair);
	}
	//product of all possible pair
	static void productPossiblePair(int[] arr)
	{
		int res=product(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(res/arr[i]);
		}
		
	}
	//second largest number in an array
	static int secondLargestElement(int[] arr) {
		int p=0,vp=0;
		if(arr[0]<arr[1])
		{
			p=arr[1];
		}
		else
			vp=arr[0];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i]>p ) {
				vp=p;
				p=arr[i];
			}
			else if (arr[i]>vp && arr[i]!=p) {
				vp=arr[i];
			}
		}
		return vp;
	}
	
	//second smallest value in an array
	static int secondSmallestValue(int[] arr) {
		int p=Integer.MAX_VALUE ,vp=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<p) {
				vp=p;
				p=arr[i];
			}
			else if(arr[i]<vp && arr[i]!=p)
			{
				vp=arr[i];
			}
		}
		return vp;
	}
	//max sum pair
	static int maxSumPair(int[] arr) {
		int p=0,vp=0;
		if(arr[0]<arr[1])
		{
			p=arr[1];
		}
		else
			vp=arr[0];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i]>p ) {
				vp=p;
				p=arr[i];
			}
			else if (arr[i]>vp && arr[i]!=p) {
				vp=arr[i];
			}
		}
		return p+vp;
	}
	//min sum pair
	static int minSumPair(int[] arr) {
		int p=Integer.MAX_VALUE ,vp=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<p) {
				vp=p;
				p=arr[i];
			}
			else if(arr[i]<vp && arr[i]!=p)
			{
				vp=arr[i];
			}
		}
		return p+vp;
	}
	
	//maxproduct pair
	static int maxProductPair(int[] arr) {
		int p=Integer.MIN_VALUE,vp=Integer.MIN_VALUE;
		int p1=Integer.MAX_VALUE ,vp1=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>p) {
				vp=p;
				p=arr[i];
			}
			else if(arr[i]>vp )
			{
				vp=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if (arr[i] <p1) {
				vp1=p1;
				p1=arr[i];
			}
			else if(arr[i]<vp1)
			{
				vp1=arr[i];
			}
		}
		if(p*vp<p1*vp) {
			return p1*vp1;
		}
		else		
			return p*vp;
	//return -1;
	}
	//min product sum
	static int minProductPair(int[] arr) {
		int p=Integer.MIN_VALUE,vp=Integer.MIN_VALUE;
		int p1=Integer.MAX_VALUE ,vp1=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>p) {
				vp=p;
				p=arr[i];
			}
			else if(arr[i]>vp )
			{
				vp=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if (arr[i] <p1) {
				vp1=p1;
				p1=arr[i];
			}
			else if(arr[i]<vp1)
			{
				vp1=arr[i];
			}
		}
		if(p*vp > p1*vp ) {
			if(p1*vp < p*p1)				
			{
			return p1*vp1;
			}
			else
				return p*p1;
		}
		else		
			return p*vp;
	//return -1;
	}
	
	//print allpairs in an array
	static void printArrayPairs(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				
				System.out.println(arr[i]+","+arr[j]);
		}
		}
	}
	//first num odd pair
			static void firstNumOddPair(int[] arr) {
				for(int i=0;i<arr.length-1;i++) {
					for(int j=i+1;j<arr.length;j++) {
						
							System.out.print(arr[i]+","+arr[j]+" ");
						
					}
					System.out.println();
				}
			}
			//sumpair to K
			static void sumPairToK(int[] arr) {
				for (int i = 0; i < arr.length-1; i++) {
					for (int j = 0; j < arr.length; j++) {
						if (isPrime(arr[i]+arr[j])) {
							System.out.println(arr[i]+","+arr[j]);
						}
					}
					
				}
			}
	//no of occuenece in sorted array
		static void noOfOccurence(int[] arr) {
			int count=1;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==arr[i+1])
				{
					count++;
				}
				else {
					System.out.println(arr[i]+"-"+count);
					count=1;
				}
			}
			System.out.println(arr[arr.length-1]+"-"+count);
		}
		// print the values in the sorted array
		static void nonRecurringDigits(int[] arr) {
			
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]!=arr[i+1])
				{
					System.out.println(arr[i]);
				}
				
			}
			System.out.println(arr[arr.length-1]);
		}
		//print the unique values in an array
		static void uniqueValue(int[] arr) {
			int count=1;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]== arr[i+1])
				{
					count++;
				}
				else
				{
					if(count==1)
					{
						System.out.println(arr[i]);
					}
					count=1;
				}
			}
			if(count==1)
			{
				System.out.println(arr[arr.length-1]);
			}
		}
		static int largestRepeatElement(int[] arr) {
			
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[i]==arr[i-1])
				{
					return arr[i];
				}
			}
			return -1;
		}

		static int[]  mergeThreeArarys(int[] arr1,int[] arr2,int[] arr3) {
			int[] res=new int[arr1.length+arr2.length+arr3.length];
			int i=arr1.length-1,j=arr2.length-1,x=arr3.length-1,k=0;
			while(k<res.length) {
				
				if(i>=0) {
					res[k++]=arr1[i--];
				}
				if(j>=0) {
					res[k++]=arr2[j--];
				}
				if(x>=0)
				{
					res[k++]=arr3[x--];
				}
				
			}
			return res;
			
		}
		
		static void subArray(int[] arr,int size) {
			for(int i=0;i<arr.length-size;i++) {
				for(int j=i;j<i+size;j++)
				{
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
		static void sumOfSubArray(int[] arr,int k) {
			int sum=0;
			for (int i = 0; i < arr.length-k; i++) {
				for (int j = 0; j < i+k; j++) {
					sum=sum+arr[j];
				}
				System.out.println(sum);
				sum=0;
			}
		}
		public static void PrintSubArrayEqualtoK(int[] arr,int size, int k) 
		{
			
			
			
			for (int i = 0; i < arr.length-size; i++) {
				int sum=0;
				for (int j = i; j < i+size; j++) {
					sum+=arr[j];
				}
				if (sum==k) {
					for(int j=i;j<i+size;j++) {
						System.out.print(arr[j]+" ");
					}
					System.out.println();
				}
			}
		}
			static int countSubArray(int[] arr,int size,int k) {
					int count=0;
				for (int i = 0; i < arr.length-size; i++) {
					int sum=0;
					for (int j = i; j < i+size; j++) {
						sum+=arr[i];
					}
					if(sum==k) {
						count++;
					}
				}
				return count;
			}
			
			//all sub arrays in ascending order
			static void allSubArrays(int[] arr) {
				for(int size=1;size<=arr.length;size++) {
					subArray(arr, size);
				}
			}
			//all sub arrays in descending order
			static void allSubArrayDesc(int[] arr) {
				for (int size = arr.length; size >=1; size--) {
					for (int i = 0; i <=arr.length-size; i++) {
						for (int j = i; j < i+size; j++) {
							System.out.print(arr[j]+" ");
						}
						System.out.println();
					}
				}
			}
			//print sum of all sub arrays 
			static void sumOfSubArrays(int[] arr) {
//				for (int size = arr.length; size >0; size--) {
				for (int size = 1; size <arr.length; size++) {
				
					for (int i = 0; i <= arr.length-size; i++) {
						int sum=0;
						for (int j = i; j < i+size; j++) {
							sum+=arr[j];
						}
						System.out.println(sum);
					}
				}
			}
			//countofAllSubarrays where sum is equal to k 
			static void countOfAllSubArary(int[] arr,int k) {
				for (int size = arr.length; size >0; size--) {
					for (int i = 0; i <=arr.length-size; i++) {
						int sum=0;   //11 
			//5  1 0 0 2 1 1 2 0 1 3
								// 7
						for (int j = i; j < i+size; j++) {
								sum+=arr[j];
						}
						if(sum==k) {
							for (int j = i; j < i+size; j++) {
								System.out.print(arr[j]+" ");
							}
							System.out.println();
							
						}
					}
				}
			}
			//print first subarray of sum is equal to K
		static void firstSubArrays(int[] arr,int k) {
				for(int size=1;size<arr.length;size++) {
				
					for (int i = 0; i <= arr.length-size; i++) {
						int sum=0;
						for (int j = i; j < i+size; j++) {
						
							sum+=arr[j];
						}
						if(sum==k) {
							for (int j = i; j < i+size; j++) {
								System.out.print(arr[j]+" ");	
							}
							return;
							
						}

						
					}
					
				}
			}
			// print the largest number occurence
			static int largestNumberOccurence(int[] arr) {
				int max=arr[arr.length-1];
				int count=0;
				for (int i = arr.length-1; i >=0; i--) {
					if(arr[i]==max) {
						count++;
					}
				}
				return count;
			}
			
			//print repeating elements once
			static void repeatElementsOnce(int[] arr) {
					int count=0;
				for (int i = 0; i < arr.length-1; i++) {
					if (arr[i]==arr[i+1]) {
						count++;
					} else {
						if (count>0) {
							System.out.println(arr[i]);
						}
						count=0;
					}
				}
			}
			static int[] reArrangeArray(int[] arr) {
				int i=0;
				int j=0;
				while(i<arr.length) {
				if(arr[i]==0) {
					i++;
				}
				else {
					arr[j]=arr[i];
					i++;
					j++;
				}
			}
				while(j<arr.length) 
				{
					arr[j]=0;
					j++         ;
				}
				return arr;
			}
		static void printConsecutiveSubArray(int[] arr) {
				for (int i = 0; i < arr.length-1; i++) {
					if(arr[i+1]-arr[i]==1) {
						System.out.print(arr[i]+" ");
					}
					else
						System.out.println(arr[i]);
				}
				System.out.print(arr[arr.length-1]);
			}
		static void lengthConsecutiveSubArray(int[] arr) {
//				int count=1;
//				for (int i = 0; i < arr.length-1; i++) {
//					if(arr[i+1]-arr[i]==1) {
//						count++;
//					}
//					else
//					{
//						System.out.println(count);
//						count=1;
//					}
//				}
//				System.out.println(count);
			int count=1,max=0;
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i+1]-arr[i]==1) {
					count++;
				}
				else {
					if(count>max) {
						max=count;
					}
				count=1;
				}
			}
			if(count>max) {
				max=count;
			}
			System.out.println(max);
			}
		static void longestSubArray(int[] arr) {
			int count=1,ei=0,max=0;
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i+1]-arr[i]==1) {
					count++;
				}
				else
				{
					if(count>max) {
						max=count;
						ei=i;
					}
					count=1;
				}
				
			}
			if(count>max) {
				max=count;
				ei=arr[arr.length-1];
			}
			int si=ei-max+1;
			for (int i = si; i <=ei ; i++) {
				System.out.print(arr[i]+" ");
			}
		}
		//longestSortedSubArray
		static void longestSortedArray(int[] arr) {
			int count=1,ei=0,max=0;
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i+1]>=arr[i]) {
					count++;
				} else {
					if(count>=max)
					{
						max=count;
						ei=i;
					}
					count=1;
				}
			}
			if(count>=max) {
				max=count;
				ei=arr.length-1;
			}
			int si=ei-max+1;
			for (int i = si; i <=ei ; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
				longestSortedArray(arr);
		}
	}




