package encapsulation.accessmodifier;

public class BukuMain {
    public static void main(String[] args) {
        Buku buku = new Buku();

        System.out.println("Judul: " + buku.judul);       
        System.out.println("Penulis: " + buku.penulis);   
        System.out.println("Penerbit: " + buku.penerbit); 

        buku.tampilkanStok();
    }
}
