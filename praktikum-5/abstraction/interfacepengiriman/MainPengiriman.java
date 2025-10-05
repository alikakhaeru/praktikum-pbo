package abstraction.interfacepengiriman;

public class MainPengiriman {
    public static void main(String[] args) {
        Pengiriman pos = new PosExpress();
        Pengiriman anter = new AnterAja();
        Pengiriman sicepat = new SiCepat();

        System.out.println("=== Sistem Pengiriman Barang ===");
        pos.kirimBarang(3);
        pos.cekStatus();

        System.out.println();
        anter.kirimBarang(2);
        anter.cekStatus();

        System.out.println();
        sicepat.kirimBarang(5);
        sicepat.cekStatus();
    }
}
