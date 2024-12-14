/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edusafe;

/**
 *
 * @author LENOVO
 */
import koneksi.koneksidb;
import javax.swing.JOptionPane;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class dashboard extends javax.swing.JFrame {

   public Statement st;
public ResultSet rs;
Connection cn = koneksi.koneksidb.BukaKoneksi();
    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        TampilData ();
    }
    private void Bersih (){
    id_users.setText("");
    username.setText("");
    password.setText("");
    email.setText("");
    kelas.setText("");
    jenis_kelamin.setText("");
    
    simpan.setText("simpan");
    id_users.setEditable(true);
}
private void TampilData(){
    try{
        st = cn.createStatement();
        rs = st.executeQuery("SELECT * FROM users_166732");
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO");
        model.addColumn("ID USERS");
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");
        model.addColumn("EMAIL");
        model.addColumn("KELAS");
        model.addColumn("JENIS_KELAMIN");
        
        int no =1;
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model.setRowCount(0);
        
        while (rs.next()){
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            for (int i = 1; i <= columnCount; i++){
                System.out.println(metaData.getColumnName(i)
                + ": " + rs.getString(i));
            }
            Object[] data= {
    no++,
    rs.getString("id_users"),
    rs.getString("username"),
    rs.getString("password"),
    rs.getString("email"),
    rs.getString("kelas"),
    rs.getString("jenis_kelamin")
};

           
            model.addRow(data);
        }
        tblData1.setModel(model);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Eror while fetching data from database", "Database Eror", JOptionPane.ERROR_MESSAGE);
    }

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        btnhome = new javax.swing.JButton();
        btndatausers = new javax.swing.JButton();
        btnthread = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        crud = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id_users = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        jenis_kelamin = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        report = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData1 = new javax.swing.JTable();
        thread = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        sidebar.setBackground(new java.awt.Color(153, 255, 153));

        btnhome.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRIBADI\\Downloads\\iconatha\\home.png")); // NOI18N
        btnhome.setText("  HOME");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        btndatausers.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRIBADI\\Downloads\\iconatha\\datausers.png")); // NOI18N
        btndatausers.setText("DATA USERS");
        btndatausers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatausersActionPerformed(evt);
            }
        });

        btnthread.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRIBADI\\Downloads\\iconatha\\thread.png")); // NOI18N
        btnthread.setText("THREAD");
        btnthread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthreadActionPerformed(evt);
            }
        });

        btnlogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRIBADI\\Downloads\\iconatha\\logout.png")); // NOI18N
        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRIBADI\\Downloads\\iconatha\\logoskull.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("SMA JAYA");

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
            .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btndatausers, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(btnthread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnhome)
                .addGap(32, 32, 32)
                .addComponent(btndatausers, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnthread)
                .addGap(34, 34, 34)
                .addComponent(btnlogout)
                .addGap(72, 72, 72))
        );

        header.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        MainPanel.setBackground(new java.awt.Color(204, 255, 204));
        MainPanel.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("SELAMAT DATANG DI EDUSAFE");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRIBADI\\Downloads\\iconatha\\hai.png")); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(177, 177, 177))))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel3)
                .addGap(87, 87, 87)
                .addComponent(jLabel10)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        MainPanel.add(home, "card2");

        crud.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("ID USERS");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("USERNAME");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("PASSWORD");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("EMAIL");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("KELAS");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("JENIS KELAMIN");

        id_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_usersActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });

        jenis_kelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_kelaminActionPerformed(evt);
            }
        });

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        report.setText("REPORT");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        tblData1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_users", "username", "password", "email", "kelas", "jenis_kelamin"
            }
        ));
        tblData1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblData1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblData1);

        javax.swing.GroupLayout crudLayout = new javax.swing.GroupLayout(crud);
        crud.setLayout(crudLayout);
        crudLayout.setHorizontalGroup(
            crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudLayout.createSequentialGroup()
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crudLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addGroup(crudLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addGroup(crudLayout.createSequentialGroup()
                                        .addComponent(simpan)
                                        .addGap(18, 18, 18)
                                        .addComponent(edit)))))
                        .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crudLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_users, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(crudLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(hapus)
                                .addGap(18, 18, 18)
                                .addComponent(report))))
                    .addGroup(crudLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        crudLayout.setVerticalGroup(
            crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(id_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(edit)
                    .addComponent(hapus)
                    .addComponent(report))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        MainPanel.add(crud, "card3");

        thread.setBackground(new java.awt.Color(204, 255, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Akhir-akhir ini, isu lingkungan seperti deforestasi, pencemaran, dan perubahan"},
                {"iklim menunjukkan bahwa keseimbangan ekosistem sedang terancam. Sebagai manusia,"},
                {"kita memiliki tanggung jawab untuk menjaga kelestarian alam"},
                {null}
            },
            new String [] {
                "Leivina"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pendidikan merupakan kunci untuk membangun masa depan yang lebih baik bagi suatu negara."},
                {"Sayangnya, masih banyak anak-anak di dunia yang tidak memiliki akses "},
                {"terhadap pendidikan yang berkualitas. Hal ini harus menjadi perhatian kita bersama. "}
            },
            new String [] {
                "Laela"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Kesetaraan gender merupakan salah satu isu penting dalam pembangunan yang berkelanjutan."},
                {"Sayangnya, masih banyak negara di dunia yang belum mencapai kesetaraan gender yang optimal,"},
                {null}
            },
            new String [] {
                "Viona"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout threadLayout = new javax.swing.GroupLayout(thread);
        thread.setLayout(threadLayout);
        threadLayout.setHorizontalGroup(
            threadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(threadLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(threadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, threadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, threadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(43, 43, 43))
        );
        threadLayout.setVerticalGroup(
            threadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(threadLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(delete)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        MainPanel.add(thread, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
    MainPanel.removeAll();
    MainPanel.repaint();
    MainPanel.revalidate();
    
    MainPanel.add(home);
    MainPanel.repaint();
    MainPanel.revalidate(); 
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btndatausersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatausersActionPerformed
        // TODO add your handling code here:
    MainPanel.removeAll();
    MainPanel.repaint();
    MainPanel.revalidate();
    
    MainPanel.add(crud);
    MainPanel.repaint();
    MainPanel.revalidate(); 
    }//GEN-LAST:event_btndatausersActionPerformed

    private void id_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_usersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_usersActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void jenis_kelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_kelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_kelaminActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
          try {
        st = cn.createStatement();

        int selectedRowIndex = tblData1.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idToDelete = tblData1.getValueAt(selectedRowIndex, 0).toString(); // Mendapatkan id dari baris yang dipilih
        int confirmDialog = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirmDialog == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM users_166732 WHERE id_users = ?";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            preparedStatement.setString(1, idToDelete);
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            TampilData();
            Bersih();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
                                              
    try {
        st = cn.createStatement();
        if(id_users.getText().equals("") ||
            username.getText().equals("") ||
            password.getText().equals("") ||
            email.getText().equals("") ||        
            kelas.getText().equals("") ||
            jenis_kelamin.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Data tidak Boleh Kosong","validasi data",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (simpan.getText().equals("simpan")) {
            String cek = "SELECT * FROM users_166732 WHERE id_users = '" + id_users.getText() + "'";
            rs = st.executeQuery(cek);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Oops... id sudah ada");
            } else {
                String sql = "INSERT INTO users_166732 VALUES ('" + id_users.getText() +
                        "','" + username.getText() +
                        "','" + password.getText() +
                        "','" + email.getText() +
                        "','" + kelas.getText() +
                        "','" + jenis_kelamin.getText() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
                TampilData();
                Bersih();
            }
        } else if (simpan.getText().equals("simpan")) {
            // Kode untuk proses update data di sini
        }
    } catch (Exception e) {
        // Tangani pengecualian di sini, misalnya:
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Ini untuk mencetak stack trace, bermanfaat untuk debugging
    }

// TODO add your handling code here:
        
    }//GEN-LAST:event_simpanActionPerformed

    private void tblData1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblData1AncestorAdded
       id_users.setText(tblData1.getValueAt(tblData1.getSelectedRow(), 1).toString());
    username.setText(tblData1.getValueAt(tblData1.getSelectedRow(), 2).toString());
    password.setText(tblData1.getValueAt(tblData1.getSelectedRow(), 3).toString());
    email.setText(tblData1.getValueAt(tblData1.getSelectedRow(), 4).toString());
    kelas.setText(tblData1.getValueAt(tblData1.getSelectedRow(), 5).toString());
    jenis_kelamin.setText(tblData1.getValueAt(tblData1.getSelectedRow(), 6).toString());
    id_users.setEditable(false);
    simpan.setText("SIMPAN");
    }//GEN-LAST:event_tblData1AncestorAdded

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         try {
        st = cn.createStatement();
        if (id_users.getText().equals("") ||
            username.getText().equals("") ||
            password.getText().equals("") ||
            email.getText().equals("") ||
            kelas.getText().equals("") ||
            jenis_kelamin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Validasi data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int selectedRowIndex = tblData1.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang akan diubah", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String id_usersToUpdate = tblData1.getValueAt(selectedRowIndex, 0).toString(); // Mendapatkan id dari baris yang dipilih
        String sql = "UPDATE users_166732 SET username = ?, password = ?, email = ?, kelas = ?, jenis_kelamin = ? WHERE id_users = ?";
        PreparedStatement preparedStatement = cn.prepareStatement(sql);
        preparedStatement.setString(1, username.getText());
        preparedStatement.setString(2, password.getText());
        preparedStatement.setString(3, email.getText());
        preparedStatement.setString(4, kelas.getText());
        preparedStatement.setString(5, jenis_kelamin.getText());
        preparedStatement.setString(6, id_usersToUpdate);
        preparedStatement.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        TampilData();
        Bersih();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        try {
        st = cn.createStatement();

        int selectedRowIndex = tblData1.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String id_usersToDelete = tblData1.getValueAt(selectedRowIndex, 0).toString(); // Mendapatkan id dari baris yang dipilih
        int confirmDialog = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirmDialog == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM users_166732 WHERE id_users = ?";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            preparedStatement.setString(1, id_usersToDelete);
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            TampilData();
            Bersih();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_hapusActionPerformed

    private void btnthreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthreadActionPerformed
        // TODO add your handling code here:
         MainPanel.removeAll();
    MainPanel.repaint();
    MainPanel.revalidate();
    
    MainPanel.add(thread);
    MainPanel.repaint();
    MainPanel.revalidate(); 
    }//GEN-LAST:event_btnthreadActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        username = null;

    // Tutup jendela Dashboard saat ini
    this.dispose();

    // Tampilkan kembali jendela Login
    login login = new login();
    login.setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btndatausers;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnthread;
    private javax.swing.JPanel crud;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JButton hapus;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JTextField id_users;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jenis_kelamin;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField password;
    private javax.swing.JButton report;
    private javax.swing.JPanel sidebar;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tblData1;
    private javax.swing.JPanel thread;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
