public class App {
    public static void main(String[] args) throws Exception {


        Box<Apple> aBox = new Box<>(new Apple());


        aBox.eatPlants();
        aBox.makeEnergy();


        Box<Orange> oBox = new Box<>(new Orange());

        oBox.eatPlants();
        oBox.makeEnergy();
    }
}
