package inheritance.hierarchicalinheritance;

public class AkunEcommerce extends Akun {

    public AkunEcommerce(String username) {
        super(username);
    }

    public void beliBarang() {
        System.out.println(username + " membeli barang di e-commerce.");
    }

    public void tambahKeranjang() {
        System.out.println(username + " menambahkan barang ke keranjang.");
    }
}
