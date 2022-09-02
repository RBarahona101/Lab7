
package lab7p2_rigobertobarahona;


public class Victima {
    private String name;

    public Victima() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Victima(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
