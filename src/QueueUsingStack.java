import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void shiftStack(){
        if(s2.isEmpty()){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
            }
        }
    }
    public QueueUsingStack(){}

    public void push(int x){
        s1.push(x);
    }
    public int pop(){
        shiftStack();
        return s2.pop();
    }
    public int top(){
        shiftStack();
        return s2.pop();
    }
    public boolean empty(){
        return s1.isEmpty() && s2.isEmpty();
    }
    public static void main(String[] args) {
       String[] s1 = {"MyQueue", "push", "push", "peek", "pop", "empty"};
       int[] s2 = {0, 1, 2, 0, 0, 0};
       QueueUsingStack obj = new QueueUsingStack();
    }
}
