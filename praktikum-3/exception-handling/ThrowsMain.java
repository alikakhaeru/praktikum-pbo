import java.io.IOException;

public class ThrowsMain {

    static void cekStokBarang() throws IOException {
        throw new IOException("Stok barang habis!");
    }

    public static void main(String[] args) {
        try {
            cekStokBarang();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
