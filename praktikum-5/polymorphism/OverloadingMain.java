class Printer {

    void cetak() {
        System.out.println("Mencetak dokumen default");
    }

    void cetak(String dokumen) {
        System.out.println("Mencetak dokumen: " + dokumen);
    }

    void cetak(String dokumen, int jumlah) {
        System.out.println("Mencetak dokumen: " + dokumen + " sebanyak " + jumlah + " halaman");
    }
}

public class OverloadingMain {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Memanggil method overloading
        printer.cetak();
        printer.cetak("Laporan Praktikum"); 
        printer.cetak("Materi Kuliah", 3); 
    }
}
