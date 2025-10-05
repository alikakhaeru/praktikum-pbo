package abstraction.interfacepengiriman;

public class AnterAja implements Pengiriman {
    int biaya;

    @Override
    public void kirimBarang(int berat) {
        biaya = berat * 9500;
        System.out.println("AnterAja: Barang dikirim dengan biaya Rp" + biaya);
    }

    @Override
    public void cekStatus() {
        System.out.println("AnterAja: Barang sudah diterima di gudang kota tujuan.");
    }
}
