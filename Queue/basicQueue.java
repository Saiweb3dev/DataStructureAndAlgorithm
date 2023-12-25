package Queue;

public class basicQueue {
    static class Queue {
        int front, rear;
        int []arr;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            if (rear == 100001) {
                return;
            }
            arr[rear] = e;
            rear++;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            if (front == rear) {
                return -1;
            }
            int val = arr[front];
            arr[front] = 0;
            front++;
            return val;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue()); // prints 1
        System.out.println(q.dequeue()); // prints 2
        System.out.println(q.dequeue()); // prints 3
    }
}
