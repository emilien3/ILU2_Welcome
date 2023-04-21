package ilu2;

public class Welcome {

	
	public static String welcome(String input){
		StringBuilder chaine = new StringBuilder();
		
		chaine.append("Hello, ");
		chaine.append(ajoutMajuscule(input));

		return chaine.toString();
	
	}
	
	private static String ajoutMajuscule(String input) {	
		StringBuilder chaine = new StringBuilder(); 
		String frstLetter = input.substring(0,1).toUpperCase(); 
		String othrLetters = input.substring(1);
		return chaine.append(frstLetter).append(othrLetters).toString();
	}
		
		
		
		
}
