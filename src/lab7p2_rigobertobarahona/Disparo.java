package lab7p2_rigobertobarahona;


public class Disparo extends Plantas{
    String proyectile;
    String color;

    public Disparo() {
    }

    public String getProyectile() {
        return proyectile;
    }

    public void setProyectile(String proyectile) {
        this.proyectile = proyectile;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public Disparo(String proyectile, String color) {
        this.proyectile = proyectile;
        this.color = color;
    }

    public Disparo(String nombre, int ataque, int vida, String proyectile, String color) {
        super(nombre, ataque, vida);
        this.proyectile = proyectile;
        this.color = color;
    }
    
    
}
