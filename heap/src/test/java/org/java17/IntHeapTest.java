package org.java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntHeapTest {

    @Test
    void push() {
        IntHeap heap =  new IntHeap();

        heap.push(4);

        assertEquals(1, heap.size());
    }

    @Test
    void peek() {
        IntHeap heap = new IntHeap();

        heap.push(4);
        heap.push(10);
        heap.push(3);
        heap.push(9);

        assertEquals(3, heap.peek());
    }

    @Test
    void poll() {
        IntHeap heap = new IntHeap();
        heap.push(4);
        heap.push(12);
        heap.push(9);
        heap.push(7);
        heap.push(2);

        assertEquals(5, heap.size());
        assertEquals(2, heap.peek());

        int min = heap.poll();
        assertEquals(2, min);
        assertEquals(4, heap.size());

        int min2 = heap.poll();
        assertEquals(4, min2);
        assertEquals(3, heap.size());
    }

    @Test
    void size() {
        IntHeap heap = new IntHeap();
        heap.push(44);
        heap.push(55);

        assertEquals(2, heap.size());
    }
}