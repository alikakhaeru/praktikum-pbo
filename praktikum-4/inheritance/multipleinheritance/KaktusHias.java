package inheritance.multipleinheritance;

public class KaktusHias extends Tanaman implements BisaBerbunga, BisaTumbuhCepat {

    // Constructor
    public KaktusHias(String nama) {
        super(nama);
    }

    // Method dari interface BisaBerbunga
    @Override
    public void berbunga() {
        System.out.println(getNama() + " sedang berbunga indah.");
    }

    // Method dari interface BisaTumbuhCepat
    @Override
    public void tumbuhCepat() {
        System.out.println(getNama() + " tumbuh dengan cepat.");
    }
}
