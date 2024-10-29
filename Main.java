import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rental rental = new Rental();
        // Beberapa data kendaraan
        rental.tambahKendaraan(new Mobil("DK3324MNO", "Toyota Innova"));
        rental.tambahKendaraan(new Mobil("DK1234XYZ", "Toyota Avanza"));
        rental.tambahKendaraan(new Mobil("DK5678ABC", "Honda Jazz"));
        rental.tambahKendaraan(new Motor("DK9101DEF", "Yamaha Aerox"));
        rental.tambahKendaraan(new Motor("DK1112GHI", "Honda Vario"));
        rental.tambahKendaraan(new Motor("DK1131JKL", "Yamaha Xmax"));

        System.out.println("=== Identitas Mahasiswa ===");
        System.out.println("Nama  : Gede Raditya Putra");
        System.out.println("NIM   : 2315101025");
        System.out.println("Prodi : Ilmu Komputer");

        System.out.println("\nSelamat Datang di Rental Pak Sadikin!");
        System.out.println("Berikut data kendaraan yang disewakan:");
        System.out.println("Nomor Polisi: DK3324MNO, Nama: Toyota Innova");
        System.out.println("Nomor Polisi: DK1234XYZ, Nama: Toyota Avanza");
        System.out.println("Nomor Polisi: DK5678ABC, Nama: Honda Jazz");
        System.out.println("Nomor Polisi: DK9101DEF, Nama: Yamaha Aerox");
        System.out.println("Nomor Polisi: DK1112GHI, Nama: Honda Vario");
        System.out.println("Nomor Polisi: DK1131JKL, Nama: Yamaha Xmax");

        // Menjalankan proses rental
        rental.prosesRental(scanner);

        // Menampilkan data rental
        rental.tampilkanDataRental();

        // Menampilkan identitas mahasiswa

    }
}