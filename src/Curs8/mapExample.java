package Curs8;

import java.util.HashMap;
import java.util.Map;

public class mapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<String,String> map = new HashMap<>(); //<key,value>
map.put("T", "Tester");
map.put("D", "developer");

System.out.println(map);

for(String key: map.keySet()) {
	System.out.println(key);
}

for(String value: map.values()) {
	System.out.println(value);
}
System.out.println(map);
System.out.println(map.get("T"));
System.out.println(map.containsKey("T"));
}

	



}

