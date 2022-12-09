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
public abstract class Componente {

    protected String nombre;

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    abstract public void Agregar(Componente c);

    abstract public void Eliminar(Componente c);

    abstract public void Mostrar(int profundidad);
}
