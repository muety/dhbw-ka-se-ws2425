
public class Bober extends Tier{

    public Bober (String name) {
        super (name);
    }

    @Override
    public void gibLaut() {
        System.out.println(this.getName() + " (" + this.getClass().getName() + "): BOBER KURWAAAAA");
    }

    @Override
    public void schlafen(){
        System.out.println(this.name + " AHHHHHHHH SUCCCA BLYAT");
    }

    @Override
    public void frisst() {
        System.out.println(this.name + " (" + this.getClass().getName() + "): Kurwa Mampf");
    }


}


