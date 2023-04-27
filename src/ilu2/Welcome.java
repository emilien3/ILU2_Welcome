package ilu2;


public class Welcome {

	public static String welcome(String input){
		StringBuilder chaineMin = new StringBuilder();
		StringBuilder chaineMaj = new StringBuilder();
		
		if((input == null)||(input.isBlank())){
			 return "Hello, my friend";
		}
		
		String[] tabNoms = recupNoms(input);
		
		for (int i = 0; i < tabNoms.length; i++) {
			if (tabNoms[i].toUpperCase().equals(tabNoms[i])) {
				chaineMaj.append(", ");
				chaineMaj.append(tabNoms[i]);
			}
			else {
				chaineMin.append(", ");
				chaineMin.append(ajoutMajuscule(tabNoms[i]));
			}
		}
		if (chaineMin.toString().isEmpty() ) {
			//System.out.println(affichageMessage(chaineMaj.toString()));
			return affichageMessage(chaineMaj.toString());
		}
		else if(chaineMaj.toString().isEmpty()) {
			//System.out.println(affichageMessage(chaineMin.toString()));
			return affichageMessage(chaineMin.toString());
		}
		//String message = affichageMessage(chaineMin.toString()) + ". AND " + affichageMessage(chaineMaj.toString());
		//System.out.println(message);
		
		return affichageMessage(chaineMin.toString()) + ". AND " + affichageMessage(chaineMaj.toString());
	}
	
	
	private static String ajoutMajuscule(String input) {	
		StringBuilder chaine = new StringBuilder(); 
		String frstLetter = input.substring(0,1).toUpperCase(); 
		String othrLetters = input.substring(1);
		return chaine.append(frstLetter).append(othrLetters).toString();
	}
	
	
	private static String affichageMessage(String input) {
		StringBuilder chaine = new StringBuilder();
		
		if(input.toUpperCase().equals(input)) {
			if (occurence(input, ',')>1) input = remplacementAND(input, true);
			chaine.append("HELLO");
			chaine.append(input);
			chaine.append(" !");
			return chaine.toString();
		}
		else {
			if (occurence(input, ',')>1) input = remplacementAND(input, false);
			chaine.append("Hello");
			chaine.append(input);
			return chaine.toString();
		}
	}
	
	private static String[] recupNoms(String input) {
		return input.split(",");	
	}
	
	private static int occurence(String str, char car) {
		int count = 0;
	    for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == car) {
	        	count++;
	        }
	    }
	    return count;
	}
	
	private static String remplacementAND(String chaine, boolean majOrMin) {
		int indice = chaine.lastIndexOf(",");
		if (majOrMin) {
			return chaine.substring(0, indice) + " AND" + chaine.substring(indice + 1);
		}		
		return chaine.substring(0, indice) + " and" + chaine.substring(indice + 1);
	}
	
}
