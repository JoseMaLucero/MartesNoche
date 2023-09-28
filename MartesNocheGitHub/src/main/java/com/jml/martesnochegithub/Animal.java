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
    protected Animal() {
        
    }
    
    protected Animal (String nombre) {
        this.nombre = nombre;
    }
        
    @Override 
    public String toString() {
        return "Hello i am a "+ this.getClass().getSimpleName()+" y me llamo "+nombre;
    }
}
