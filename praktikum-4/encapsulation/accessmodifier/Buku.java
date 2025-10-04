package encapsulation.accessmodifier;

public class Buku {
    public String judul = "Algoritma Pemrograman";    
    protected String penulis = "Budi Santoso";        
    String penerbit = "Erlangga";                     
    private int stok = 5;                             

    public void tampilkanStok() {
        System.out.println("Stok buku tersedia: " + stok);
    }
}
