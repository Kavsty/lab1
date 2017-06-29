public class Palindrome
{
	public static void main(String[] args)
	{
	        Scanner in = new Scanner(System.in);
	        System.out.println("Введите слово или строку");
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
	            System.out.println("Полиндром");
	        }
	        else
	        {
	            System.out.println("Не полиндром");
	        }
	        return s.equals(reverseString(s));
	        
		}
}
