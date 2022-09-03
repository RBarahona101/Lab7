package lab7p2_rigobertobarahona;

public class Defensa extends Plantas {
    int altura;
    int dureza;
    int peso;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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

    public Defensa(int altura, int dureza, int peso) {
        this.altura = altura;
        this.dureza = dureza;
        this.peso = peso;
    }

    public Defensa(String nombre, int ataque, int vida, int altura, int dureza, int peso) {
        super(nombre, ataque, vida);
        this.altura = altura;
        this.dureza = dureza;
        this.peso = peso;
    }

    public Defensa(String nombre, int ataque, int vida, String rango, int altura, int dureza, int peso) {
        super(nombre, ataque, vida, rango);
        this.altura = altura;
        this.dureza = dureza;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre + "," + ataque + "," + vida + "," + rango + "," + altura + "," + dureza + "," + peso;
    }
    
}
