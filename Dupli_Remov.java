import java.util.HashSet;
import java.util.Set;

public class Dupli_Remov 
{
	public static void main(String args[])
	{
		String str = "Avneesh";
		System.out.println(removeDuplicates(str));
	}
	
	public static String removeDuplicates(String str)
	{
		Set<Character> set = new HashSet<>();
		
		StringBuffer sf = new  StringBuffer();
		
		for(int i = 0; i<str.length();i++)
		{
			Character c = str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
		}
		
		return sf.toString();
	}

}
