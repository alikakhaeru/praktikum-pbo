package abstraction.interfacepengiriman;

public class PosExpress implements Pengiriman {
    int biaya;

    @Override
    public void kirimBarang(int berat) {
        biaya = berat * 11000;
        System.out.println("PosExpress: Barang dikirim dengan biaya Rp" + biaya);
    }

    @Override
    public void cekStatus() {
        System.out.println("PosExpress: Barang sedang dalam proses pengantaran ke alamat tujuan.");
    }
}
