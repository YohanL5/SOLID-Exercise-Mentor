package InterfaceAnimals;

public class AnimalLandImpl implements IAnimalImpl{
    @Override
    public IAnimal createAnimalMovement() {
        return new AnimalLand();
    }
}
