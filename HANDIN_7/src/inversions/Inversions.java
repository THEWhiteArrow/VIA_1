import java.util.ArrayList;

public class Inversions
{
  public int countInversions(ArrayList<Integer> input)
  {
    //initializes and assigns = 2
    ArrayList<Integer> invList = new ArrayList<Integer>(input);


    //initializes and assigns = 2
    int counter=0;

    //outer loop runs n times
    for (int i=0; i<invList.size()-1; i++){
      //inner loop runs n times per iteration of outer loop
      for (int j=i ; j<invList.size(); j++)
      {
        //2 methods, 1 comparison = 3
        if (invList.get(i) > invList.get(j))
        {
          counter ++; //increment = 1
        }

      }
    }
    return counter; //return = 1
  }
}

// T(n) = 2+2+n*n(3+1)+1 --> 5 + 4n^2 = O(n^2)