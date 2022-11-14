package maxSubSum;

import java.util.*;

public class maxSubSum
{
  public int findMaxSubSum(ArrayList<Integer> input)
  {
    int _max=0,curr=0;

    for(int el : input){
      if(curr+el<0)
        curr=0;
      else
        curr+=el;

      if(curr>_max)
        _max=curr;
    }



    return _max;
  }
}
