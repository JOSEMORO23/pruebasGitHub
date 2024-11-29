/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

import java.util.ArrayList;
import java.util.List;


public class Carpeta implements ComponenteArchivo {
    private String nombre;
    private List<ComponenteArchivo> elementos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarElemento(ComponenteArchivo elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(ComponenteArchivo elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Carpeta: " + nombre);
        for (ComponenteArchivo elemento : elementos) {
            elemento.mostrarDetalles();
        }
    }
}