package encapsulation.settergetter;

public class PegawaiMain {
    public static void main(String[] args) {
        Pegawai pgw = new Pegawai("Dina", "Staff IT", 5000000);

        // akses lewat getter
        System.out.println("Nama: " + pgw.getNama());
        System.out.println("Jabatan: " + pgw.getJabatan());
        System.out.println("Gaji: Rp " + pgw.getGaji());

        // ubah data lewat setter
        pgw.setNama("Rudi");
        pgw.setJabatan("Manager");
        pgw.setGaji(8000000);

        System.out.println("\nSetelah diubah:");
        System.out.println("Nama: " + pgw.getNama());
        System.out.println("Jabatan: " + pgw.getJabatan());
        System.out.println("Gaji: Rp " + pgw.getGaji());
    }
}
