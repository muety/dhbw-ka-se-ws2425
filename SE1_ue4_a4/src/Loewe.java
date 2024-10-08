
public class Loewe extends Tier {
	
	public Loewe (String name) {
		super (name);
	}

	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): brüllt");		
	}

}
