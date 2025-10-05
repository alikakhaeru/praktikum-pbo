public class Kompor extends PerangkatDapur {

    public Kompor(String merk) {
        super(merk);
    }

    @Override
    public void masak() {
        System.out.println(merk + " menumis sayuran dengan api sedang.");
    }
}
