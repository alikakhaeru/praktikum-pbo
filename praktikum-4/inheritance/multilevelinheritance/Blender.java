package inheritance.multilevelinheritance;

public class Blender extends PerangkatDapur {
    private int kapasitas;

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void blenderMakanan() {
        System.out.println("Blender " + merk + " warna " + warna + 
                           " sedang menghaluskan makanan dengan kapasitas " 
                           + kapasitas + " ml.");
    }
}

