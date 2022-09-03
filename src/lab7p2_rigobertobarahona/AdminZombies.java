package lab7p2_rigobertobarahona;

package lab7p2_rigobertobarahona;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminZombies {
    ArrayList<Zombies> zombies = new ArrayList();
    private File archivoZ = null;

    public ArrayList<Zombies> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombies> zombies) {
        this.zombies = zombies;
    }

    public File getArchivoZ() {
        return archivoZ;
    }

    public void setArchivoZ(File archivoZ) {
        this.archivoZ = archivoZ;
    }
    public AdminZombies(String path) {
        archivoZ = new File(path);
    }
    public void escribirArchivoZ() throws IOException {
        FileWriter fw = null;
        File archivoP = null;
        BufferedWriter bw = null;
        String temp = "";
        for (int i = 0; i < zombies.size() ; i++){
            temp += zombies.get(i).toString() + "\n";
        }
        try {
            archivoP = new File("./Zombies.txt");
            fw = new FileWriter(archivoP, false);
            bw = new BufferedWriter(fw);
            bw.write(temp);
            bw.newLine();
            
            bw.flush();
        } catch (Exception ex) {
            System.out.println("Hubo un error");
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo() {
        Scanner sc = null;
        zombies = new ArrayList();
        if (archivoZ.exists()) {
            try {
                sc = new Scanner(archivoZ);
                sc.useDelimiter(";");
                
                while (sc.hasNext() ) {
                    zombies.add(new Zombies(sc.next(), sc.nextInt(), sc.nextInt() ) );
                    sc.nextLine();
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
