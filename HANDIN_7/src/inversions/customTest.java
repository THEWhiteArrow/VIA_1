package inversions;

import java.util.ArrayList;

public class customTest
{
  public static int R(int a, int b){
    return (int) Math.floor(Math.random()*(b-a+1)+a);
  }

  public static void cout(ArrayList<Integer> arr){
    for(int el : arr)
      System.out.print(el+",");
    System.out.print("\n");
  }

  public static void main(String[] args)
  {
    ArrayList<Integer> input = new ArrayList<>();
//    int r=R(5,10);
//    for(int i=1;i<=r;++i) input.add(R(1,500));
    for(int i=5;i>=1;--i)
      input.add(i);

    cout(input);
    cout(Inversions.mergeSort(input,0,input.size()-1));
    System.out.println("Total inversions: "+new Inversions().countInversions(input));
  }
}
