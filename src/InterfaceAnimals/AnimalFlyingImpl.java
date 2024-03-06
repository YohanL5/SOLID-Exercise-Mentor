package InterfaceAnimals;

public class AnimalFlyingImpl implements IAnimalImpl{
    @Override
    public IAnimal createAnimalMovement() {
        return new AnimalFlying();
    }
}
