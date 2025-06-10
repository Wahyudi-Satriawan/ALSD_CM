package CM2;

class TransaksiPengisian { //Wahyu
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = 0;
    }

    void hitungTotal() {
        totalBayar = liter * bbm.hargaPerLiter;
    }
}