
public class Axolotl extends Tier {

    public Axolotl (String name) {
        super (name);
    }

    @Override
    public void gibLaut() {
        System.out.println(this.getName() + " (" + this.getClass().getName() + "): blubbert");
    }

}
