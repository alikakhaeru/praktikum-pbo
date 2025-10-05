public class PerangkatDapur {
    String merk;

    public PerangkatDapur(String merk) {
        this.merk = merk;
    }

    public void masak() {
        System.out.println(merk + " memasak dengan cara standar.");
    }
}
