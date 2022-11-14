package closestBall;
import java.util.*;

public class closestBall
{
  public int computeClosest(ArrayList<Integer> players,
      ArrayList<Integer> balls)
  {
    long _min=Integer.MAX_VALUE;

    TreeSet<Integer> T = new TreeSet<>();
    for(int player : players) T.add(player);

    for(int ball : balls){

      long floor = Integer.MIN_VALUE;
      if(T.floor(ball)!=null) floor=T.floor(ball);

      long ceiling = Integer.MAX_VALUE;
      if(T.ceiling(ball)!=null)ceiling=T.ceiling(ball);


      _min = Math.min(_min, Math.min(
          ceiling-ball,
          ball-floor
      ) );
    }

    return (int)_min;
  }
}
