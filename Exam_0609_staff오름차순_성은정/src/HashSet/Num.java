package HashSet;
public class Num {
    
    private int num;

    public Num(int n)
    {
        num = n;
    }

    @Override
    public String toString()
    {
        return String.valueOf(num);
    }


    // 원래는 instanceof를 사용함
    @Override
    public boolean equals(Object obj)
    {
        Num o = (Num)obj;

        if(this.num == o.num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // 이 함수는 hash값을 return
    // hashCode값으로 분류 하는 코드임, 편하게 하는 법 % 연산자
    @Override
    public int hashCode()
    {
        return num % 5;
    }
    // hash알고리즘 중 % 알고리즘이 제일 쉬움
    // 어떤 값이 들어오든 간에 0 ~ 4 사이의 값이 나옴
    // 나머지 값이 다르면, 무조건 다른 수임
    // 만약 나눴는데 나머지 값이 같다면, 그 두 수는 같을 수도 있고 다를 수도 있음

    // % n, n을 너무 크게 하면 메모리를 어마어마하게 잡음
    // 설계할 때, 들어올 데이터량과 이 코드의 상관관계를 생각하자
    // 만약 데이터가 100,000개 들어오는데 num%100,000을 한다면?
    // 속도는 빠르겠지만 메모리를 많이 잡아 먹음

}
