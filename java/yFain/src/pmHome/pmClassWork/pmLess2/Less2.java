package pmHome.pmClassWork.pmLess2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Less2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList();
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < 20; i++) {
			map.put("Key", 1);
			list.add(1);
			set.add(1);
			
			map.put("Key",i);
			list.add(i);
			set.add(i);
			
			System.out.println("Map size is.. " + map.size());
			System.out.println("List size is.. " + list.size());
			System.out.println("Set size is.. " + set.size());
		}
		
	}

}
