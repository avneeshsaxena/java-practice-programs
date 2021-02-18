import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employy //implements Comparable<Employy>
{
	private int id;
	private String name;

	public Employy(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employy [id=" + id + ", name=" + name + "]";
	}
	
	
	/*@Override
	public int compareTo(Employy o) {
		if(this.getId()>o.getId())
		{
			return 1;
		}
		else if(this.getId()<o.getId())
		{
		
		return -1;
		}
		
		return 0;
	}*/

/*	@Override
	public int compare(Employy o1, Employy o2) {
		
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		else if(o1.getId()<o2.getId())
		{
		
		return -1;
		}
		
		return 0;
	}
	*/
	
	
	
}


public class DemoMine 
{
	public static void main(String args[])
	
	{
		Employy e1 = new Employy(2,"Avneesh ");
		Employy e2 = new Employy(3,"Sandeep");
		Employy e3 = new Employy(1,"Tilak");
		Employy e4 = new Employy(4,"Shine");
		
		List<Employy> lst = Arrays.asList(e1,e2,e3,e4);
		System.out.println(lst);
		
		//Collections.sort(lst);

		
		
		
		/*Collections.sort(lst,new Comparator<Employy>() {

			@Override
			public int compare(Employy o1, Employy o2) {
				
				//return o1.getName().compareTo(o2.getName());
				
				if(o1.getId()>(o2.getId()))
				{
					return 1;
				}
				else if(o1.getId()<o2.getId())
				{
				
				return -1;
				}
				
				return 0;
			}
			
		} );*/
		
		Collections.sort(lst,(o1,o2)->o1.getId()>o2.getId()?1:o1.getId()<o2.getId()?-1:0);
		
		System.out.println(lst);
		
	
	}

}
