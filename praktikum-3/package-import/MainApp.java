import model.Produk;
import view.ProdukView;

public class MainApp {
    public static void main(String[] args) {
        Produk p1 = new Produk("Laptop", 12000000);
        Produk p2 = new Produk("Mouse", 150000);

        ProdukView view = new ProdukView();

        view.tampilkanProduk(p1);
        view.tampilkanProduk(p2);
    }
}
