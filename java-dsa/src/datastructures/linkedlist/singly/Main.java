package datastructures.linkedlist.singly;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // ===============================
        // 1. Add elements
        // ===============================
        list.add(10);               // Append 10
        list.add(20);               // Append 20
        list.add(30);               // Append 30
        list.addFirst(5);           // Add 5 at the start
        list.addLast(40);           // Add 40 at the end
        list.insertAt(2, 15);       // Insert 15 at index 2
        System.out.println("After adding elements: " + list);

        // ===============================
        // 2. Get & Set values
        // ===============================
        System.out.println("Element at index 3: " + list.get(3)); // Expected: 20
        list.set(3, 25); // Change element at index 3 from 20 to 25
        System.out.println("After setting index 3 to 25: " + list);

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
        System.out.println("After removeFirst: " + list);

        list.removeLast(); // Remove tail (40)
        System.out.println("After removeLast: " + list);

        list.removeAt(2); // Remove element at index 2 (25)
        System.out.println("After removeAt(2): " + list);

        list.remove(15); // Remove element with value 15
        System.out.println("After remove(15): " + list);

        // ===============================
        // 5. Utility methods
        // ===============================
        System.out.println("List size: " + list.size()); // Expected: 2
        System.out.println("Is empty? " + list.isEmpty()); // false

        // ===============================
        // 6. Clear list
        // ===============================
        list.clear();
        System.out.println("After clear(): " + list); // Expected: []
        System.out.println("Is empty after clear? " + list.isEmpty()); // true
    }
}
