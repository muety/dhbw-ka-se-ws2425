public class Cobra extends Tier {
    public Cobra (String name) {
        super(name);
    }
    @Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): tssssssss");		
	}
}
