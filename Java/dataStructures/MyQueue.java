public class MyQueue {

    private int maxSize; // set max number of array elements
    private long[] queArray;
    private int front; // index for element at front of line
    private int rear; // index of element at back of line
    private int nItems; // maintain the number of items in queue

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.insert(100);
        queue.insert(200);
        queue.insert(300);
        queue.insert(500);
        queue.insert(700);
        queue.view();
    }

    public MyQueue(int size) {
        maxSize = size;
        queArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public void view() {
        System.out.print("[");
        for (int i = 0; i < queArray.length; i++) {
            if (i != queArray.length - 1) {
                System.out.print(queArray[i] + ", ");
            } else {
                System.out.print(queArray[i]);
            }
        }
        System.out.print("]");
    }

    public long remove() {
        long temp = queArray[front];
        front++;
        if (front == maxSize) {
            front = 0; // reset front index
        }
        nItems--;
        return temp;
    }

    public long viewFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}