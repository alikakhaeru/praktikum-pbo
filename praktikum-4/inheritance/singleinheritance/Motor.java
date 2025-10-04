package inheritance.singleinheritance;

public class Motor extends Kendaraan {

    // Constructor memanggil constructor superclass
    public Motor(String merk, String warna) {
        super(merk, warna);
    }

    // Method tambahan khusus Motor
    public void bunyiKlakson() {
        System.out.println("Tin! Tin!");
    }
}
