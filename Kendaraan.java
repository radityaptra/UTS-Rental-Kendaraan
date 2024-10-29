abstract class Kendaraan { //Abstraction
    private String nomorPolisi;
    private String merk;
    private boolean tersedia;

    public Kendaraan(String nomorPolisi, String merk) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tersedia = true; // Default kendaraan tersedia
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public String getMerk() {
        return merk;
    }

    public boolean getTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Abstraksi method untuk diimplementasikan oleh subclass
    public abstract String getJenis();
}