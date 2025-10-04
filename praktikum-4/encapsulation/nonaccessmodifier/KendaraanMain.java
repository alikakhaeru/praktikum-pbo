package encapsulation.nonaccessmodifier;

public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan k1 = new Kendaraan("Mobil", "B 1234 XY");
        Kendaraan k2 = new Kendaraan("Motor", "D 5678 AB");

        k1.tampilkanKendaraan();
        k2.tampilkanKendaraan();

        System.out.println("Total kendaraan terdaftar: " + Kendaraan.jumlahKendaraan);
    }
}
