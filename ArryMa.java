
public class ArryMa
{

	public static void main(String[] args) 
	{
		
		int a[] = {4,7,2,9,11,5,64};
		int max=a[0];
		int min=a[0];
		for(int i =1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		for(int i =1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
	}
	}

