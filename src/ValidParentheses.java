import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
//    public boolean isValid(String s){
//        Stack<Character> stack = new Stack<>();
//        for(char c :s.toCharArray())
//        {
//            if(c=='(')
//            {
//                stack.push(')');
//            }
//            else if (c =='{'){
//                stack.push('}');
//            }
//            else if (c=='['){
//                stack.push(']');
//            }
//            else if(stack.isEmpty() || stack.pop()!=c){
//                return false;
//            }
//        }
//        return stack.isEmpty();
//    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int count =0;

        for(int i=0;i<n;i++)
        {
            int sum =0;
            for(int j=0;j<n;j++){
                sum += arr[j];
                if(sum <0){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }

}
