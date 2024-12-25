package org.java17;

public class IntHeap {
    private int[] arr = new int[1000];
    private int size = 0;

    public void push(int element) {
        arr[size] = element;
        size++;
        heapUp();
    }

    private void swap(int indexOne, int indexTwo) {
        int tmp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = tmp;
    }

    public int peek() {
        return arr[0];
    }

    public int poll() {
        int min = arr[0];

        if (size == 0) {
            return 0;
        }

        if (size == 1) {
            size--;
            return arr[0];
        }

        arr[0] = arr[size-1];
        size--;

        heapDown();

        return min;
    }

    private void heapUp() {
        if (size == 0) {
            return;
        }
        int index = size - 1;
        while (arr[index] < arr[(index-1) / 2] && index > 0) {
            swap(index, (index-1)/2);
            index = (index-1) / 2;
        }
    }

    private void heapDown() {
        int index = 0;
        while (arr[index] > arr[index * 2 + 1]) {
            int leftIndex = index * 2 + 1;
            int rightIndex = index * 2 + 2;

            int smallerValue = 0;
            if (arr[index] > arr[leftIndex]) {
                smallerValue = arr[leftIndex];
                swap(index, leftIndex);
                index = leftIndex;
            } else if (smallerValue > arr[rightIndex]) {
                smallerValue = arr[rightIndex];
                swap(index, rightIndex);
                index = rightIndex;
            }
        }
    }

    public int size() {
        return size;
    }
}
