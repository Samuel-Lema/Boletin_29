package main;

public class Yate extends Barco {
    
    private double cv;
    private int nCamarotes;

    @Override public double calculoPrecio() {
        return (super.calculoModulo() + cv * 3 + nCamarotes * 4) * super.getDias();
    }

    public Yate(double cv, int nCamarotes, String matricula, double eslora, int dias) {
        super(matricula, eslora, dias);
        this.cv=cv;
        this.nCamarotes=nCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{ " + " cv: " + cv + ", nCamarotes: " + nCamarotes + " }";
    }
}
