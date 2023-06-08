import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class App {
    public static void main(String[] args) throws Exception {
        int[] data = {10, 20, 100, 54, 34, 0};

        List<Integer> list = new ArrayList<>();

        // 리스트에 추가
        for(int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
        }

        // // 리스트를 출력
        // for (Integer ar : list)
        // {
        //     System.out.println(ar);
        // }

        // 이터레이터
        // 1. 반복자를 만든다.
        // 반복자는 해당 자료구조에 uteratir() 메소드를 호출하여 얻는다.
        Iterator<Integer> iter = list.iterator();

        // 2.반복자를 이용해서 데이터를 가지고온다.
        // 처음포인터는 -1이다. hasNext = 다음이 있니? 있으니까 프린트
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        System.out.println("--------------------------------");
        
        // iterator는 재활용이 안되며. 뒤로갈수 없다.
        // 다시 만들어야됨
        iter = list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }


        // List<String> list = new LinkedList<>();
        // ArrayList<String> list = new ArrayList<>();
        // LinkedList<String> list = new LinkedList<>();


        // list.add("김동욱");
        // list.add("박지은");
        // list.add("박연수");

        // for (int i = 0; i < list.size(); i++)
        // {
        //     System.out.println(list.get(i));
        // }

        // for (String name : list)
        // {
        //     System.out.println(name);
        // }

        // list.remove(0);

    }
}
