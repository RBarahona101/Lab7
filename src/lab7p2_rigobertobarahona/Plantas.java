package lab7p2_rigobertobarahona;

public class Plantas {
    String nombre;
    int ataque;
    int vida;
    String rango;

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

    public Plantas() {
    }

    public Plantas(String nombre, int ataque, int vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public Plantas(String nombre, int ataque, int vida, String rango) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return nombre + "," + ataque + "," + vida + "," + rango;
    }
    
}
