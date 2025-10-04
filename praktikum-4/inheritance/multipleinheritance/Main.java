package inheritance.multipleinheritance;

public class Main {
    public static void main(String[] args) {
        KaktusHias kaktus = new KaktusHias("Kaktus Mini");

        // Method dari superclass Tanaman
        kaktus.fotosintesis();

        // Method dari interface BisaBerbunga
        kaktus.berbunga();

        // Method dari interface BisaTumbuhCepat
        kaktus.tumbuhCepat();
    }
}
