package abstraction.abstrak;

public class Televisi extends PerangkatElektronik {

    public Televisi(String merk, int daya) {
        super(merk, daya);
    }

    @Override
    public void hidupkan() {
        System.out.println("Televisi " + info() + " dihidupkan.");
    }
}
