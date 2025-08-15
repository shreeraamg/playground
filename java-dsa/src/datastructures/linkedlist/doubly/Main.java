package datastructures.linkedlist.doubly;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // ===============================
        // 1. Add elements
        // ===============================
        list.addFirst(10);          // Add 10 at the start
        list.addFirst(5);           // Add 5 at the start
        list.addLast(20);           // Add 20 at the end
        list.addLast(30);           // Add 30 at the end
        list.insertAt(2, 15);       // Insert 15 at index 2
        System.out.println("After adding elements: " + list); // Expected: [5, 10, 15, 20, 30]

        // ===============================
        // 2. Get & Set values
        // ===============================
        System.out.println("Element at index 3: " + list.get(3)); // Expected: 20
        list.set(3, 25); // Change element at index 3 from 20 to 25
        System.out.println("After setting index 3 to 25: " + list); // Expected: [5, 10, 15, 25, 30]

        // ===============================
        // 3. Search operations
        // ===============================
        System.out.println("Contains 25? " + list.contains(25)); // true
        System.out.println("Index of 15: " + list.indexOf(15)); // Expected: 2
        System.out.println("Last index of 25: " + list.lastIndexOf(25)); // Expected: 3

        // ===============================
        // 4. Remove operations
        // ===============================
        list.removeFirst(); // Remove head (5)
        System.out.println("After removeFirst: " + list); // Expected: [10, 15, 25, 30]

        list.removeLast(); // Remove tail (30)
        System.out.println("After removeLast: " + list); // Expected: [10, 15, 25]

        list.removeAt(1); // Remove element at index 1 (15)
        System.out.println("After removeAt(1): " + list); // Expected: [10, 25]

        list.remove(25); // Remove element with value 25
        System.out.println("After remove(25): " + list); // Expected: [10]

        // ===============================
        // 5. Utility methods
        // ===============================
        System.out.println("List size: " + list.size()); // Expected: 1
        System.out.println("Is empty? " + list.isEmpty()); // false

        // ===============================
        // 6. Clear list
        // ===============================
        list.clear();
        System.out.println("After clear(): " + list); // Expected: []
        System.out.println("Is empty after clear? " + list.isEmpty()); // true
    }
}
