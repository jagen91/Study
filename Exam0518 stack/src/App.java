

public class App {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack(5);

        st.push(7);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.pop();
        st.pop();
        st.pop();
        st.pop();

        System.out.println(st.peek());


        


    }
}
