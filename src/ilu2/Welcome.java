package ilu2;


public class Welcome {

	public static String welcome(String input){
		StringBuilder chaineMin = new StringBuilder();
		StringBuilder chaineMaj = new StringBuilder();
		
		if((input == null)||(input.isBlank())){
			 return "Hello, my friend";
		}
		
		String[] tabNoms = recupNoms(input);
		
		String[] tNomsSansOcc = new String[tabNoms.length];
		int[] tComptOcc = new int[tabNoms.length];
		
		int nbPersonne = occurenceNoms(tabNoms, tNomsSansOcc, tComptOcc);
		
		for (int i = 0; i < nbPersonne; i++) {
			
			if (tNomsSansOcc[i].toUpperCase().equals(tNomsSansOcc[i])) {
				chaineMaj.append(", ");
				chaineMaj.append(tNomsSansOcc[i]);
				chaineMaj.append(ajoutNbOcc(tComptOcc[i]));
			}
			else {
				chaineMin.append(", ");
				chaineMin.append(ajoutMajuscule(tNomsSansOcc[i]));
				chaineMin.append(ajoutNbOcc(tComptOcc[i]));
				
			}
		}
		if (chaineMin.toString().isEmpty() ) {
			return affichageMessage(chaineMaj.toString());
		}
		else if(chaineMaj.toString().isEmpty()) {
			return affichageMessage(chaineMin.toString());
		}
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
			if (occurenceChar(input, ',')>1) input = remplacementAND(input, true);
			chaine.append("HELLO");
			chaine.append(input);
			chaine.append(" !");
			return chaine.toString();
		}
		else {
			if (occurenceChar(input, ',')>1) input = remplacementAND(input, false);
			chaine.append("Hello");
			chaine.append(input);
			return chaine.toString();
		}
	}
	
	private static String[] recupNoms(String input) {
		StringBuilder chaine = new StringBuilder();
	    
	    String[] tab = input.split(",");
	    
	    for (int i =0 ; i< tab.length; i++){
	        chaine.append(tab[i].trim()+",");
	    }    

	    return chaine.toString().split(",");	
	}
	
	private static int occurenceChar(String str, char car) {
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
	
	
	private static int existe(String tab[], String nom){
		 for(int i = 0 ; i<tab.length;i++){
			 if(nom.equals(tab[i])) return i;
		 }
		 return -1;
	}
	
	private static int occurenceNoms(String[] input, String[] noms, int[] tCompt) {
		int indice =0;
		int indice2;
		//init de tCompt;
		for (int i =0 ; i<input.length; i++) {
			tCompt[i] = 0;
		}
		for (int i = 0; i < input.length; i++) {
			if ((indice2 = existe(noms, input[i])) !=-1) {
				tCompt[indice2]++;
			}
			else {
				noms[indice] = input[i];
				tCompt[indice] ++;
				indice++;
			}
		}
		return indice;
	}
	
	private static String ajoutNbOcc(int occ) {
		
		if (occ>1){
			return " (*"+occ+")";
		}
		else{
			return "";
		}
	}
	
	
}
