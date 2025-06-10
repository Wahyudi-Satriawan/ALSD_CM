package CM2;

class TransaksiPengisian {
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

    public String toString() {
        return kendaraan.platNomor + " - " + kendaraan.tipe + " - " + kendaraan.merk +
            " | BBM: " + bbm.namaBBM +
            " | Liter: " + liter +
            " | Harga/Liter: " + bbm.hargaPerLiter +
            " | Total: Rp" + totalBayar;
    }

}