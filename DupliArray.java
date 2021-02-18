
import java.util.HashSet;
import java.util.Set;

public class DupliArray 
{
	public static void main(String args[])
	{
		String duplicates[] = new String[] {"java","Hibernate","Spring","java"};
		Set NonDuplicatsSet = new HashSet<>();
		Set DuplicatsSet = new HashSet<>();
		for (String string : duplicates) 
		{
			if(!NonDuplicatsSet.contains(string))
			{
				NonDuplicatsSet.add(string);
			}
			else
			{
				DuplicatsSet.add(string);
			}
		}
		System.out.println(DuplicatsSet);
		
	}

}
