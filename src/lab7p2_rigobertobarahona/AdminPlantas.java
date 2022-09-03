package lab7p2_rigobertobarahona;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminPlantas {
    
    ArrayList<Plantas> plantas = new ArrayList();
    private File archivoP = null;

    public ArrayList<Plantas> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Plantas> plantas) {
        this.plantas = plantas;
    }

    public File getArchivoP() {
        return archivoP;
    }

    public void setArchivoP(File archivoP) {
        this.archivoP = archivoP;
    }
    public AdminPlantas(String path) {
        archivoP = new File(path);
    }
    public void escribirArchivoP() throws IOException {
        FileWriter fw = null;
        File archivoP = null;
        BufferedWriter bw = null;
        String temp = "";
        for (int i = 0; i < plantas.size() ; i++){
            temp += plantas.get(i).toString() + "\n";
        }
        try {
            archivoP = new File("./Plantas.txt");
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
        plantas = new ArrayList();
        if (archivoP.exists()) {
            try {
                sc = new Scanner(archivoP);
                sc.useDelimiter(";");
                while (sc.hasNext() ) {
                    plantas.add(new Plantas(sc.next(), sc.nextInt(), sc.nextInt() ) );
                    sc.nextLine();
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
