package closestBall;
import java.util.*;



public class closestBall
{
  public int computeClosest(ArrayList<Integer> players,
      ArrayList<Integer> balls) {
    //sort the arraylists so that each is in ascending order. n = players, m = balls
    Collections.sort(players);// (nlogn)
    Collections.sort(balls);// (mlogm)
    int minimum = 100000;// initialize and assign (2)
    int difference = 0, i = 0, j = 0;// initialize and assign 3 ints (6)

    //iterates through both arrays in ascending order. if one x or y position is smaller than the other, the index for the corresponding array gets incremented so that the numbers continue to stay as close to each other as possible. this guarantees that only a few numbers will be tested for each player position. assuming worst-case scenario, the smallest distance would be between the two last-index values of both arrays (so a total # of iterations being i+j, or n+m). not i*j, since not every combo is checked (indexes move as they are compared to each other, so each array is only iterated through once).
    while (i < players.size() && j < balls.size())// comparison and calling method 2x and logic operator per each iteration (5)
    {
        difference = Math.abs(players.get(i) - balls.get(j));// assign value, call method for abs, call methods for get() from each arraylist, and subtract 1x per iteration (5)

        if (difference < minimum) //comparison, 1x per iteration (1)
          minimum = difference; //assignment (1)

        if (players.get(i) < balls.get(j)) //call method 2x, comparison 1x per iteration (3)
          i++; // increments (1)

        else
          j++; // increments (1)
    }
    
    return minimum; //returns (1)

    //T(n) = nlogn + mlogm + 2 + 6 + 5(n+m)(5+1+1+3+1+1) = nlogn + mlogm + 8 + 17(n+m)
    //T(n) = O(nlogn + mlogm)
  }
}
