package lletresrepetides;

import java.util.ArrayList;
import java.util.List;

public class LletresRepetidesFase2 {

	public static void main(String[] args) {
		List<String> letters = new ArrayList<>();
		letters.add("C");
		letters.add("R");
		letters.add("I");
		letters.add(" ");
		letters.add("T");
		letters.add("I");
		letters.add("H");
		letters.add("A");
		letters.add("N");	
		// List<Character> name = Arrays.asList('c','r','i',''','t','i','h','a','n');


			
			for (int i = 0; i < letters.size(); i++) {
				String letter = letters.get(i);
				
				
				
				
				if(isVocal(letter)) {
					System.out.println(" Vocal " + letter );	
				
				}else{	
					if(isInteger(letter)){
						System.out.println(" Los nombres no tienen numero");
					}else {
					System.out.println(" Consonate " + letter);		
					}
				}	
				
						
			}
	
	}
	
	public static boolean isVocal(String letter) {
		return letter.equals("A")|| letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U");
	}
	
	
	
	public static boolean isInteger(Object object) {
		if(object instanceof Integer) {
			return true;
		} else {
			String string = object.toString();
			
			try {
				Integer.parseInt(string);
			} catch(Exception e) {
				return false;
			}	
		}
	  
	    return true;
	}
	
	
	/**public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}*/
	
	
	
}

	






