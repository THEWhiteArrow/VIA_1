package BalancedParenthesisChecking;

import java.util.*;

public class parenthesis
{
  public boolean checkParentheses(ArrayList<Character> input)
  {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < input.size(); i++) {
      if (input.get(i)== '(' || input.get(i) == '[')
      {
        stack.push(input.get(i));
      }
      else if (stack.isEmpty()) {
        return false;
      }
      else
      {
       char check;
        switch (input.get(i))
        {
          case ')':
            check = stack.pop();
            if (check == '[')
              return false;
            break;

          case ']':
            check = stack.pop();
            if (check == '(')
              return false;
            break;
        }
        }
      }
    return (stack.isEmpty());
  }
}
