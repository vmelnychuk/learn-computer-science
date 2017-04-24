package io.neko.learn.cs.bigo;

import java.util.concurrent.ThreadLocalRandom;

public class BigONotation {
    private int[] array;
    private int lastIndex = 0;

    private static long startTime;
    private static long endTime;

    // O(1)
    public int addElementToArray(int element) {
        array[lastIndex++] = element;
        return lastIndex;
    }

    // O(N)
    public int linearSearch(int element) {
        startTime = System.currentTimeMillis();

        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = i;
            }
        }

        endTime = System.currentTimeMillis();
        return result;
    }


    public void generateRandomArray() {
        for(int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, i + 1);
        }
        lastIndex = array.length - 1;
    }


    public static void main(String[] args) {

    }
}
