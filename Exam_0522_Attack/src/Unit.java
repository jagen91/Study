// 추상 메소드를 1개라도 포함하면
// 클래스가 객체화 할 수 없다.
// 즉 객체화 하지 못하고 상속으로만 의미가 있는 클래스를 " 추상 클래스" 라고 한다.
public abstract class Unit {

    protected int attackSpeed;
    
    // 실행할려고 만든함수가 아님
    // 규약의 용도로 만든 함수 ==>  추상메소드. (abstract method)

    public abstract void attack();

    

}
