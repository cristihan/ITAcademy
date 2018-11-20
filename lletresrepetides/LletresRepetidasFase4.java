package lletresrepetides;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LletresRepetidasFase4 {

	public static void main(String[] args) {
		// create map to store
		// Map<String, String> lettersMap = new HashMap<String, String>();
		// create list one and store values
		List<String> letters = new ArrayList<String>();
		letters.add("C");
		letters.add("R");
		letters.add("I");
		letters.add("S");
		letters.add("T");
		letters.add("I");
		letters.add("H");
		letters.add("A");
		letters.add("N");

		List<String> letters2 = new ArrayList<String>();
		letters2.add("V");
		letters2.add("A");
		letters2.add("L");
		letters2.add("D");
		letters2.add("I");
		letters2.add("V");
		letters2.add("I");
		letters2.add("E");
		letters2.add("Z");
		letters2.add("O");

		List<String> joined = new ArrayList<String>();

		joined.addAll(letters);
		joined.addAll(letters2);

		System.out.println("Mostrando Nombre y apellido: ");
		System.out.println("FullName: " + joined);

		// lettersMap.put(letters, letters2);

		
		// System.out.println("Mostrando Nombre y apellido: ");

//        for (Map.Entry<List<String>, List<String>> entry : lettersMap.entrySet())  {
//            List<String> key = entry.getKey();
//            List<String> values = entry.getValue();
		// System.out.println(" Fullname :" +key + values);

		// System.out.println("Key = " + key);
		// System.out.println("Values = " + values + "n");

	}
}
//}




