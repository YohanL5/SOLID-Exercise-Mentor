package SOLID;

import Interface.Figure;

public class LiskovSubstitutionPrincipleRectangle implements Figure {
    public double Height;
    public double base;

    public LiskovSubstitutionPrincipleRectangle(double height, double base) {
        Height = height;
        this.base = base;
    }


    @Override
    public double CalculateArea() {
        return Height*base;
    }
}
