import java.util.HashMap;
import java.util.Set;

import java.util.*;

public class App {
    public static void mapTest()
    {
////////////////////////////////////////////////////////////////
        // // 만들기
        // HashMap<Integer, String> map = new HashMap<>();

        // // 집어넣기
        // map.put(1, "정성훈");
        // map.put(2, "이지우");
        // map.put(3, "김동욱");
        // map.put(4, "박지은");

        // // 꺼내기
        // System.out.println(map.get(3));
        // System.out.println(map.get(4));

        // // 지우기
        // map.remove(1);
        // System.out.println(map.get(1));

////////////////////////////////////////////////////////////////

// ////////////////////////////////////////////////////////////////
//         HashMap<String, String> map = new HashMap<>();

//         map.put("돼지","꿀꿀");
//         map.put("강아지","멍멍");
//         map.put("고양이","야옹");

//         Set<String> keySet = map.keySet();

//         for (String key : keySet)
//         {
//             System.out.println(key);
//             System.out.println(map.get(key));
//         }
// ////////////////////////////////////////////////////////////////
    }
    public static void main(String[] args) throws Exception {
        // 번호(int), 이름(String) 으로 구성된 key - value가 있음
        HashMap<Integer, String> map = new HashMap<>();

        // 이를 map자료구조에 5개 넣어주시고
        
        map.put(1, "호식이");
        map.put(2, "민식이");
        map.put(3, "영식이");
        map.put(4, "창식이");
        map.put(5, "춘식이");

        // 이를 iterator로 순회하는 코드를 작성해보세요.

        Set<Integer> KeySet = map.keySet();

        Iterator<Integer> key = KeySet.iterator();


        while (key.hasNext())
        {
            System.out.println(map.get(key.next()));
        }
    }
}
