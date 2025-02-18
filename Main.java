//
//      Programming Assignment 3
//          Krittameth Tansuwan 672115002
//      Date: 18/02/2025
//

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> expressionList = new ArrayList<>();
        int lineCount = 0;
        int validCount = 0;
        int invalidCount = 0;

        try {
            Scanner input = new Scanner(new File(args[args.length - 1]));
            // Read the expresssions and Store in ArrayList
            while (input.hasNextLine()) {
                String line = input.nextLine();
                expressionList.add(line.replace(" ", ""));
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Invalid filetype or file name.");
            System.exit(1);
        }

        // Check each of character is a number or an operator
        for (int i = 0; i < expressionList.size(); i++) {
            StackList sl = new StackList();
            StringBuilder strings = new StringBuilder("");
            boolean isValid = true;
            lineCount++;
            validCount++;
            System.out.println("Expression " + lineCount + ":");
            for (int j = 0; j < expressionList.get(i).length(); j++) {
                char character = expressionList.get(i).charAt(j);

                if (Character.isDigit(character)) {
                    strings.append(character);
                } else if (character == ')') {
                    while (!sl.isEmpty() && sl.peek() != '(') {
                        strings.append(sl.pop());
                    }
                    if (!sl.isEmpty()) {
                        sl.pop();
                    }
                } else if (character == '(') {
                    sl.push(character);
                } else if (isOperator(character)) {
                    while (!sl.isEmpty() && sl.peek() != '(' && getPrecedence(sl.peek()) >= getPrecedence(character)) {
                        strings.append(sl.pop());
                    }
                    sl.push(character);
                } else if (isBoolean(character) || isWrongFormat(expressionList.get(i))) {
                    isValid = false;
                }
            }
            if (!isValid) {
                invalidCount++;
            }
            // Pop all remaining operator from the stack
            if (!sl.isEmpty()) {
                strings.append(sl.pop());
            }
            System.out.println("Infix expression: " + expressionList.get(i));
            // Check if the last digit has arithmetic operator
            if (isOperator(strings.charAt(strings.length() - 1)) && !strings.isEmpty() && isValid) {
                System.out.println("Valid expression.");
                System.out.println("Postfix expression: " + strings);
            } else {
                System.out.println("Invalid expression.");
            }
            System.out.println();
        }
        validCount -= invalidCount;
        System.out.println("There are " + lineCount + " expressions in total");
        System.out.println("Valid expression: " + validCount);
        System.out.println("Invalid expression: " + invalidCount);
    }

    // Check the character if it is the operator
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Check the character if it is the boolean operator.
    public static boolean isBoolean(char c) {
        return c == '&' || c == '|' || c == '<' || c == '>' || c == '=' || c == '!';
    }

    // Check if the infix expression has concatinated operator
    public static boolean isWrongFormat(String str) {
        return str.matches(".*(\\+\\+|--|\\*\\*|//|%%|\\^\\^|&&|\\|\\||<<|>>).*");
    }

    // Check the precedence of math operator
    public static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}
