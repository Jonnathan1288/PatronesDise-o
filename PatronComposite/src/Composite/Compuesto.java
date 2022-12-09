/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
class Compuesto extends Componente {

    private ArrayList<Componente> hijo = new ArrayList<Componente>();

    public Compuesto(String name) {
        super(name);
    }

    @Override
    public void Agregar(Componente componente) {
        hijo.add(componente);
    }

    @Override
    public void Eliminar(Componente componente) {
        hijo.remove(componente);
    }

    @Override
    public void Mostrar(int profundidad) {
        System.out.println(nombre + " nivel: " + profundidad);
        for (int i = 0; i < hijo.size(); i++) {
            hijo.get(i).Mostrar(profundidad + 1);
        }
    }
}
