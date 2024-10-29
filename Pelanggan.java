import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String idPelanggan;
    private ArrayList<Kendaraan> kendaraanDisewa = new ArrayList<>();

    public Pelanggan(String nama, String idPelanggan) {
        this.nama = nama;
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public ArrayList<Kendaraan> getKendaraanDisewa() {
        return kendaraanDisewa;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanDisewa.add(kendaraan);
        kendaraan.setTersedia(false); // Kendaraan menjadi false (tidak tersedia) setelah disewa
    }
}
