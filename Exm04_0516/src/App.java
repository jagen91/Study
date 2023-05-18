public class App {
    public static void main(String[] args) throws Exception {

        int[] data = new int[7];

        int rear = 0;

        while(true)
        {       // 1 % 7 = 1 앞에가 작으면 그냥 앞에 숫자가 나옴
                // %연산의  특징은 반복이다.
                // n + 1 % max = 0부터 max-1까지 반복
            rear = (rear + 1) % 100000;
            // 0~99999까지 반복
            System.out.println(rear);
        }
    }
}
