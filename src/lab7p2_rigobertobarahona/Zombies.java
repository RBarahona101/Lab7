package lab7p2_rigobertobarahona;

import java.util.ArrayList;

public class Zombies {
    String nombre;
    int ataque;
    int vida;

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

    public Zombies() {
    }

    public Zombies(String nombre, int ataque, int vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre + "," + ataque + "," + vida;
    }
    
    
}
