package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String a = "Madam";
		String rev = "";
		
		for (int i=(a.length()-1);i>=0;i--) {
			
			rev = rev + a.charAt(i);
		}
			
			if (a.toLowerCase().equals(rev.toLowerCase())) 
			
			{
				System.out.println("Palindrome");
			}
			
			else {
				
				System.out.println("Not a Planidrome");
			}
		
			
		
	}
	
	
}
