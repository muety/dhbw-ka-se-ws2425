
public class Otter extends Tier {

	public Otter (String name) {
		super (name);
	}

	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): schnurrt");		
	}
	
}
