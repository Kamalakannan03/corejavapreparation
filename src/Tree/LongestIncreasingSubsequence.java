package Tree;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static int arrayChallenge(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        List<Integer> lis = new ArrayList<>();

        for (int num : arr) {
            int pos = Collections.binarySearch(lis, num);

            if (pos < 0) {
                pos = -(pos) - 1; // Convert negative index to insertion position
            }

            if (pos < lis.size()) {
                lis.set(pos, num); // Replace element at found position
            } else {
                lis.add(num); // Append if it's the largest element so far
            }
        }

        return lis.size(); // Length of LIS
    }

    public static void main(String[] args) {
        //int[] arr = {4, 3, 5, 1, 6};
        int[] arr = {1, 3, 5, 4, 7};
        System.out.println("Length of Longest Increasing Subsequence: " + arrayChallenge(arr));
    }
}

