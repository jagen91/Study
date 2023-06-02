public class BoxManager {
    // 제네릭 >>> 특정한 타입으로 바뀌는 메카니즘.
    // 와일드 카드 >>> 특정한 타입들 으로 바뀌는 메카니즘.

    // Box<> =<>여기안에 들어가는 내용물은 상관이없음
    // Box<object> 랑 Box<Integer> 는 아무상관이없다 object가 다 받을수있지만
    // 박스와 박스가 상속관계가 아니라면 내용물이 object라도 Integer를 받을수없다
    //                                 ↓object가 들어가도 에러남
    // public static void printBox(Box<?> box)
    // {
    //     System.out.println(box);

    // }

    public static void printBox(Box<? super Integer> box)
    {
        
    }
}