package org.example;

import java.util.ArrayList;

/**
 * Clase Concesionario
 * Clase que nos almacenara la entrada y salida de autos en el concesionario.
 * @author SergioRodriguez
 * @version 1.0
 */
public class Concesionario {


    private ArrayList<Auto> autos;

    /**
     * Concesionario
     * Objeto que nos añade a una ArrayList los autos.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Agregar auto
     * Metodo que nos agregara los autos nuevos a la array Auto
     * @param auto objeto creado en la clase auto
     */

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Listar autos
     * Metodo que no devolvera el array de los autos
     * @return autos
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Imprimir autos
     * Nos devolvera uno a uno el contenido de la array autos
     *
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}