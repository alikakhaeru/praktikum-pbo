package inheritance.singleinheritance;

public class Kendaraan {
    private String merk;
    private String warna;

    public Kendaraan(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public void bergerak() {
        System.out.println(merk + " " + warna + " bergerak.");
    }
}
