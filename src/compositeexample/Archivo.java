/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

/**
 *
 * @author USUARIO
 */
public class Archivo implements ComponenteArchivo {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Archivo: " + nombre);
    }
}
