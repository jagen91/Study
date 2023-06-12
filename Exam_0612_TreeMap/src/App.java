import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        // TreeMap<Integer, String> tMap = new TreeMap<>();     정렬
        HashMap<Integer, String> tMap = new HashMap<>();    //  랜덤

        tMap.put(12, "정성훈");
        tMap.put(4, "이지우");
        tMap.put(432, "김재운");
        tMap.put(85, "민동기");
        tMap.put(32, "정재근");
        tMap.put(3, "박수현");
        tMap.put(55, "최이서");
        tMap.put(61, "성유림");

        Set<Integer> kSet = tMap.keySet();

        Iterator<Integer> iter = kSet.iterator();

        int k;
        while(iter.hasNext())
        {
            k = iter.next();
            System.out.printf("%d %s \n", k, tMap.get(k));
        }







        
    }
}
