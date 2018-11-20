package lletresrepetides;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class LletresRepetidesFase3 {

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

		Integer contador;
		for (String letter : letters) {							
			contador = lettersMap.get(letter);			
			if(contador == null) {
				contador =0;								
			}
			
			contador ++;
			lettersMap.put(letter, contador);		

		}		
		System.out.println(" Mostrar Lletres " + lettersMap.keySet() );
		System.out.println(" Mostrar lletres repetidas " + lettersMap.values() );				

	}
}
