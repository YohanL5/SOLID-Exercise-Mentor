package SOLID;

import Interface.AnimalTerrestrial;

public class InterfaceSegregationPrincipleAnimal implements AnimalTerrestrial {
    @Override
    public String Run() {
        return "Animal is run";
    }
}
