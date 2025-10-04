package inheritance.multilevelinheritance;

public class Main {
    public static void main(String[] args) {
        Blender blender1 = new Blender();
        blender1.setMerk("Philips");
        blender1.setWarna("Putih");
        blender1.setKapasitas(1500);

        // Output hasil
        System.out.println("Merk     : " + blender1.getMerk());
        System.out.println("Warna    : " + blender1.getWarna());
        System.out.println("Kapasitas: " + blender1.getKapasitas() + " ml");

        blender1.blenderMakanan();
    }
}
