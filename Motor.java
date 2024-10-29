public class Motor extends Kendaraan { // Polymorpishm
    public Motor(String nomorPolisi, String merk) {
        super(nomorPolisi, merk);
    }

    @Override
    public String getJenis() {
        return "Motor";
    }
}

