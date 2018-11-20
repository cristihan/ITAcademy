package lletresrepetides;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class LletresrepetidasFase3_1
{
	public static void main(String[] args)
	{
		List<String> letters = Arrays.asList("C", "R", "I", "S", "T", "I", "H", "A","N");	
		
		Map<String, Integer> lettersMap = initMap();
		contarLetras(letters, lettersMap);		
		printarMap(lettersMap);
	}
	
	
	
	private static Map<String, Integer> initMap()
	{
		Map<String, Integer> lettersMap = new LinkedHashMap<String, Integer>();
		
		return lettersMap;
		
	}
	
	private static void contarLetras(List<String> l, Map<String, Integer> m )
	{
		for (String s : l) actualizarContador(s, m);
	}
	
	private static void actualizarContador(String letter, Map<String, Integer> lettersMap )
	{ 
		if(lettersMap.containsKey(letter))
		{
			Integer value = lettersMap.get(letter);
			value ++;
			lettersMap.put(letter, value);
		}
		else lettersMap.put(letter, 1);
	}
	
	private static void printarMap(Map<String, Integer> lettersMap)
	{
		for (String key : lettersMap.keySet()) 
			System.out.println(" Mostrar :  '"+key+"' Count : "+lettersMap.get(key));
	}
}