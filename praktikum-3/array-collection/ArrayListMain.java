import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {
        // ArrayList daftar minuman
        ArrayList<String> daftarMinuman = new ArrayList<>();
        daftarMinuman.add("Kopi");
        daftarMinuman.add("Teh");
        daftarMinuman.add("Jus Alpukat");

        System.out.println("Daftar Minuman:");
        for (String minuman : daftarMinuman) {
            System.out.println(minuman);
        }
    }
}
