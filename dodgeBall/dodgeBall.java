package dodgeBall;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class dodgeBall
{

  private TreeSet<Integer> bst= new TreeSet();
  // Add any private fields you might need here
  public void addPlayer(int x) {
    bst.add(x);
  }

  public String display(){
    String temp="";
    for(Integer el : bst)
      temp+=el+" ";

    return temp;
  }

  public int throwBall(int x) {


    int ceiling = Integer.MAX_VALUE;
    int floor = Integer.MIN_VALUE;

    if(bst.ceiling(x)!=null) ceiling=bst.ceiling(x);
    if(bst.floor(x)!=null) floor=bst.floor(x);

    int distance = Math.min( Math.abs(x-ceiling), Math.abs(x-floor) );

    // Implement your code here to update the line of players and return the distance
    if(x-distance==floor){
      bst.remove(floor);
    }else{
      bst.remove(ceiling);
    }

    if(distance!=0)
      addPlayer(x);

    return distance;
  }
}
