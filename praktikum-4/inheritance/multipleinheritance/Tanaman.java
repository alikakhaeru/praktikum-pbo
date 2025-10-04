package inheritance.multipleinheritance;

public class Tanaman {
    // properti
    private String nama;

    // Constructor
    public Tanaman(String nama) {
        this.nama = nama;
    }

    // Method
    public void fotosintesis() {
        System.out.println(nama + " sedang melakukan fotosintesis.");
    }

    public String getNama() {
        return nama;
    }
}

