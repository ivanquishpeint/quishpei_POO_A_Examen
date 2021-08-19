/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Aplicacion {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona("Ivan Quishpe","21");
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("0959048035");

        System.out.println("El clinte: " + p2.getNombre());
        System.out.println("De: " + p2.getEdad() + " Años de Edad");
        System.out.println("Con el numero de telefono: " + c2.getTelefono());
    }

}
