package InterfaceAnimals;

public class AnimalSwim implements IAnimal{
    @Override
    public void Move() {
        System.out.println( "The Animal is Swimming");
    }
}
