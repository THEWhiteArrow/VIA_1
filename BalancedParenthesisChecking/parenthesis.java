package BalancedParenthesisChecking;

import java.util.*;

public class parenthesis
{
  public boolean checkParentheses(ArrayList<Character> input) // create a function that will check
  // whether brackets are balanced in the array
  {
    Stack<Character> stack = new Stack<>(); // creating a stack
    for (int i = 0; i < input.size(); i++) { // creating a for loop to go through the stack
      if (input.get(i)== '(' || input.get(i) == '[') // opening brackets
      {
        stack.push(input.get(i)); // to push the opening brackets in the stack
      }
      else if (stack.isEmpty()) { // if the stack is empty it returns false, because there should
        // be brackets
        return false;
      }
      else
      {
       char check;
        switch (input.get(i)) // the opening brackets
        {
          case ')':  // when the program gets to this closing bracket it will search if the same
            // opening bracket is in the top of the stack

            check = stack.pop(); // both opening and closing brackets are in the stack and matched,
            // so it removes them from the stack
            if (check == '[') // when the program gets to this opening bracket it will return false because
              // the brackets do not match
              return false;
            break;

          case ']': // when the program gets to this closing bracket it will search if the same
            // opening bracket is in the top of the stack
            check = stack.pop(); // both opening and closing brackets are in the stack so
            // it removes them from the stack
            if (check == '(') // when the program gets to this opening bracket it will return false because
              // the brackets do not match
              return false;
            break;
        }
        }
      }
    return (stack.isEmpty()); // returns that stack is empty and all brackets are matched
  }
}
