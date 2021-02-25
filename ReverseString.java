
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Tilak";
		StringBuilder rev=new StringBuilder("");
		int leng = str.length();
			
		for(int i=leng-1;i>=0;i--)
		{
			rev.append(str.charAt(i));
		}
		System.out.println(rev);
		
	}

}
