package lab7p2_rigobertobarahona;

import java.util.ArrayList;
public class Clasico extends Zombies{
    int anos;
    ArrayList <Bandera> bandera;

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public ArrayList<Bandera> getBandera() {
        return bandera;
    }

    public void setBandera(ArrayList<Bandera> bandera) {
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

    public Clasico(String nombre, int ataque, int vida, int anos, ArrayList<Bandera> bandera) {
        super(nombre, ataque, vida);
        this.anos = anos;
        this.bandera = bandera;
    }
    
}
