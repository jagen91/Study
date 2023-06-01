// 마이크로소프트가 배포합니다.
// 이 양식대로 만들어서 제출하세요.

// 1. 규약을 " 강제 "로 사용하게끔 한다.
// 2. 인터페이스는 " 규약 " 으로만 이루어져 있다.

interface Printer {

    public abstract boolean init();
    public abstract boolean printer(String doc);
    public abstract void stop();

}
