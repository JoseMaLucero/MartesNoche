/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jml.martesnochegithub;

/**
 *
 * @author Ing. J.M.Lucero
 */
public abstract class Animal {
    protected String nombre;
    protected Raza raza;
    protected Animal() {
        
    }
protected Animal(String nombre) {
    this.nombre= nombre;
        
    }
    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    // Lucas tirate un constructor, un getter y setter para la raza
    // que tiene que ser enumerable Raza.[Collie, entre otras]
    // Juan se encarga de hacer el propio enumerable
    protected Animal (String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    //¿Y el constructor de nombre? ¿Eh?

    @Override 
    public String toString() {
        return "Hello i am a "+ this.getClass().getSimpleName()+" y me llamo "+nombre;
    }
}
