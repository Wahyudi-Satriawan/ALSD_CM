package CM2;

public class LinkedListAntrian {
    NodeLinkedList head;
    NodeLinkedList tail;

    boolean isEmpty() {
        return (head == null);
    }
    
    public void addLast (Kendaraan dataKendaraan) {
        NodeLinkedList newNode = new NodeLinkedList(dataKendaraan);
       if (isEmpty()) {
        head = tail = newNode;
       } else {
        tail.next = newNode;
        tail = newNode;
       }
    }

    public void print() {
        NodeLinkedList temp = head;
        if (isEmpty()) {
            System.out.println("Antrian Kosong");           
        }
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }
    }

    public int getSize() {
        int count = 0;
        NodeLinkedList temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    Kendaraan ambil() {
        if (head == null) return null;
        Kendaraan dataKendaraan = head.data;
        head = head.next;
        return dataKendaraan;
    }
}