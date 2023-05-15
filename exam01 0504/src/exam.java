public class exam {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 100; i++) 
        {
            if(i % 3 == 0)
            num += i;

            else continue;
            System.out.println("num =" + num);
        }
    }
}
