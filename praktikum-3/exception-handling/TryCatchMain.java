public class TryCatchMain {
    public static void main(String[] args) {
        try {
            int totalKue = 8;
            int jumlahPiring = 0;
            int kuePerPiring = totalKue / jumlahPiring;
            System.out.println("Kue per piring: " + kuePerPiring);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: tidak bisa membagi dengan 0");
        } finally {
            System.out.println("Blok finally dijalankan.");
        }
    }
}
