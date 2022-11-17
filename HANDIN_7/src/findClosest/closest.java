package findClosest;

import java.util.*;

public class closest
{
      public int findClosest(ArrayList<Integer> input)
      {
        Collections.sort(input); // sort the array list of number, so it is in ascending order
        // O(n.log n)
        int minDiff = input.get(1) - input.get(0); // find the minimum difference between first two numbers in the list,
        // as a first pair to compare with, assuming it has the smallest difference.
        //5

        for (int i = 2; i<input.size(); i++) { // starting from the third integer
          //2n+2
          minDiff = Math.min(minDiff, input.get(i) - input.get(i - 1)); // find the min diff by comparing difference
          // of all possible pairs in the array list
          //6
        }
        return minDiff; // return minimum difference
        //1
      }
    //T(n)= nlogn + 5 + (2n+2) + 6 + 1 =14 + 3nlogn = O(nlogn)
    }

