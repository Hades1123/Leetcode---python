class MyLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int count;

    public boolean isEmpty() {
        return this.count == 0;
    }

    public MyLinkedList() {
        this.head = null;
        this.count = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        Node current = this.head;
        for (int i = 0; i < index; ++i) {
            current = current.next;
        }
        return current.data;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.count++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            newNode.next = this.head;
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.count += 1;
    }

    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if (index < 0 || index > count) {
            return;
        }
        if (index == 0) {
            newNode.next = this.head;
            this.head = newNode;
        } else {
            Node current = this.head;
            for (int i = 0; i < index - 1; ++i) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        this.count += 1;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.count) {
            return;
        }
        if (index == 0) {
            this.head = this.head.next;
        } else {
            Node current = this.head;
            for (int i = 0; i < index - 1; ++i) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            } else {
                current.next = null;
            }
        }

        this.count--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
