package QueueSimulation;

import java.util.*;

public class QueueSimulation
{
  public int simulate(ArrayList<Integer> input)
  {
    while (input.size()!=1)//runs 2n times
    {
      input.remove(0);//runs 1 time
      input.add(input.get(0));//runs 2 times
      input.remove(0);//runs 1 time
    }
    return input.get(0);//runs 2 times
  }

}

//The total is n(2+1+2+1)+2= 6n+2, so the time complexity is O(n).