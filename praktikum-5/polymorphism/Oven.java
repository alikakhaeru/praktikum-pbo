public class Oven extends PerangkatDapur {

    public Oven(String merk) {
        super(merk);
    }

    @Override
    public void masak() {
        System.out.println(merk + " memanggang kue dengan suhu yang tepat.");
    }
}
