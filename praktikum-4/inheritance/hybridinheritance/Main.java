package inheritance.hybridinheritance;

public class Main {
    public static void main(String[] args) {
        Manajer budi = new Manajer("PT Maju Jaya", "Manajer", "Produksi");

        budi.produksi(500);            
        budi.bekerja(8);                
        budi.memimpin("Rapat Anggaran");
        budi.investasi(1000000000);     
    }
}
