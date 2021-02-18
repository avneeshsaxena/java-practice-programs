
import java.util.*;

class Employee {
    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Demo{

    public static void main(String[] args) {
        /*Employee employee1 = new Employee(1, "sandeep");
        Employee employee3 = new Employee(3, "tilak");
        Employee employee2 = new Employee(2, "avneesh");
        List<Employee> list = Arrays.asList(employee1,employee3,employee2);
        //Collections.sort(list, ()-> Employee e1, Employee e2);

        Collections.sort(list,(Employee e1,Employee e2) -> e1.getId().compareTo(e2.getId()));

        System.out.println(list);

        Collections.sort(list,( e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println(list);*/

        HashMap<String,Integer> map = new HashMap<>();
        map.put("aaaa",1);
        map.put("bbbb",3);
        map.put("dddd",2);
        map.put("cccc",4);

        //Set<String> keys = map.keySet();

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getKey().compareTo(o2.getKey()));
                //return 0;
            }
        });


        //System.out.println(list);

        HashMap<String,Integer> temp = new HashMap<>();
        for (Map.Entry<String, Integer> o1: list
             ) {
            temp.put(o1.getKey(), o1.getValue());




        }
        System.out.println(temp);
        //Set<Map.Entry<String, Integer>> entries = map.entrySet();

        //Collections.sort();

        /*String str = "welcome to lumen";
        int arr[] = {1,2,3,4,2,1,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            if(map.containsKey(element)){
                map.put(element,map.get(element) + 1);
            }else{
                map.put(element, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if(key > max){
                max = key;
            }
            //System.out.println(entry.getKey() + " " + value);
        }

        System.out.println(map.get(max));*/



//        int max = 0;
//        String biggest = null;
//        StringTokenizer tokenizer = new StringTokenizer(str, " ");
//        while(tokenizer.hasMoreElements()){
//            String s = tokenizer.nextElement().toString();
//            int size = (int)s.length();
//            if(size > max){
//                max = size;
//                biggest = s;
//            }
//        }
//
//        System.out.println("maximum string : " + biggest);

        //Arrays.stream(Arrays.stream(str.split(" ")).max(String::length), 0,str.length() );

        //Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length));

        //System.out.println(Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).orElse(null));
    }
}