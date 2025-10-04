package inheritance.hierarchicalinheritance;

public class AkunBank extends Akun {

    public AkunBank(String username) {
        super(username);
    }

    public void transferUang() {
        System.out.println(username + " melakukan transfer uang.");
    }

    public void cekSaldo() {
        System.out.println(username + " mengecek saldo di rekening.");
    }
}
