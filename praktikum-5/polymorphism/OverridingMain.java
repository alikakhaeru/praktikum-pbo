public class OverridingMain {
    public static void main(String[] args) {
        PerangkatDapur perangkat1 = new PerangkatDapur("Generic Cooker");
        Oven oven1 = new Oven("Philips Oven");
        Kompor kompor1 = new Kompor("Rinnai Kompor");

        perangkat1.masak(); // Memanggil method superclass
        oven1.masak();      // Memanggil method subclass Oven
        kompor1.masak();    // Memanggil method subclass Kompor
    }
}
