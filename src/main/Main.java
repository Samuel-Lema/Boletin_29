package main;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Barco> listaBarcos = new ArrayList();
    
    public static void main(String[] args) {
        
        Barco barco1 = new Velero(2, "123", 12.5, 4);
        listaBarcos.add(barco1);
        Barco barco2 = new Deportivas(15.5, "234", 6, 4);
        listaBarcos.add(barco2);
        
        Factura f = new Factura();
        
        // Muestra datos de los barcos en el ArrayList, tambien puede mostrar un barco especifico debido a una sobrecarga
        
        f.calculo(listaBarcos);
    }
    
}
