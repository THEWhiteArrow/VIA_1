//made by Damian Trafiałek
package dodgeBall;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class dodgeBall
{

  // Add any private fields you might need here
  //initialise the BBST
  private TreeSet<Integer> bbst= new TreeSet(); //2

  public void addPlayer(int x) { // O( log( BBST size) )
  //add a new value to BBST (by default there will not be 2 same values at the same time)
    bbst.add(x); // log( bbst size )
  }

//  public String display(){
//    String temp="";
//    for(Integer el : bbst)
//      temp+=el+" ";
//    return temp;
//  }

  public int throwBall(int x) { // O( log( BBST size) )

    //initialise default values for the ceiling and floor with (MAX & MIN)
    int ceiling = Integer.MAX_VALUE; //2
    int floor = Integer.MIN_VALUE; //2

    if(bbst.ceiling(x)!=null) ceiling=bbst.ceiling(x);
      //2+2log(x) - find the first higher or the same value elemet in bbst | if its null it has a value given by default

    if(bbst.floor(x)!=null) floor=bbst.floor(x); //2+2log(x)
    //2+2log(x) - find the first lower or the same value element in the bbst | if its null it has a value given by default

    //initialise the distance as a min value of between the closest higher and lower elemets
    int distance = Math.min( Math.abs(x-ceiling), Math.abs(x-floor) ); // 7

    // Implement your code here to update the line of players and return the distance
    if(x-distance==floor){//2
      bbst.remove(floor);//log( size of bbst)
    }else{
      bbst.remove(ceiling);//log( size of bbst)
    }

    //if distance is 0 then the player was eliminated so no player is moving to that position
    //player which was in 0 distance is removed in a previous step
    if(distance!=0)
      addPlayer(x); //log(bbst size)

    return distance;//1
  }
}
