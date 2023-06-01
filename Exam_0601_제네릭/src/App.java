public class App {
    public static void main(String[] args) throws Exception {




        Box<Integer> iBox = new Box<>();
        iBox.set(100);
        System.out.println(iBox.getIntValue());
        
        Box<Double> dBox = new Box<>();
        dBox.set(30.3);
        System.out.println(dBox.getIntValue());

///////////////////////////////////////////////////////////////////
        // Dbox<Box<Apple>, Box<Banana>> dbox = new Dbox<>();

        // dbox.set(new Box<Apple>(new Apple()), 
        //         new Box<Banana>(new Banana()));


        // Box<Apple> aBox = new Box<>();
        // Box<Banana> bBox = new Box<>();

        // aBox.set(new Apple());
        // bBox.set(new Banana());

        // dbox.set(aBox, bBox);

        // System.out.println(dbox);


// ///////////////////////////////////////////////////////////
//         // <Apple> = type aguments, aguments parameters
//         Box<Apple> aBox = new Box<Apple>();
//         Box<Banana> bBox = new Box<Banana>();

//         // 박스에 집어 넣는다.
//         aBox.set(new Apple());
//         bBox.set(new Banana());

//         // 단점1 : 꺼내는 메소드에서 강제 형변환 ==> 현변환의 위험성을 내포, 즉 위험해도 컴파일 잘됨.
//         // 단점2 : Object형은 그 어떤 객체도 다 참조가능 ==> 예외 발생 (ClassCastException, NullPointerException)
        
//         // 박스에서 꺼낸다.
//         Apple apple = aBox.get();
//         Banana banana = bBox.get();
// //////////////////////////////////////////////////////////////

    }
}
