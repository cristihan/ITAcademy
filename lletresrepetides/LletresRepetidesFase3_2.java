package lletresrepetides;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LletresRepetidesFase3_2
{
	public static void main(String[] args)
	{
		List<String> letters = Arrays.asList("C", "R", "I", "S", "T", "I", "H", "A","N");
		
		Map<String, Integer> lettersMap = new LinkedHashMap<String, Integer>();	
		
		for(String letter : letters ) actualizarContador(letter, lettersMap);
		
		for (String key : lettersMap.keySet())
			System.out.println(" Mostrar:  " + key + "   Count: " + lettersMap.get(key));
	}
	
	private static void actualizarContador(String letter, Map<String, Integer> map)
	{
		if(map.containsKey(letter))
		{
			Integer value = map.get(letter);
			value ++;
			map.put(letter, value);
		}
		else map.put(letter, 1);		
	}
}