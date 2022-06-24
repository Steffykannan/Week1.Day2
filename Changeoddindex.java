package week1.day2;

public class Changeoddindex {
	
	public static void main(String[] args) {
		
	
	
	String test = "changeme"; 
	
	char[] a = test.toCharArray();
	
	
	for (int i=0;i<test.length();i++) {
		
		
		
		if(i%2==1) {
			
			char b = Character.toUpperCase(a[i]);
			System.out.println(b);
			
		}
	
	
	}
	}
	
}
