/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author DELL
 */
class Hoja extends Componente {

    public Hoja(String nombre) {
        super(nombre);
    }

    public void Agregar(Componente c) {
        System.out.println("no se puede agregar la hoja");
    }

    public void Eliminar(Componente c) {
        System.out.println("no se puede quitar la hoja");
    }

    public void Mostrar(int depth) {
        System.out.println('-' + "" + nombre);
    }
}
