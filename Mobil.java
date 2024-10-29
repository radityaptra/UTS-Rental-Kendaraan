public class Mobil extends Kendaraan { // Inheritance
    public Mobil(String nomorPolisi, String merk) {
        super(nomorPolisi, merk);
    }

    @Override
    public String getJenis() {
        return "Mobil";
    }
}