import java.util.Stack;

public class StackApp1 {
   static Stack<Integer> result= new Stack<>();
    public static Stack<Integer> mergeStack(Stack<Integer> input, Stack<Integer> input2){
        while (input.size() != 0) {
            result.push(input.peek());
            input.pop();
        }
        while(input2.size()!=0){
            result.push(input2.peek());
            input2.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(2);
        st.push(5);
        st.push(10);
        st.push(9);

        Stack<Integer> st2= new Stack<>();
        st2.push(6);
        st2.push(7);
        st2.push(11);
        st2.push(3);

        System.out.println(mergeStack(st,st2));
    }
}
