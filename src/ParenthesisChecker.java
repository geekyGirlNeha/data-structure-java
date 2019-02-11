import java.io.*;
import java.util.*;

public class ParenthesisChecker {


    public static void isBalanced(String exp) {

        Stack<Character> stk = new Stack<>();
        boolean flag = true;


        if (exp.length() == 1) {
            System.out.println("Not balanced");
            return;
        }
        for (int i = 0; i < exp.length(); i++) {

            if (exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{') {
                stk.push(exp.charAt(i));
            } else {
                if (stk.empty()) {
                    flag = false;
                    break;
                }
                char top = stk.pop();

                if (i == exp.length() - 1 && !stk.empty()) {
                    flag = false;
                    break;
                }

                if (exp.charAt(i) != ']' && exp.charAt(i) != '}' && exp.charAt(i) != ')') {
                    flag = false;
                    break;
                }

                if (exp.charAt(i) == ']') {
                    if (top != '[') {
                        flag = false;
                        break;
                    }
                } else if (exp.charAt(i) == '}') {
                    if (top != '{') {
                        flag = false;
                        break;
                    }
                } else if (exp.charAt(i) == ')') {
                    if (top != '(') {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if (flag) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        isBalanced(exp);

    }
}
