// made by Damian Trafiałek
package QueueSimulation;

import java.util.*;

public class QueueSimulation
{
  public static int log2(int n){ //O(1)
    //function to calculate the logarithm base 2 of n

    //time complexity of Math.log is O(1) referencing the website GeeksForGeeks.org
    // link --> https://www.geeksforgeeks.org/program-to-compute-log-n/

    return (int)(Math.log(n)/Math.log(2)); //5
  }
  public static int magic(int n){ // O(log(log(n)))
    //function with math formula for the index of the item that will be left the last one standing in a queue at the end of theoretical operations

    //time complexity of Math.pow(a,b) is O(log(b)) referencing the website GeeksForGeeks.org
    // link --> https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/

    int ans = (int) (2*( n-Math.pow(2,log2(n)) )); //5+ log( log(n) )
    return ans==0 ? n : ans; //2
  }

  public int simulate(ArrayList<Integer> input){
    //    //return the array item on magic(input.size()-1) index -> magic functions returns indexes from 1 and not 0 like in arrayList start
    //    // time complexity 1+1+log(log(n)) ~~ O( log(log(n)) )
    //
    return input.get( magic(input.size())-1   );//1
    //    // O( log(log(N)) ) - easy google internship
  }

  //helper function created to help me figure out the loglogn function
  public int simulate2(ArrayList<Integer> input)
  {

    Queue<Integer> Q = new LinkedList<>();
    for(Integer el : input)
      Q.add(el);

    while(Q.size()!=1){
      Q.poll();
      Q.add(Q.poll());
    }
    return Q.peek();
  }

}