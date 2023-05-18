public class App {
    public static void main(String[] args) throws Exception {
        // Terran[] tArray = new Terran[]
        // {
        //     new Terran(),new Terran(),new Terran(),new Terran(),new Terran(),
        // };

        // zerg [] zArray = new zerg[]
        // {
        //     new zerg(),new zerg(),new zerg()
        // };

        // Protoss p1 = new Protoss();

        // for (int i = 0; i < 5; i++) {
        //     tArray[i].Attack();
        // }

        // for (int i = 0; i < 3; i++) {
        //     zArray[i].Attack();
        // }


        // Unit 을 부모 클래스로 지정하고 참조값으로 묶을수 있다 
        Unit[] units = new Unit[]{
            new zerg(),new zerg(),new zerg(),new zerg(),
            new Protoss(),new Protoss(),new Protoss(),new Protoss(),new Protoss(),
            new Terran(),new Terran(),new Terran()
        };


        Unit u1 = new zerg();
        // 재정의( Override ) 가 되어있을경우 Unit 의 Attack 이 아니고 zerg의 Attack 이 호출된다.
        u1.Attack();

        for (int i = 0; i < units.length; i++) {
            units[i].Attack();
        }
    }
}
