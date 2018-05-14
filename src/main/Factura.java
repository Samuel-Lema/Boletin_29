package main;

import java.util.ArrayList;

public class Factura {
    
    public void calculo(ArrayList<Barco> listaBarcos) {

        for(Barco b: listaBarcos)
        System.out.println("Precio Total: " + b.calculoPrecio() + ", Matricula: " + b.getMatricula() + ", Días: " + b.getDias());
    }
    
    public void calculo(Barco b) {

        System.out.println("Precio Total: " + b.calculoPrecio() + ", Matricula: " + b.getMatricula() + ", Días: " + b.getDias());
    }
}
