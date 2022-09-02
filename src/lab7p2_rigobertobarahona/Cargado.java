package lab7p2_rigobertobarahona;

import java.util.ArrayList;

public class Cargado extends Zombies {
    int tamano;
    int edad;
    int enojo;
    ArrayList <Victima> victimas;

    public Cargado() {
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnojo() {
        return enojo;
    }

    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }

    public ArrayList<Victima> getVictimas() {
        return victimas;
    }

    public void setVictimas(ArrayList<Victima> victimas) {
        this.victimas = victimas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Cargado(String nombre, int ataque, int vida, int tamano, int edad, int enojo, ArrayList<Victima> victimas) {
        super(nombre, ataque, vida);
        this.tamano = tamano;
        this.edad = edad;
        this.enojo = enojo;
        this.victimas = victimas;
    }
    
}
