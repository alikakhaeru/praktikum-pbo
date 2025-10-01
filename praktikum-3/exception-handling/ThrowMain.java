public class ThrowMain {

    static void cekSuhuKopi(int suhu) {
        if (suhu < 60) {
            throw new IllegalArgumentException("Kopi terlalu dingin!");
        }
        System.out.println("Suhu kopi pas: " + suhu + "°C");
    }

    public static void main(String[] args) {
        cekSuhuKopi(50);
    }
}
