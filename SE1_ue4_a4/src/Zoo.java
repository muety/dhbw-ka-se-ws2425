
public class Zoo {
	
	public static void main(String[] args) {
		
		// �ndern Sie die Anzahl der Gehege entsprechend ab 
		int anzGehege = 2;
		Tier[] alleTiere = new Tier[anzGehege];
		
		
		
		// F�gen Sie eine Instanz ihrer Unterklasse an eine passende Stelle im Array hinzu 
		alleTiere[0] = new Loewe("Alex");
		alleTiere[1] = new Eisbaer("Thomas");
		
		
		
		for (int i = 0; i < alleTiere.length; i++) {
			System.out.println("Tier in gehege Nr. " + (i+1) + ": ");
			alleTiere[i].frisst();
			alleTiere[i].gibLaut();
			alleTiere[i].schlafen();
		}	
	}	
}
