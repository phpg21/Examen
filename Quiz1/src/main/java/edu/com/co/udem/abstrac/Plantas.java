/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.com.co.udem.abstrac;

import edu.com.co.udem.interfaces.Reino;

/**
 *
 * @author b12s309
 */
public abstract class Plantas implements Reino {
    public String nombre;
    public int edad;
    public String tipo;
    public int vida;

    public Plantas(String nombre, int edad, String tipo, int vida) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
}

