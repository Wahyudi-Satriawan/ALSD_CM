package CM2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListAntrian antrian = new LinkedListAntrian();
        QueueArray riwayat = new QueueArray(100);

        int pilihan;
        do {
            System.out.println("\n===== MENU SPBU =====");
            System.out.println("1. Tambah Kendaraan ke Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Tampilkan Jumlah Antrian");
            System.out.println("4. Layani Kendaraan dan Input Transaksi BBM");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String platNomor = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    antrian.addLast(new Kendaraan(platNomor, tipe, merk));
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    System.out.println("Jumlah kendaraan dalam antrian: " + antrian.getSize());
                    break;
                case 4:
                    Kendaraan dataKendaraan = antrian.ambil();
                    if (dataKendaraan == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.print("Jenis BBM (Pertalite/Pertamax/Solar/Dexlite): ");
                        String Jenisbbm = sc.nextLine();
                        System.out.print("Masukkan Harga per Liter: ");
                        double hargaLiter = sc.nextDouble();
                        BBM bbm = new BBM (Jenisbbm, hargaLiter);
                        System.out.print("Jumlah liter: ");
                        double liter = sc.nextDouble();
                        sc.nextLine();
                        TransaksiPengisian transaksi = new TransaksiPengisian(dataKendaraan, bbm, liter);
                        transaksi.hitungTotal();
                        riwayat.enqueue(transaksi);
                        System.out.println(">> Transaksi berhasil dicatat.");
                    }
                    break;
                case 5:
                    riwayat.riwayatTransaksi();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}