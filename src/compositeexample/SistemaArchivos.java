/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

public class SistemaArchivos {
    public static void main(String[] args) {
        // Crear la carpeta raíz
        Carpeta raiz = new Carpeta("Raíz");

        // Crear archivos
        Archivo archivo1 = new Archivo("Archivo1.txt");
        Archivo archivo2 = new Archivo("Archivo2.txt");

        // Crear una subcarpeta y añadir un archivo dentro
        Carpeta subCarpeta = new Carpeta("Subcarpeta");
        Archivo archivo3 = new Archivo("Archivo3.txt");

        // Agregar archivos y subcarpetas a la carpeta raíz
        raiz.agregarElemento(archivo1);
        raiz.agregarElemento(archivo2);
        raiz.agregarElemento(subCarpeta);

        // Agregar archivo a la subcarpeta
        subCarpeta.agregarElemento(archivo3);

        // Mostrar detalles de la estructura
        raiz.mostrarDetalles();
    }
}

