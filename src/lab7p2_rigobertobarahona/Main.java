package lab7p2_rigobertobarahona;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }
    AdminPlantas ap = new AdminPlantas("./Plantas.txt");
    AdminZombies az = new AdminZombies("./Zombies.txt");
    
    ArrayList<Victima> temporal = new ArrayList();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Planta_Name = new javax.swing.JTextField();
        Planta_Ataque = new javax.swing.JTextField();
        Planta_Vida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Planta_Corto = new javax.swing.JRadioButton();
        Planta_Medio = new javax.swing.JRadioButton();
        Planta_Largo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Planta_Explosiva = new javax.swing.JRadioButton();
        Planta_Defensa = new javax.swing.JRadioButton();
        Planta_Disparo = new javax.swing.JRadioButton();
        Plantas_Field1 = new javax.swing.JLabel();
        Plantas_Option1 = new javax.swing.JTextField();
        Plantas_Field2 = new javax.swing.JLabel();
        Plantas_Option2 = new javax.swing.JTextField();
        Plantas_Field3 = new javax.swing.JLabel();
        Plantas_Option3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Zombies_Name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Zombies_Ataque = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Zombies_Vida = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Zombie_Clasico = new javax.swing.JRadioButton();
        Zombie_Cargado = new javax.swing.JRadioButton();
        Zombies_Victim = new javax.swing.JLabel();
        Zombies_Victimas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Zombie_Blob = new javax.swing.JTextArea();
        Zombie_Add = new javax.swing.JButton();
        Bandera = new javax.swing.JLabel();
        Zombie_Field1 = new javax.swing.JLabel();
        Zombies_Option1 = new javax.swing.JTextField();
        Zombies_Field2 = new javax.swing.JLabel();
        Zombies_Option2 = new javax.swing.JTextField();
        Zombies_Field3 = new javax.swing.JLabel();
        Zombies_Option3 = new javax.swing.JTextField();
        Zombies_Agregar = new javax.swing.JButton();
        Bandera_Color = new javax.swing.JLabel();
        Zombies_Color = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Zombies_Direccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plants vs Zombies");

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setText("Oops se me fue el tiempo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel11)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ataque");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Vida");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Rango");

        Planta_Corto.setText("Corto");

        Planta_Medio.setText("Medio");

        Planta_Largo.setText("Largo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tipo");

        Planta_Explosiva.setText("Explosiva");
        Planta_Explosiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Planta_ExplosivaMouseClicked(evt);
            }
        });

        Planta_Defensa.setText("Defensa");
        Planta_Defensa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Planta_DefensaMouseClicked(evt);
            }
        });

        Planta_Disparo.setText("Disparo");
        Planta_Disparo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Planta_DisparoMouseClicked(evt);
            }
        });
        Planta_Disparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planta_DisparoActionPerformed(evt);
            }
        });

        Plantas_Field1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Plantas_Field1.setText("Magnitud");

        Plantas_Field2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Plantas_Field2.setText("Color");
        Plantas_Field2.setEnabled(false);

        Plantas_Option2.setEnabled(false);

        Plantas_Field3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Plantas_Field3.setText("Peso");
        Plantas_Field3.setEnabled(false);

        Plantas_Option3.setEnabled(false);
        Plantas_Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plantas_Option3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Plantas_Option1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Plantas_Field1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Planta_Name)
                        .addComponent(Planta_Ataque)
                        .addComponent(Planta_Vida, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(Plantas_Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plantas_Option2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Plantas_Field3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Plantas_Option3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Planta_Corto, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(Planta_Medio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Planta_Largo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(121, 121, 121)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Planta_Defensa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Planta_Explosiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Planta_Disparo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Planta_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Planta_Corto)
                            .addComponent(jLabel6)
                            .addComponent(Planta_Explosiva))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Planta_Ataque, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Planta_Medio)
                            .addComponent(Planta_Defensa))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Planta_Vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Planta_Largo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Planta_Disparo)))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Plantas_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plantas_Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plantas_Field3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Plantas_Option1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plantas_Option2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plantas_Option3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plantas", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Ataque");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Vida");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Tipo");

        Zombie_Clasico.setText("Clasico");
        Zombie_Clasico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Zombie_Clasico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Zombie_ClasicoMouseClicked(evt);
            }
        });

        Zombie_Cargado.setText("Cargado");
        Zombie_Cargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Zombie_Cargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Zombie_CargadoMouseClicked(evt);
            }
        });

        Zombies_Victim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Zombies_Victim.setText("Victimas");
        Zombies_Victim.setEnabled(false);

        Zombies_Victimas.setEnabled(false);

        Zombie_Blob.setColumns(20);
        Zombie_Blob.setRows(5);
        Zombie_Blob.setEnabled(false);
        jScrollPane1.setViewportView(Zombie_Blob);

        Zombie_Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Zombie_Add.setText("Add");
        Zombie_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Zombie_Add.setEnabled(false);
        Zombie_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Zombie_AddMouseClicked(evt);
            }
        });

        Bandera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bandera.setText("Bandera");

        Zombie_Field1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Zombie_Field1.setText("Anos de Experiencia");

        Zombies_Field2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Zombies_Field2.setText("Edad");
        Zombies_Field2.setEnabled(false);

        Zombies_Option2.setEnabled(false);

        Zombies_Field3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Zombies_Field3.setText("Nivel de Enojo");
        Zombies_Field3.setEnabled(false);

        Zombies_Agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Zombies_Agregar.setText("Agregar");
        Zombies_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Zombies_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Zombies_AgregarMouseClicked(evt);
            }
        });

        Bandera_Color.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bandera_Color.setText("Color");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Direccion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bandera, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Zombie_Field1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Zombies_Option1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Zombies_Name)
                                    .addComponent(Zombies_Ataque)
                                    .addComponent(Zombies_Vida)
                                    .addComponent(Zombies_Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Zombies_Option2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Zombies_Field3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(Zombies_Option3))))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Zombie_Cargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Zombie_Clasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Zombies_Victim)
                            .addComponent(Zombie_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(Zombies_Victimas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Zombies_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bandera_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Zombies_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(256, 256, 256)
                                .addComponent(Zombies_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Zombies_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Zombie_Clasico)
                    .addComponent(Zombies_Victim)
                    .addComponent(Zombies_Victimas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Zombies_Ataque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zombie_Cargado)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Zombie_Add)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Zombies_Vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zombie_Field1)
                            .addComponent(Zombies_Field2)
                            .addComponent(Zombies_Field3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zombies_Option1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zombies_Option2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zombies_Option3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(Bandera, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bandera_Color)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zombies_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zombies_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zombies_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );

        jTabbedPane1.addTab("Zombies", jPanel3);

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TitleLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Planta_DisparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planta_DisparoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Planta_DisparoActionPerformed

    private void Plantas_Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Plantas_Option3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Plantas_Option3ActionPerformed

    private void Planta_ExplosivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Planta_ExplosivaMouseClicked
        if (Planta_Explosiva.isSelected() ){
            Plantas_Field1.setText("Magnitud");
            Plantas_Field2.setEnabled(false);
            Plantas_Field3.setEnabled(false);
            Plantas_Option2.setEnabled(false);
            Plantas_Option3.setEnabled(false);
        }
    }//GEN-LAST:event_Planta_ExplosivaMouseClicked

    private void Planta_DefensaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Planta_DefensaMouseClicked
        if (Planta_Defensa.isSelected() ){
            Plantas_Field1.setText("Altura");
            Plantas_Field2.setEnabled(true);
            Plantas_Field2.setText("Dureza");
            Plantas_Field3.setEnabled(true);
            Plantas_Option2.setEnabled(true);
            Plantas_Option3.setEnabled(true);
        }
    }//GEN-LAST:event_Planta_DefensaMouseClicked

    private void Planta_DisparoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Planta_DisparoMouseClicked
        if (Planta_Disparo.isSelected() ){
            Plantas_Field1.setText("Proyectil");
            Plantas_Field2.setEnabled(true);
            Plantas_Field2.setText("Color");
            Plantas_Option2.setEnabled(true);
            Plantas_Field3.setEnabled(false);
            Plantas_Option3.setEnabled(false);
        }
    }//GEN-LAST:event_Planta_DisparoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        boolean posible = true;
        String nombre = Planta_Name.getText();
        int ataque = Integer.parseInt(Planta_Ataque.getText() );
        int vida = Integer.parseInt(Planta_Vida.getText() );
        String rango = "";
        if (Planta_Corto.isSelected() ){
            rango  = "Corto";
        } else if (Planta_Medio.isSelected() ){
            rango = "Medio";
        }else if (Planta_Largo.isSelected() ){
            rango = "Largo";
        } else{
            posible = false;
            JOptionPane.showMessageDialog(this, "Hay mas de una opcion seleccionada");
        }
        if (posible == true) {
            if (Planta_Disparo.isSelected()) {
                String proyectile = Plantas_Option1.getText();
                String color = Plantas_Option2.getText();
                ap.plantas.add(new Disparo(nombre, ataque, vida, rango, proyectile, color));
            } else if (Planta_Defensa.isSelected() ){
                int altura = Integer.parseInt(Plantas_Option1.getText() );
                int dureza = Integer.parseInt(Plantas_Option2.getText() );
                int peso = Integer.parseInt(Plantas_Option3.getText() );
                ap.plantas.add(new Defensa( nombre, ataque, vida, rango, altura, dureza, peso ) );
            } else if (Planta_Explosiva.isSelected() ){
                int magnitud = Integer.parseInt(Plantas_Option1.getText() );
                ap.plantas.add( new Explosiva( nombre, ataque, vida, rango, magnitud) );
            }else {
                JOptionPane.showMessageDialog(this, "Hay mas de una opcion seleccionada");
            }
        }
        try{
            ap.escribirArchivoP();
            JOptionPane.showMessageDialog(this, "Planta Agregada Exitosamente");
        } catch (Exception e) {
            System.out.println("Hubo un erro");
        }
        Planta_Name.setText("");
        Planta_Ataque.setText("");
        Planta_Vida.setText("");
        Plantas_Option1.setText("");
        Plantas_Option2.setText("");
        Plantas_Option3.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void Zombie_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Zombie_AddMouseClicked
        if (Zombie_Cargado.isSelected() ){
            Victima v = new Victima(Zombies_Victimas.getText() );
            temporal.add(v);
            Zombies_Victimas.setText("");
            Zombie_Blob.setText("");
            String salida = "";
            for (Object temp : temporal) {
                if (temp instanceof Victima) {
                    salida += temp + "\n";
                }
            }
            Zombie_Blob.setText(salida);
        }else{
            System.out.println("Tipo Invalido");
        }
    }//GEN-LAST:event_Zombie_AddMouseClicked

    private void Zombie_ClasicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Zombie_ClasicoMouseClicked
        if (Zombie_Clasico.isSelected() ){    
            Zombie_Blob.setEnabled(false);
            Zombies_Victimas.setEnabled(false);
            Zombies_Victim.setEnabled(false);
            Zombie_Add.setEnabled(false);
            Zombie_Field1.setText("Anos de Experiencias");
            Zombies_Field2.setEnabled(false);
            Zombies_Field3.setEnabled(false);
            Zombies_Option2.setEnabled(false);
            Zombies_Option3.setEnabled(false);
            Zombies_Color.setEnabled(true);
            Zombies_Direccion.setEnabled(true);
        }
    }//GEN-LAST:event_Zombie_ClasicoMouseClicked

    private void Zombie_CargadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Zombie_CargadoMouseClicked
        if (Zombie_Cargado.isSelected() ){
            Zombie_Blob.setEnabled(true);
            Zombies_Victimas.setEnabled(true);
            Zombies_Victim.setEnabled(true);
            Zombie_Add.setEnabled(true);
            Zombie_Field1.setText("Tamano");
            Zombies_Field2.setEnabled(true);
            Zombies_Field3.setEnabled(true);
            Zombies_Option2.setEnabled(true);
            Zombies_Option3.setEnabled(true);
            Zombies_Color.setEnabled(false);
            Zombies_Direccion.setEnabled(false);
        }
    }//GEN-LAST:event_Zombie_CargadoMouseClicked

    private void Zombies_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Zombies_AgregarMouseClicked
        String nombre = Zombies_Name.getText();
        int ataque = Integer.parseInt(Zombies_Ataque.getText() );
        int vida = Integer.parseInt(Zombies_Vida.getText() );
        if(Zombie_Clasico.isSelected() ){
            int anos = Integer.parseInt(Zombies_Option1.getText() );
            String color = Zombies_Color.getText();
            String direccion = Zombies_Direccion.getText();
            Bandera b = new Bandera(color, direccion);
            az.zombies.add(new Clasico( nombre, ataque, vida, anos, b) );
        }else if (Zombie_Cargado.isSelected() ){
            int tamano = Integer.parseInt(Zombies_Option1.getText() );
            int edad = Integer.parseInt(Zombies_Option2.getText() );
            int enojo = Integer.parseInt(Zombies_Option3.getText() );
            ArrayList<Victima> victimas = new ArrayList();
            for (int i = 0; i < temporal.size(); i++){
                victimas.add(temporal.get(i) );
            }
            az.zombies.add(new Cargado( nombre, ataque, vida, tamano, edad, enojo, victimas) );
        }else{
            JOptionPane.showMessageDialog(this, "Hay mas de una opcion seleccionada");
        }
         try{
            az.escribirArchivoZ();
            JOptionPane.showMessageDialog(this, "Zombie Agregada Exitosamente");
        } catch (Exception e) {
            System.out.println("Hubo un erro");
        }
         Zombies_Name.setText("");
         Zombies_Ataque.setText("");
         Zombies_Vida.setText("");
         Zombies_Option1.setText("");
         Zombies_Option2.setText("");
         Zombies_Option3.setText("");
         Zombie_Blob.setText("");
         temporal.clear();
    }//GEN-LAST:event_Zombies_AgregarMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bandera;
    private javax.swing.JLabel Bandera_Color;
    private javax.swing.JTextField Planta_Ataque;
    private javax.swing.JRadioButton Planta_Corto;
    private javax.swing.JRadioButton Planta_Defensa;
    private javax.swing.JRadioButton Planta_Disparo;
    private javax.swing.JRadioButton Planta_Explosiva;
    private javax.swing.JRadioButton Planta_Largo;
    private javax.swing.JRadioButton Planta_Medio;
    private javax.swing.JTextField Planta_Name;
    private javax.swing.JTextField Planta_Vida;
    private javax.swing.JLabel Plantas_Field1;
    private javax.swing.JLabel Plantas_Field2;
    private javax.swing.JLabel Plantas_Field3;
    private javax.swing.JTextField Plantas_Option1;
    private javax.swing.JTextField Plantas_Option2;
    private javax.swing.JTextField Plantas_Option3;
    private javax.swing.JPanel Title;
    private javax.swing.JButton Zombie_Add;
    private javax.swing.JTextArea Zombie_Blob;
    private javax.swing.JRadioButton Zombie_Cargado;
    private javax.swing.JRadioButton Zombie_Clasico;
    private javax.swing.JLabel Zombie_Field1;
    private javax.swing.JButton Zombies_Agregar;
    private javax.swing.JTextField Zombies_Ataque;
    private javax.swing.JTextField Zombies_Color;
    private javax.swing.JTextField Zombies_Direccion;
    private javax.swing.JLabel Zombies_Field2;
    private javax.swing.JLabel Zombies_Field3;
    private javax.swing.JTextField Zombies_Name;
    private javax.swing.JTextField Zombies_Option1;
    private javax.swing.JTextField Zombies_Option2;
    private javax.swing.JTextField Zombies_Option3;
    private javax.swing.JLabel Zombies_Victim;
    private javax.swing.JTextField Zombies_Victimas;
    private javax.swing.JTextField Zombies_Vida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
