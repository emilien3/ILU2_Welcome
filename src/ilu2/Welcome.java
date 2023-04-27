package ilu2;


public class Welcome {

	
	public static String welcome(String input){
		
		StringBuilder chaine = new StringBuilder();
		
		//cas du mot vide
		if((input == null)||(input.isBlank())){
			 return "Hello, my friend";
		}
		
		//cas du full majuscule
		if (input.toUpperCase().equals(input)) {
			chaine.append("HELLO, ");
			chaine.append(input);
			chaine.append(" !");
			return chaine.toString();
		}
		
		//cas classique + multi nom
		
		//input = input.trim(); -> c'est pour plus tard
		
		chaine.append("Hello");
		String[] tabNoms = recupNoms(input);
		
		for (int i = 0; i < tabNoms.length; i++) {
			chaine.append(", ");
			chaine.append(ajoutMajuscule(tabNoms[i]));
		}
		System.out.println(chaine);
		return chaine.toString() ;
	}
	
	
	
	private static String ajoutMajuscule(String input) {	
		StringBuilder chaine = new StringBuilder(); 
		String frstLetter = input.substring(0,1).toUpperCase(); 
		String othrLetters = input.substring(1);
		return chaine.append(frstLetter).append(othrLetters).toString();
	}
	
	private static String[] recupNoms(String input) {
		return input.split(",");
	}
		
		
}
