package ReversePolishNotation;

import java.util.*;

public class ReversePolishCalculator
{
  private final Deque<Integer> stack = new ArrayDeque<>();

  //pushes something onto the stack
  public void push(int n) {
    stack.push(n); //calls method (1)
  }

  //adds two most recent items on the stack and pushes the result
  public void plus() {
    push(stack.pop() + stack.pop()); //calls method, pops item from stack, adds, then pops again (4)
  }


  //because we are working with a stack, in order to subtract correctly, we need to make sure the first number is further down in the stack, since it was inputted earlier than the last one. so the first number will be popped after the last one
  public void minus() {
    int num2 = stack.pop(); //declares variable, initializes it, and pops an item from the stack (3)
    push(stack.pop() - num2); //calls method, pops an item, and subtracts (3)
  }


  //multiplies two most recent items on the stack and pushes the result
  public void times() {
    push(stack.pop() * stack.pop()); //calls method, pops an item, multiplies, and pops again (4)
  }

  //checks the most recent item on the stack without popping it
  public int read() {
    return stack.peek(); //returns, and peeks on the stack (2)
  }

  //T(n) = 1n (push to the stack) + 6n - 1 (subtraction per each number) = 7n - 1 --> T(n) = O(n)
  //at least one operation is performed per input, but any number of items can be placed on the stack. the most complex operation is subtracting (6 time units), so the worst case would have all numbers inputted subtracted from each other. the number of math operators is 1 less than the number of numbers in the stack (n)
}
