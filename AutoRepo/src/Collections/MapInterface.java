package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,"Silver");
		map.put(2,"Black");
		
		System.out.println(map.get(2));
	
		
	}

}
