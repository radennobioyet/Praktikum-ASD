class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue sudah kosong");
        }
    }

    void Enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue penuh (overflow)");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = dt;
        size++;
    }

    int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong (underflow)");
            return -1;
        }
        int dt = data[front];
        front++;
        size--;
        if (size == 0) {
            front = rear = -1;
        }
        return dt;
    }
}