package com.programming;

import java.util.Scanner;

public class prime {
	
		public  static void firstNprime(int a)
		{
			int count=1;
			for(int i=2;count<=a;i++)
			{
				if(isPrime(i))
				{
					
					count ++;
					System.out.print(i+" ");
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
	
	
		public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter");
			int a=scan.nextInt();
			firstNprime(a);
			
		}

}
