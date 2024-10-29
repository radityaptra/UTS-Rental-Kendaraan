import java.util.ArrayList;
import java.util.Scanner;

public class Rental {
    private ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
    private ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

    // Menambahkan kendaraan
    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }

    public ArrayList<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }

    // Menambahkan pelanggan
    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    // Memeriksa kendaraan berdasarkan nomor polisi (tantangan)
    public Kendaraan cariKendaraan(String nomorPolisi) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getNomorPolisi().equals(nomorPolisi) && k.getTersedia()) {
                return k;
            }
        }
        return null;
    }

    // Menampilkan informasi lengkap pelanggan dan kendaraan yang disewa
    public void tampilkanDataRental() {
        System.out.println("\nData Rental Kendaraan:");
        for (Pelanggan p : daftarPelanggan) {
            System.out.println("Nama Pelanggan: " + p.getNama());
            System.out.println("ID Pelanggan: " + p.getIdPelanggan());
            System.out.println("Kendaraan yang disewa:");
            for (Kendaraan k : p.getKendaraanDisewa()) {
                System.out.println("  - " + k.getJenis() + " " + k.getMerk() + " (Nomor Polisi: " + k.getNomorPolisi() + ")");
            }
            System.out.println();
        }
    }

    // Proses peminjaman kendaraan
    public void prosesRental(Scanner scanner) {
        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ID pelanggan: ");
        String idPelanggan = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, idPelanggan);
        tambahPelanggan(pelanggan);

        while (true) {
            System.out.print("Masukkan nomor polisi kendaraan yang ingin disewa: ");
            String nomorPolisi = scanner.nextLine();
            Kendaraan kendaraan = cariKendaraan(nomorPolisi);

            if (kendaraan != null) {
                pelanggan.tambahKendaraan(kendaraan);
                System.out.println("Kendaraan berhasil disewa!");
            } else {
                System.out.println("Kendaraan dengan nomor polisi tersebut tidak tersedia atau tidak ditemukan.");
            }

            System.out.print("Ingin menambah kendaraan lain? (y/n): ");
            String lagi = scanner.nextLine();
            if (!lagi.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
