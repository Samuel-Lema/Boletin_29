package main;

public class Velero extends Barco {
    
    private int mastiles;

    @Override public double calculoPrecio() {

        return (super.calculoModulo() + mastiles * 2) * super.getDias();
    }

    public Velero(int mastiles, String matricula, double eslora, int dias) {
        super(matricula, eslora, dias);
        this.mastiles=mastiles;
    }

    @Override public String toString() {
        return "Velero{ " + "mastiles: " + mastiles + " }";
    }
}
