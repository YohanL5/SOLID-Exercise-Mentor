package SOLID;

import Interface.Figure;

public class OpenClosedPrincipeFigureCircle implements Figure {
    public double radio;

    public OpenClosedPrincipeFigureCircle() {
    }

    public OpenClosedPrincipeFigureCircle(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalculateArea() {
        return Math.PI*Math.pow(radio,2);
    }
}
