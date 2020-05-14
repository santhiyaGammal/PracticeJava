package javaClass;

public class Day2_CountUpperLowerDigit {

/*	public static void main(String[] args) {
		
		//To find the count of Uppercase, Lowercase, Numbers and space in a String 
		//Approach1
		String str = "1. It is Work from Home not Work for Home"; 
		int upper = 0; 
		int lower = 0;
		int number = 0;  
		int space = 0; 
		
		char[] Array = str.toCharArray(); 
		
		// Iterating in for loop on each char 
		for(int i = 0; i < Array.length; i++) {
			if (Array[i] == ' ') {
				space = space + 1; 
			} else if (Character.isUpperCase(Array[i])) { 
				upper = upper + 1; 
			} else if (Character.isLowerCase(Array[i])) { 
				lower = lower + 1; 
			} else if (Character.isDigit(Array[i])) {
				number = number + 1; 
			}
		}
		
		System.out.println("Number of Uppercases: " + upper); 
		System.out.println("Number of Lowercases: " + lower); 
		System.out.println("Number of Numeric: " + number); 
		System.out.println("Number of Spaces: " + space); 
		
	}
}*/
		
		//Approach2
		
	
	  public static void main(String[] args) { String txt =
	  "1. It is Work from Home not Work for Home";
	  
	  String spaceStr = txt.replaceAll("[^ ]", "");
	  System.out.println("Space count: " + spaceStr.length());
	  
	  String numStr = txt.replaceAll("[^0-9]", "");
	  System.out.println("Number count: " + numStr.length());
	  
	  String upperStr = txt.replaceAll("[^A-Z]", "");
	  System.out.println("Uppercase count: " + upperStr.length());
	  
	  String lowerStr = txt.replaceAll("[^a-z]", "");
	  System.out.println("Lowercase count: " + lowerStr.length());
	  
	  
	  }
	  
	  
	  }
	 
