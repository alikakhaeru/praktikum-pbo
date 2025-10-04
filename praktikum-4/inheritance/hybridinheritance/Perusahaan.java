package inheritance.hybridinheritance;

public class Perusahaan {
    protected String nama;

    public Perusahaan(String nama) {
        this.nama = nama;
    }

    public void produksi(int jumlah) {
        System.out.println("Perusahaan " + nama + " memproduksi " + jumlah + " unit barang.");
    }
}
