public class Palindrome
{
	public static void main(String[] agrs)
	{
		String in=" ";
		char r = Slovo(in);
		for (int count=0; count<agrs.length; count++)
		{
			in = agrs[count];
		}
		System.out.println("Vvod" + in);
		System.out.println("Znachenie=" + r);
	}
	public static String Slovo (String in)
	{
		char result;
		result = in.charAt(3);
		System.out.println(result);	
		return result;
	}
}