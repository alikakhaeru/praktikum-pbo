package inheritance.hybridinheritance;

public class Manajer extends Karyawan implements Investor {
    private String departemen;

    public Manajer(String nama, String jabatan, String departemen) {
        super(nama, jabatan);
        this.departemen = departemen;
    }

    public void memimpin(String rapat) {
        System.out.println("Manajer departemen " + departemen + " sedang memimpin " + rapat);
    }

    @Override
    public void investasi(double nominal) {
        System.out.println("Manajer menginvestasikan Rp " + nominal + " di perusahaan " + nama);
    }
}
