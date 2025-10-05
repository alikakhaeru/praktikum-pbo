package abstraction.abstrak;

public abstract class PerangkatElektronik {
    private String merk;
    private int daya;

    public PerangkatElektronik(String merk, int daya) {
        this.merk = merk;
        this.daya = daya;
    }

    public abstract void hidupkan();

    public void matikan() {
        System.out.println(merk + " dimatikan.");
    }

    public String info() {
        return merk + " (" + daya + " Watt)";
    }
}
