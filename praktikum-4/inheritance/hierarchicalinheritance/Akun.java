package inheritance.hierarchicalinheritance;

public class Akun {
    String username;

    public Akun(String username) {
        this.username = username;
    }

    public void login() {
        System.out.println(username + " berhasil login ke sistem.");
    }
}
