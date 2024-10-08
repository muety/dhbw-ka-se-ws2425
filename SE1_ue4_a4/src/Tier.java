
public abstract class Tier {
	private String name; 
	
	protected Tier(String name) {
		this.name = name;
	}

	public abstract void gibLaut();
	
	public void schlafen() {
		System.out.println(this.name + " (" + this.getClass().getName() + "): ZZZzzzZZZzzzZZZzzzZZZzzzZZZ");
	}
	
	public void frisst() {
		System.out.println(this.name + " (" + this.getClass().getName() + "): Mampf");
	}
	
	public String getName() {
		return this.name;
	}
}
