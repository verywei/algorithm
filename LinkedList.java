package algorithem;

public class LinkedList {
    Node head = null;
    int size;

    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addNode(int d) {
        if (head == null) {
            head = new Node(d);
            size++;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(d);
            size++;
        }
    }

    public void printLink() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean deleteNode(int index) {
        if (index < 0 || index > size) {
            return false;
        } else {
            if (index == 1) {
                head = head.next;
            } else {
                int count = 0;
                Node tmp = head;
                for (int i = 1; i < index - 1; i++) {
                    tmp = tmp.next;
                }
                tmp.next = tmp.next.next;
                size--;
            }
            return true;
        }
    }

    public int get(int index) {
        if (index < 0 || index > size) {
            return -1;
        } else {
            Node tmp=head;
            for (int i=1;i<index;i++){
                tmp=tmp.next;
            }
            return tmp.data;
        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i=1;i<=1000;i++)
            linkedList.addNode(i);

        System.out.println(linkedList.get(550));
    }
}
