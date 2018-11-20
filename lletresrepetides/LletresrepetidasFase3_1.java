package lletresrepetides;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LletresrepetidasFase3_1 {
	
	public static void main(String[] args) {
		List<String> letters = new ArrayList<>();
		letters.add("C");
		letters.add("R");
		letters.add("I");
		letters.add("S");
		letters.add("T");
		letters.add("I");
		letters.add("H");
		letters.add("A");
		letters.add("N");
		
		Map<String, Integer> lettersMap = new LinkedHashMap<String, Integer>();	
		
		
		for (int i = 0; i < letters.size(); i++) {
			String letter = letters.get(i);
			if(lettersMap.containsKey(letter)) {
				Integer value = lettersMap.get(letters.get(i));
				value ++;
				lettersMap.put(letter, value);
			}else {
				lettersMap.put(letter, 1);
			}
		}
		
		for (String key : lettersMap.keySet()) {
			System.out.println(" Mostrar :  '"+key+"' Count : "+lettersMap.get(key));
		}
		
	}

}




