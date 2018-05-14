package main;

public class Deportivas extends Barco {
    
    private double cv;

    @Override public double calculoPrecio() {
       return (super.calculoModulo() + cv * 3) * super.getDias();
    }

    public Deportivas(double cv, String matricula, double eslora, int dias) {
        super(matricula, eslora, dias);
        this.cv=cv;
    }

    @Override public String toString() {
        return "Deportivas{ " + "cv:" + cv + " }";
    }
}
