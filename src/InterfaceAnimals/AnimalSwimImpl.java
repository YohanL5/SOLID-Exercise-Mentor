package InterfaceAnimals;

public class AnimalSwimImpl implements IAnimalImpl{
    @Override
    public IAnimal createAnimalMovement() {
        return new AnimalSwim();
    }
}
