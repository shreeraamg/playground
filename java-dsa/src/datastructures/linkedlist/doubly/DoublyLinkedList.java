package datastructures.linkedlist.doubly;

public class DoublyLinkedList {

    private Node head;

    private Node tail;

    private int size;

    public DoublyLinkedList() {
        initialize();
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        size++;

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        size++;

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.prev = tail;
        tail.next = node;
        tail = node;
    }

    public void insertAt(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, size));
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        int mid = size / 2;
        Node node = new Node(data);
        Node temp;
        if (index < mid) {
            temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp;
        } else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
            temp.prev.next = node;
            node.prev = temp.prev;
            node.next = temp;
            temp.prev = node;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bound for length %d", index, size));
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node temp;
        int mid = size / 2;
        if (index < mid) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }

    public void remove(int data) {
        Node temp = head;

        if (head == null) {
            return;
        }

        while (temp != null) {
            if (temp.data == data) {
                if (temp == head) {
                    removeFirst();
                } else if (temp == tail) {
                    removeLast();
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    size--;
                }
                return;
            }
            temp = temp.next;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bound for length %d", index, size));
        }

        Node temp;
        int mid = size / 2;
        if (index < mid) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp.data;
    }

    public void set(int index, int data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bound for length %d", index, size));
        }

        Node temp;
        int mid = size / 2;
        if (index < mid) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        temp.data = data;
    }

    public boolean contains(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(int data) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int lastIndexOf(int data) {
        Node temp = tail;
        int i = size - 1;
        while (temp != null) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.prev;
            i--;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        initialize();
    }

    private void initialize() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;

        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(", ");
            temp = temp.next;
        }
        sb.append("]");

        return sb.toString();
    }

    private static class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }
}
