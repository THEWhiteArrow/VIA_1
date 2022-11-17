package maxSubSum;

import java.util.*;

public class maxSubSum
{
  public int findMaxSubSum(ArrayList<Integer> input)
  {
    int best_sum = 0; //2
    int current_sum = 0; //2
    for (int i = 0; i < input.size(); i++) //2n+2
    {
      if (current_sum <= 0) // n
      {
        current_sum = input.get(i); //2
      }
      else //n
      {
        current_sum += input.get(i); //3
      }

      if (current_sum > best_sum) //n
      {
        best_sum = current_sum; //1
      }
    }
    return best_sum; //1
  }

  // T(n) = 2+2+2n+2+n+n+3+n+1+1 = 11+5n
  // T(n) = O(n)
}
