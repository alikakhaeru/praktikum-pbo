import java.util.HashMap;

public class HashMapMain {

    public static void main(String[] args) {
        // HashMap kode produk dan nama produk
        HashMap<String, String> kodeProduk = new HashMap<>();
        kodeProduk.put("P001", "Laptop");
        kodeProduk.put("P002", "Smartphone");
        kodeProduk.put("P003", "Headphone");

        System.out.println("Daftar Produk Elektronik:");
        for (var entry : kodeProduk.entrySet()) {
            System.out.println(entry);
        }
    }
}
