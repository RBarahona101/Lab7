package lab7p2_rigobertobarahona;

public class Bandera {
    String color;
    String direccion;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Bandera() {
    }

    public Bandera(String color, String direccion) {
        this.color = color;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "[" + color + "," + direccion + "]";
    }
    
}
