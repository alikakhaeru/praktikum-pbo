package abstraction.interfacepengiriman;

public class SiCepat implements Pengiriman {
    int biaya;

    @Override
    public void kirimBarang(int berat) {
        biaya = berat * 8500;
        System.out.println("SiCepat: Barang dikirim dengan biaya Rp" + biaya);
    }

    @Override
    public void cekStatus() {
        System.out.println("SiCepat: Barang sedang dikirim oleh kurir.");
    }
}
