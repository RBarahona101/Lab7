package lab7p2_rigobertobarahona;

import java.util.ArrayList;
public class Clasico extends Zombies{
    int anos;
    Bandera bandera;

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public Bandera getBandera() {
        return bandera;
    }

    public void setBandera(Bandera bandera) {
        this.bandera = bandera;
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

    public Clasico() {
    }

    public Clasico(String nombre, int ataque, int vida, int anos, Bandera bandera) {
        super(nombre, ataque, vida);
        this.anos = anos;
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return nombre + "," + ataque + "," + vida + "," + anos + "," + bandera;
    }
    
}
