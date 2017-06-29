import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
	        java.util.Scanner in = new java.util.Scanner(System.in);
	        System.out.println("Enter a string or word");
	        String s = in.next();
	        isPalindrome(s);
	}
	    public static String reverseString(String s)
	    {
	        String r = "";
	        for (int i = s.length() - 1; i >= 0; --i)
	        	r += s.charAt(i);
	        return r;
	          
	    }
	    public static Boolean isPalindrome(String s) 
	    {
    		if(s.equals(reverseString(s)))
	        {
	            System.out.println("Palindrome");
	        }
	        else
	        {
	            System.out.println("Not a Palindrome");
	        }  
    		return s.equals(reverseString(s)); 
		}
}
