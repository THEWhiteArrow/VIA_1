package inversions;

import java.io.*;
import java.util.*;

public class Inversions
{

  public int countInversions(ArrayList<Integer> input) {
      // Implement your code here to return the number of inversions in input!
    ans=0;
    mergeSort(input,0,input.size()-1);
    return ans;
  }
  public static int ans;
  public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr,int l,int r){

    if(l>=r) {
      ArrayList<Integer> merged = new ArrayList<>();
      merged.add(arr.get(l));
      return merged;
    }

    int m = (l+r)/2;

    ArrayList<Integer> arrLeft = mergeSort(arr,l,m);
    ArrayList<Integer> arrRight = mergeSort(arr,m+1,r);

    ArrayList<Integer> merged = merge(arrLeft,arrRight);
    return merged;
  }

  public static ArrayList<Integer> merge(ArrayList<Integer> arrLeft, ArrayList<Integer> arrRight){
    ArrayList<Integer> merged = new ArrayList<>();
    int _indexL=0,_indexR=0;

    while(_indexL<arrLeft.size() && _indexR<arrRight.size()){

      if(arrLeft.get(_indexL)<=arrRight.get(_indexR)){
        merged.add(arrLeft.get(_indexL++));
      }
      else{
        merged.add(arrRight.get(_indexR++));
        ans+= arrLeft.size()-(_indexL);
      }

    }

    while(_indexL<arrLeft.size())
      merged.add(arrLeft.get(_indexL++));

    while(_indexR<arrRight.size())
      merged.add(arrRight.get(_indexR++));


    return merged;
  }
}

