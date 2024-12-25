package org.java17;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntHeap myHeap = new IntHeap();

        myHeap.push(12);
        myHeap.push(19);
        myHeap.push(14);
        myHeap.push(9);
        myHeap.push(10);

        System.out.println(myHeap.peek());
    }

}