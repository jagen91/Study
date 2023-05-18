public class Stack {
    
    // 속성
    int max;          // 배열의 최대값(길이)
    int SP;           // 스택포인터(SP)
    int[] stackArray; // 스택 배열

    // 기본 생성자
    public Stack() {
        max = 0;
        SP = 0;
        stackArray = null;
    }

    // 오버로딩 생성자
    public Stack(int max) {
        this.max = max;
        this.SP = -1;
        this.stackArray = new int[max];
    }


    /////////////////// METHOD ////////////////////////////////////////////////////////////////////

    // isFull: 스택배열이 가득 차있나?
    // true = 스택포인터가 배열크기(max)와 같거나 큰 인덱스인 경우이므로
    private boolean isFull() {
        return SP == max - 1;
    }


    // isEmpty: 스택배열이 비어 있나?
    // true = 스택포인터가 -1이면 데이터가 없는 상태이므로
    private boolean isEmpty() {
        return SP == -1;
    }


    // push: 데이터 넣기
    public boolean push(int num) {
        if (isFull() == false) {
            // 전달받은 num을 배열에 저장하고 스택포인터(SP) 증가
            stackArray[++SP] = num;
            return true;

        } else {            
            SP = max - 1;
            return false;
        }
    }


    // pop: 데이터 빼기
    public void pop() {
        if (isEmpty() == false) {
            stackArray[SP] = 0;
            SP--;

        } else {
            System.out.println("*** POP ERROR : 배열이 이미 비어 있습니다.");
        }
    }


    // peek: 정상(마지막)에 있는 데이터를 리턴

}
