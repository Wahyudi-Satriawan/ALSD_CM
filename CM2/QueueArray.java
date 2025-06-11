package CM2;

class QueueArray { //Wahyu
    TransaksiPengisian[] data;
    int front, rear, max, size;

    QueueArray (int n) {
        max = n;
        data = new TransaksiPengisian[n];
        front = rear = -1;
        size = 0;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(TransaksiPengisian transaksi) {
        if (isFull()) {
            System.out.println("Queue transaksi penuh.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear ++;
            }
        }
        data[rear] = transaksi;
        size++;
    }
    

    public void riwayatTransaksi() { //Adel
        if (isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        System.out.println("-- Riwayat Transaksi --");
        int i = front;
        while (true) {
            System.out.println(data[i].kendaraan.platNomor + ": "+ data[i].totalBayar);
            if (i == rear){
                break;
            }
            i = (i + 1) % max;
        }
        System.out.println("Jumlah transaksi: " + size);
    }
}