package datastructures.arraylist;

import java.util.Arrays;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    private int[] arr;
    private int position;
    private int threshold;

    public MyArrayList() {
        initialize();
    }

    public void add(int element) {
        if (position >= threshold) grow();

        arr[position++] = element;
    }

    public void add(int index, int element) {
        if (index < 0 || index > position) {
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, position));
        }

        if (index == position) {
            arr[position++] = element;
        } else {
            for (int i = position; i > index; i--) {
                arr[i] = arr[i - 1];
            }

            arr[index] = element;
            position++;
        }

        if (position >= threshold) {
            grow();
        }

    }

    public int get(int index) {
        if (index < 0 || index >= position) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bound for length %d", index, position));
        }

        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= position) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bound for length %d", index, position));
        }

        for (int i = index; i < position - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[--position] = 0;
    }

    public void set(int index, int element) {
        if (index < 0 || index >= position) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bound for length %d", index, position));
        }

        arr[index] = element;
    }

    public boolean contains(int element) {
        for (int i = 0; i < position; i++) {
            if (arr[i] == element) {
                return true;
            }
        }

        return false;
    }

    public int indexOf(int element) {
        for (int i = 0; i < position; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(int element) {
        for (int i = position - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -1;
    }


    public int size() {
        return position;
    }

    public boolean isEmpty() {
        return position == 0;
    }

    public void clear() {
        Arrays.fill(arr, 0, position, 0);
    }

    public int[] toArray() {
        int[] result = new int[position];
        System.arraycopy(arr, 0, result, 0, position);

        return result;
    }

    private void initialize() {
        arr = new int[DEFAULT_CAPACITY];
        position = 0;
        threshold = (int) (arr.length * 0.8);
    }

    private void grow() {
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, position);
        arr = temp;
        threshold = (int) (arr.length * 0.8);
    }

    @Override
    public String toString() {
        if (position == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < position - 1; i++) {
            sb.append(arr[i]);
            sb.append(", ");
        }
        sb.append(arr[position - 1]);
        sb.append("]");

        return sb.toString();
    }

}
