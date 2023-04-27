package ilu2;


public class Welcome {

	
	public static String welcome(String input){
		StringBuilder chaineMin = new StringBuilder();
		StringBuilder chaineMaj = new StringBuilder();
		
		if((input == null)||(input.isBlank())){
			 return "Hello, my friend";
		}
		
		if (input.toUpperCase().equals(input)) {
			return passageMajuscule(input);
		}		
		
		chaineMin.append("Hello");
		String[] tabNoms = recupNoms(input);
		
		for (int i = 0; i < tabNoms.length; i++) {
			if (tabNoms[i].toUpperCase().equals(tabNoms[i])) {
				chaineMaj.append(tabNoms[i]);
			}
			else {
				chaineMin.append(", ");
				chaineMin.append(ajoutMajuscule(tabNoms[i]));
			}
		}
		if (!(chaineMaj.isEmpty())) {
			return ajoutMajFinMessage(chaineMin, chaineMaj);
		}
		return chaineMin.toString() ;
	}
	
	
	
	private static String ajoutMajuscule(String input) {	
		StringBuilder chaine = new StringBuilder(); 
		String frstLetter = input.substring(0,1).toUpperCase(); 
		String othrLetters = input.substring(1);
		return chaine.append(frstLetter).append(othrLetters).toString();
	}
	
	private static String passageMajuscule(String input) {
		StringBuilder chaine = new StringBuilder();
		chaine.append("HELLO, ");
		chaine.append(input);
		chaine.append(" !");
		return chaine.toString();
	}
	
	private static String[] recupNoms(String input) {
		return input.split(",");
	}
	
	private static String ajoutMajFinMessage(StringBuilder chaineMin , StringBuilder chaineMaj) {
		chaineMin.append(". AND ");
		String message= passageMajuscule(chaineMaj.toString());
		chaineMin.append(message);
		return chaineMin.toString();		
	}
		
}
