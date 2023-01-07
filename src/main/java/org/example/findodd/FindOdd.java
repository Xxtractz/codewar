package org.example.findodd;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 * //
 * There will always be only one integer that appears an odd number of times.
 * //
 * Examples
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

public class FindOdd {
    public static int findIt(int[] ints) {
        AtomicInteger odd = new AtomicInteger();
        final Map<Integer, Integer> mappedInt = new HashMap<>();

        for (int number : ints) {
            if (mappedInt.containsKey(number)) {
                if (mappedInt.containsKey(number)) {
                    mappedInt.put(number, mappedInt.get(number) + 1);
                }
            } else {
                mappedInt.put(number, 1);
            }
        }

        mappedInt.forEach((integer, integer2) -> {
            if ((integer2 % 2) != 0){
                odd.set(integer);
            }
        });

        return odd.get();
    }
}