package lab7p2_rigobertobarahona;

public class Explosiva extends Plantas{
    int magnitud;

    public Explosiva() {
    }

    public int getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(int magnitud) {
        this.magnitud = magnitud;
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

    public Explosiva(int magnitud) {
        this.magnitud = magnitud;
    }

    public Explosiva(String nombre, int ataque, int vida, int magnitud) {
        super(nombre, ataque, vida);
        this.magnitud = magnitud;
    }

    public Explosiva(String nombre, int ataque, int vida, String rango, int magnitud) {
        super(nombre, ataque, vida, rango);
        this.magnitud = magnitud;
    }
    
    
}
