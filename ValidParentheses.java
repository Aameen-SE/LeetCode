import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parentheses : ");
        String input = sc.nextLine();
        System.out.println(isValidParentheses(input));
    }
    public static boolean isValidParentheses(String str){

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if((c=='(')||(c=='[')||(c=='{')){
                stack.push(c);
            }else {
                if(stack.isEmpty()) return  false;

                char top = stack.pop();
                if((c==')'&&top!='(')||(c==']'&&top!='[')||(c=='}'&&top!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }




}
