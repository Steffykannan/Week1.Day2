package week1.day2;

import java.lang.reflect.Array;

public class FindIntersection {

	public static void main(String[] args) {
		
		
		//Declare Array
		
	int a[] = {3,2,11,4,6,7};
	int b[] = {1,2,8,4,9,7};
	
	
	
		
	
	
	for(int i=0;i<a.length;i++) 
	{
		
		for (int k=0;k<b.length;k++) 
		{
			
			if(a[i]==b[k]) 
			{
				System.out.println(a[i]);
			}
			
		}
		
	}
		
	}
}

