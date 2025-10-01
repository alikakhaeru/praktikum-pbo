package view;

import model.Produk;

public class ProdukView {
    public void tampilkanProduk(Produk p) {
        System.out.println("Nama Produk: " + p.nama);
        System.out.printf("Harga: Rp%,.0f%n", p.harga); 
        System.out.println("-------------------");
    }
}
