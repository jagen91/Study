import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueueExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        // queue.add(100);   //  100 >> queue에 추가
        // queue.offer(300); // 300 >> queue에 추가
        // System.out.println(queue.peek()); //첫번째 값을 출력


        // queue.poll();
        // System.out.println(queue);


        // queue2.add("Hello");
        // queue2.add("World");
        // System.out.println(queue2);


        // System.out.println(queue2);
        
        // queue2.poll(); // 삭제 remove
        // System.out.println(queue2);



        for(int i = 0; i < 10; i++)
        {
            queue2.add("data-"+i);
        }

        while(!queue2.isEmpty())
        {
        System.out.println(queue2.poll());
        }


/////////////////////////////////////////////////////////


        int max_size = 5;

        while(true)
        {
            System.out.println("입력해주세요.");
            String str = scan.nextLine();
            queue2.offer(str);
            // 사용자로부터 값을 입력받아 queue2에 추가


            if(queue2.size() > max_size) queue2.poll();
            // queue2의 사이즈가 max_size(5) 보다 커질 경우
            // queue2의 1번째 삭제

            LinkedList list = (LinkedList)queue2;
            int size = list.size();
            for(int i = 0; i < size; i++)
            {
                System.out.println(i + 1 + ". " + list.get(i));
            }
        }
    }
}
