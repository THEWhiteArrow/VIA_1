package BalancedParenthesisChecking;

import java.util.*;

public class parenthesis
{
  public boolean checkParentheses(ArrayList<Character> input) // create a function that will check
  // whether brackets are balanced in the array
  {
    Stack<Character> stack = new Stack<>(); // creating a stack = 2
    for (int i = 0; i < input.size(); i++) { // creating a for loop to go through the stack = 2n+2
      if (input.get(i)== '(' || input.get(i) == '[') // opening brackets - comparison will be done 5n times
      {
        stack.push(input.get(i)); // to push the opening brackets in the stack - stack methods are done constant = O(1)
      }
      else if (stack.isEmpty()) { // if the stack is empty it returns false, because there should be brackets. comparison will be done n times
        return false; //return = 1
      }
      else // n times
      {
       char check; // declaring variable = 1
        switch (input.get(i)) // the opening brackets. worst case is 8
        {
          case ')':  // when the program gets to this closing bracket it will search if the same
            // opening bracket is in the top of the stack
            // defining case = 1
            check = stack.pop(); // both opening and closing brackets are in the stack and matched,
            // so it removes them from the stack.
            // stack methods are working in constant time = O(1) + 1
            if (check == '[') // when the program gets to this opening bracket it will return false because
              // the brackets do not match. comparison will be done once per switch = 1
              return false; // return = 1
            break; // 1

          case ']': // when the program gets to this closing bracket it will search if the same
            // opening bracket is in the top of the stack
            // defining case = 1
            check = stack.pop(); // both opening and closing brackets are in the stack so
            // it removes them from the stack.
            // stack methods are working in constant time = O(1) + 1
            if (check == '(') // when the program gets to this opening bracket it will return false because
              // the brackets do not match. comparison will be done once per switch = 1
              return false; // return = 1
            break; // 1
        }
        }
      }
      return (stack.isEmpty()); // returns that stack is empty and all brackets are matched. return = 1
    // 2 + 2n+2 + 5n + n + n*(1+(1+1+1+2+1+1+1)) + 1 = 5 + 16n
    // Ignoring constants and coefficients we get O(n)
  }
}
