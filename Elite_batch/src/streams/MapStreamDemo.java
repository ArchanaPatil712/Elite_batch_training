package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {
	public static void main(String[] args) {
		Map<String, String> people=new HashMap<>();
		people.put("Polo", "Pune");
		people.put("Golo", "Mumbai");
		people.put("Holo", "Thane");
		people.values().stream().forEach(System.out::println);
		List<String> cities=people.values().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);
	}


}
