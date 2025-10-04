package encapsulation.nonaccessmodifier;

public class Kendaraan {
    public static int jumlahKendaraan = 0;      
    public final String tipe;                  
    private String platNomor;

    public Kendaraan(String tipe, String platNomor) {
        this.tipe = tipe;
        this.platNomor = platNomor;
        jumlahKendaraan++;
    }

    public void tampilkanKendaraan() {
        System.out.println("Tipe: " + tipe + " | Plat: " + platNomor);
    }
}
