package datastructures.arraylist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // Is List Empty
        System.out.println(list.isEmpty());

        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(35);
        list.add(40);
        list.add(45);
        System.out.println(list);

        // Add in-between
        list.add(2, 25);
        list.add(0, 5);
        list.add(8, 50);
        System.out.println(list);

        // Size of the List
        System.out.println("Size: " + list.size());

        // Query based on index
        System.out.println("0: " + list.get(0));
        System.out.println("5: " + list.get(5));
        System.out.println("8: " + list.get(8));

        // Remove an element
        list.remove(4);
        System.out.println(list);

        // Size of the List
        System.out.println("Size: " + list.size());

        // Is List Empty
        System.out.println(list.isEmpty());

        list.add(20);
        list.add(35);
        list.add(45);
        list.add(35);
        list.add(10);
        list.add(35);

        System.out.println(list);

        // Search Methods
        System.out.println("First Index of 10: " + list.indexOf(10));
        System.out.println("Last Index of 10: " + list.lastIndexOf(10));
        System.out.println("First Index of 12:" + list.indexOf(12));
        System.out.println("Element 24 is: " + list.contains(24));
        System.out.println("Element 25 is: " + list.contains(25));

        int[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        // Clear List
        list.clear();
        System.out.println(list);
    }
}
