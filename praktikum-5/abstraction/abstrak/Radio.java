package abstraction.abstrak;

public class Radio extends PerangkatElektronik {

    public Radio(String merk, int daya) {
        super(merk, daya);
    }

    @Override
    public void hidupkan() {
        System.out.println("Radio " + info() + " dihidupkan.");
    }
}

