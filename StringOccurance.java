import java.util.HashMap;

public class StringOccurance {
	
	static void findDuplicate(String str)
	{
		HashMap<String, Integer> hm = new HashMap<>();
		
		String s[]= str.split("");
		//comment added
		for (String tempstring : s) 
		{
			
			if(hm.get(tempstring)!=null)
			{
				hm.put(tempstring, hm.get(tempstring)+1);
			}
			else
			{
			hm.put(tempstring,1);
			}
			
		}
		System.out.println(hm);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicate("I am avneesh Saxena and i am who i am");
	}

}
