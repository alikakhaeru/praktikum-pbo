package inheritance.hybridinheritance;

public class Karyawan extends Perusahaan {
    protected String jabatan;

    public Karyawan(String nama, String jabatan) {
        super(nama);
        this.jabatan = jabatan;
    }

    public void bekerja(int jam) {
        System.out.println("Karyawan dengan jabatan " + jabatan + " bekerja selama " + jam + " jam di perusahaan " + nama);
    }
}
