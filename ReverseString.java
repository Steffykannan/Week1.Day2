package week1.day2;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		
		String Test = "Feeling good";
		
		char[] a = Test.toCharArray();
		
		for(int i=Test.length()-1;i>=0;i--) 
		{
			a[i] = Test.charAt(i);
			System.out.println(a[i]);
		}
		
		
		
	}
	
}
