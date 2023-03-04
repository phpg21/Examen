/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.com.co.udem.especies;

import edu.com.co.udem.abstrac.Plantas;

/**
 *
 * @author b12s309
 */
public class Naranja extends Plantas {
    private String nombre;
    private int edad;
    private String tipo;
    private int vida;

    public Naranja(String nombre, int edad, String tipo, int vida ) {
        super(nombre, edad, tipo, vida);
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
        public String toString(){
            String auxiliar = "{\"Cebolla\":\n"
                    +"   \"Nombre\":\n"
                    +"   \""+super.getNombre()+"\",:\n"
                    +"   \"Edad\":\n"
                    +"   \""+super.getEdad()+"\",:\n"
                    +"   \"Tipo\":\n"
                    +"   \""+super.getTipo()+"\",:\n"
                    +"   \"Promedio de vida\":\n"
                    +"   \""+super.getVida()+"\",:\n"
                    +"}\n"
                    +"}";
            return auxiliar;
        }
    @Override
    public String tipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int vida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
