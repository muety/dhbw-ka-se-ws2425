
public class Eisbaer extends Tier {
	
	public Eisbaer (String name) {
		super (name);
	}

	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): br�llt");		
	}

}