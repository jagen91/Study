public class Box<T extends Plants & Eatable> {

    private T plants;

    public Box()
    {

    }

    public Box(T plants)
    {
        this.plants = plants;
    }

    public void set (T plants)
    {
        this.plants = plants;
    }

    public void eatPlants()
    {
        // 구현된 인터페이스를 호출.
        plants.eat();
    }

    public void makeEnergy()
    {
        // 부모 클래스의 메소드를 호출.
        System.out.printf("make energy : %d\n", plants.getEnergy());
    }
}
