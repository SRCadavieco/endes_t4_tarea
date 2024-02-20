package org.example;
import java.util.ArrayList;

/**
 * Clase auto
 * Esta clase nos almacenara los datos de los vehiculos
 * @author SergioRodriguez
 * @version 1.0
 */

public class Auto {


    private String marca;


    private String modelo;

    /**
     * Objeto auto
     * Objeto que nos almacenara las variables de marca y y modelo
     * @param marca Variable que almacena la marca del vehiculo
     * @param modelo Variable que almacena la marca del vehiculo
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Get marca
     * Nos retornara la marca del vehiculo
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * setMarca
     * @param marca actualizara la marca del vehiculo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * getModelo
     * Nos retornara el modelo del vehiculo
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * setModelo
     * @param modelo nos actualizara el modelo del vehiculo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    /**
     * ToString
     * Nos devolvera un string con los datos de la marca y modelo del auto
     * @return marca y modelo
     */
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}