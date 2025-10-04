package encapsulation.settergetter;

public class Pegawai {
    private String nama;
    private String jabatan;
    private double gaji;

    public Pegawai(String nama, String jabatan, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGaji(double gaji) {
        if (gaji > 0) {
            this.gaji = gaji;
        } else {
            System.out.println("Gaji tidak boleh negatif!");
        }
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }
}
