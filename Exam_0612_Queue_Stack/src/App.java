import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {

    public static void testQueue()
    {
        Queue<String> queue = new LinkedList<>();

        queue.add("이순신");
        queue.add("안중근");
        queue.add("전봉길");

        // peek : 다음에 뭐가 나올지 그냥 확인
        System.out.println("다음 데이터 : " + queue.element());
        System.out.println("pop  데이터 : " + queue.remove());

        System.out.println("다음 데이터 : " + queue.element());
        System.out.println("pop  데이터 : " + queue.remove());

        System.out.println("다음 데이터 : " + queue.element());
        System.out.println("pop  데이터 : " + queue.remove());


        // poll(), peek() 는 null을 리턴하지만 element(), remove(는 예외처리
        System.out.println("다음 데이터 : " + queue.peek());
        System.out.println("pop  데이터 : " + queue.poll());


    }
    public static void main(String[] args) throws Exception {

///////////////////////////////////////////////////////////////////////////
        // 임의의 String 4개를 stack에 집어넣고 빼는 코드를 만들어보세요.

        // // 1. 스택을 만든다.
        // Stack<String> stack = new Stack<>();
        // // 2. push
        // stack.push("둘리");
        // stack.push("또치");
        // stack.push("마이콜");
        // stack.push("고길동");

        // System.out.println("맨 위 데이터 : " + stack.peek());
        // // 3. pop

        // stack.pop();

        // System.out.println("맨 위 데이터 : " + stack.peek());

        // for (int i = 0; i < stack.size(); i++)
        // {   // 스택의 전체 출력
        //     System.out.println(stack.toString());
        // }

///////////////////////////////////////////////////////////////////////////

        // 1. 스택을 만든다.
        Deque<String> deque = new LinkedList<>();
        // 2. push
        deque.push("둘리");
        deque.push("또치");
        deque.push("마이콜");
        deque.push("고길동");

        System.out.println("첫번째 데이터 : " + deque.peek());
        // 3. pop

        deque.pop();

        System.out.println("첫번째 데이터 : " + deque.peek());

        for (int i = 0; i < deque.size(); i++)
        {   // 스택의 전체 출력
            System.out.println(deque.toString());
        }



    }
}
