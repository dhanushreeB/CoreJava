import java.util.Stack;

public class Collection4 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}
