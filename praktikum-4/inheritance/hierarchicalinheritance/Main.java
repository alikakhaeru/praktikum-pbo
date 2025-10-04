package inheritance.hierarchicalinheritance;

public class Main {
    public static void main(String[] args) {
        AkunBank akunBank = new AkunBank("Alika2403044");
        AkunEcommerce akunEcommerce = new AkunEcommerce("AglonemaShop");

        akunBank.login();
        akunBank.cekSaldo();
        akunBank.transferUang();

        System.out.println("-------------------");

        akunEcommerce.login();
        akunEcommerce.tambahKeranjang();
        akunEcommerce.beliBarang();
    }
}
