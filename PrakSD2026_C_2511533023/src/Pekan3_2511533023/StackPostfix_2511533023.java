package Pekan3_2511533023;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533023 {
    public static int postfixEvaluate_3023(String expression) {
        Stack<Integer> s = new Stack<Integer>();
        try (Scanner input = new Scanner(expression)) {
			while (input.hasNext()) {
			    if (input.hasNextInt()) {             // an operand (integer)
			        s.push(input.nextInt());
			    } else {                             // an operator
			        String operator = input.next();
			        int operand2 = s.pop();
			        int operand1 = s.pop();
			        
			        if (operator.equals("+")) {
			            s.push(operand1 + operand2);
			        } else if (operator.equals("-")) {
			            s.push(operand1 - operand2);
			        } else if (operator.equals("*")) {
			            s.push(operand1 * operand2);
			        } else {
			            s.push(operand1 / operand2);
			        }
			    }
			}
		}
        
        return s.pop();
    }

    public static void main(String[] args) {
        System.out.println("hasil postfix = " + postfixEvaluate_3023("5 2 4 * + 7 -"));
    }
}
