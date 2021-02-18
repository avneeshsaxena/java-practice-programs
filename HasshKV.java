import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class Sandeep
{
	private int id;
	private String dep;
	
	
	
	public Sandeep(int id, String dep) {
		super();
		this.id = id;
		this.dep = dep;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Sandeep [id=" + id + ", dep=" + dep + "]";
	}
	
	


}



public class HasshKV 
{
	public static void main(String arge[])
	{
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Avneesh", 9);
		map.put("Tilak", 1);
		map.put("Sandi", 7);
		map.put("Shine", 8);
		map.put("Loku", 2);
		
		
		//System.out.println(map);
		
		List<Map.Entry<String,Integer>> lst = new ArrayList<>(map.entrySet());
		
		Collections.sort(lst,new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		
		System.out.println(lst);
		
		
		HashMap<String,Integer> m = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : lst) {
			
			m.put(entry.getKey(), entry.getValue());
	
			
	}
		System.out.println(m);
		}

}
