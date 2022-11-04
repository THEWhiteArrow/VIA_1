// test class created to help with magic method
package QueueSimulation;

import java.util.ArrayList;

public class QTest
{
  public static ArrayList<Integer> createArr(int length){
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=1;i<=length;++i)
      list.add(i);
    return list;
  }

  public static void main(String[] args)
  {
    for(int i=1;i<=1024;++i)
      System.out.println(i+":"+ new QueueSimulation().simulate2(createArr(i)) +" | " + new QueueSimulation().simulate(createArr(i)));

  }
}
