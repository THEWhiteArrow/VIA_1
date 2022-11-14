package findClosest;

import java.util.*;

public class closest
{

  public int findClosest(ArrayList<Integer> input)
  {
    input.sort(Comparator.naturalOrder());
    int _min=Integer.MAX_VALUE;
    for(int i=1;i<input.size();++i)
      _min=Math.min(_min, input.get(i)-input.get(i-1));
    return _min;
  }

}