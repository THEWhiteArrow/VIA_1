package QueueSimulation;

import java.util.*;

public class QueueSimulation
{
  public int simulate(ArrayList<Integer> input)
  {
    while (input.size()!=1)
    {
      input.remove(0);
      input.add(input.get(0));
      input.remove(0);
    }
    return input.get(0);
  }

}
