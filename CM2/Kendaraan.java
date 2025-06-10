package CM2;

public class Kendaraan { //Adel
    String platNomor, tipe, merk;

    Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }
    
    void tampilInformasi() { //Bagas
        System.out.println("=================================");
    System.out.println("Plat Nomor: " + platNomor );
    System.out.println("Tipe: " + tipe );
    System.out.println("Merk: " + merk );
    }
}