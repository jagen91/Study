// 1. 강제성이 있는 추상 자료구조
// 2. 규약만 존재.
// 3. 객체화 할수 없음.
// 4. 상속메카니즘을 사용 (내부적으로 상속구조.)
// 5. 규약은 (메소드) public 이 기본.


public interface Printerable {
    int func(String str);   // <- public int func(String str); 인터페이스는 디폴트 값이 public 임.
}
