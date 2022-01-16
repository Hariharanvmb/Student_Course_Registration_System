
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author V Hariharan
 */
public class del extends javax.swing.JFrame {
  int sc =0; /**
     * Creates new form del
     */
    public del() {
        initComponents();
        
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select sum(credit) from courses where regno=(?)");
            ps.setString(1,jLabel6.getText());
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            sc = r1.getInt(1);
            System.out.println(sc);
            }
            jLabel3.setText("Registered Credits    :        "+Integer.toString(sc));
        }
        catch(Exception r3)
        {
            
        }
    }
    public del(String a) {
        initComponents();
        jLabel6.setText(a);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select sum(credit) from courses where regno=(?)");
            ps.setString(1,jLabel6.getText());
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            sc = r1.getInt(1);
            System.out.println(sc);
            }
            jLabel3.setText("Registered Credits    :        "+Integer.toString(sc));
        }
        catch(Exception r3)
        {
            
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title from courses where regno=(?)");
            ps.setString(1,jLabel6.getText());
            ResultSet r1 = ps.executeQuery();
            int i = 0;
            while(r1.next())
            {
                    if(i == 0)
                    {
                        jCheckBox1.setText(r1.getString(2));
                    }
                    if(i == 1)
                    {
                        jCheckBox2.setText(r1.getString(2));
                    }
                    if(i == 2)
                    {
                        jCheckBox3.setText(r1.getString(2));
                    }
                    if(i == 3)
                    {
                        jCheckBox4.setText(r1.getString(2));
                    }
                    if(i == 4)
                    {
                        jCheckBox5.setText(r1.getString(2));
                    }
                    if(i == 5)
                    {
                        jCheckBox6.setText(r1.getString(2));
                    }
                    if(i == 6)
                    {
                        jCheckBox7.setText(r1.getString(2));
                    }
                    if(i == 7)
                    {
                        jCheckBox8.setText(r1.getString(2));
                    }
                    i = i+1;
            }
            
        }
        catch(Exception r)
        {
            
        }
        String aa= jCheckBox1.getText();
        String b= jCheckBox2.getText();
        String c= jCheckBox3.getText();
        String d= jCheckBox4.getText();
        String e= jCheckBox5.getText();
        String f= jCheckBox6.getText();
        String g= jCheckBox7.getText();
        String h= jCheckBox8.getText();
        if("jCheckBox1".equals(aa))
        {
            jCheckBox1.setUI(null);
            jButton2.setUI(null);
        }
        if("jCheckBox2".equals(b))
        {
            jCheckBox2.setUI(null);
            jButton4.setUI(null);
        }
        if("jCheckBox3".equals(c))
        {
            jCheckBox3.setUI(null);
            jButton6.setUI(null);
        }
        if("jCheckBox4".equals(d))
        {
            jCheckBox4.setUI(null);
            jButton16.setUI(null);
        }
        if("jCheckBox5".equals(e))
        {
            jCheckBox5.setUI(null);
            jButton14.setUI(null);
        }
        if("jCheckBox6".equals(f))
        {
            jCheckBox6.setUI(null);
            jButton12.setUI(null);
        }
        if("jCheckBox7".equals(g))
        {
            jCheckBox7.setUI(null);
            jButton10.setUI(null);
        }
        if("jCheckBox8".equals(h))
        {
            jCheckBox8.setUI(null);
            jButton8.setUI(null);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MainDel = new javax.swing.JLabel();
        MainTT = new javax.swing.JLabel();
        MainHome = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Maximum Credits      :       27");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Minimum Credits       :       16");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Registered Credits    :        0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(38, 38, 38))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        MainDel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        MainDel.setForeground(new java.awt.Color(51, 51, 255));
        MainDel.setText("Delete Courses");
        MainDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainDelMouseClicked(evt);
            }
        });

        MainTT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        MainTT.setForeground(new java.awt.Color(51, 51, 255));
        MainTT.setText("View Time Table ");
        MainTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainTTMouseClicked(evt);
            }
        });

        MainHome.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        MainHome.setForeground(new java.awt.Color(51, 51, 255));
        MainHome.setText("Home");
        MainHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(MainHome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(MainTT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(MainDel)))
                .addGap(185, 185, 185))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(MainHome)
                .addGap(18, 18, 18)
                .addComponent(MainTT)
                .addGap(18, 18, 18)
                .addComponent(MainDel)
                .addGap(73, 73, 73))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox2.setText("jCheckBox2");

        jCheckBox3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox3.setText("jCheckBox3");

        jCheckBox4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox4.setText("jCheckBox4");

        jCheckBox5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox5.setText("jCheckBox5");

        jCheckBox6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox6.setText("jCheckBox6");

        jCheckBox7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox7.setText("jCheckBox7");

        jCheckBox8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox8.setText("jCheckBox8");

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 0));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 0));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 0));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("View Details");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 204, 0));
        jButton10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("View Details");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 204, 0));
        jButton12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("View Details");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 204, 0));
        jButton14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("View Details");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 204, 0));
        jButton16.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("View Details");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton16)
                    .addComponent(jButton14)
                    .addComponent(jButton12)
                    .addComponent(jButton10)
                    .addComponent(jButton8))
                .addGap(277, 277, 277))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(549, 549, 549))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jCheckBox1))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jCheckBox2))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jCheckBox3))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jCheckBox4))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jCheckBox5))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jCheckBox6))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jCheckBox7))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jCheckBox8))
                .addGap(25, 25, 25)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("MTECH INTEGRATED ( SE )");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Welcome,");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("jLabel6");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(87, 87, 87)
                                .addComponent(jButton1)))))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MainTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainTTMouseClicked
        // TODO add your handling code here:
        sam l = new sam(jLabel6.getText());
        l.setVisible(true);
    }//GEN-LAST:event_MainTTMouseClicked

    private void MainHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainHomeMouseClicked
        // TODO add your handling code here:

        new homepage(jLabel6.getText()).setVisible(true);
    }//GEN-LAST:event_MainHomeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loginv l = new loginv();
        l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String k = jCheckBox1.getText();
        String kz = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title,faculty,slot,credit,venue,lab_slot,lab_venue from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2, k);
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            kz = "Course Code:       "+r1.getString(1)+"\n"+"Course Title:       "+r1.getString(2)+"\n"+"Faculty:               "+r1.getString(3)+"\n"+"Slot:                     "+r1.getString(4)+"\n"+"Credits:                "+r1.getString(5)+"\n"+"Venue:                 "+r1.getString(6)+"\n"+"Lab_Slot:              "+r1.getString(7)+"\n"+"Lab_Venue:         "+r1.getString(8)+"\n";
            }            
            JTextArea label = new JTextArea(kz);
            label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));            
            JOptionPane optionPane= new JOptionPane(label,JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        String k = jCheckBox4.getText();
        String kz = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title,faculty,slot,credit,venue,lab_slot,lab_venue from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2, k);
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            kz = "Course Code:       "+r1.getString(1)+"\n"+"Course Title:       "+r1.getString(2)+"\n"+"Faculty:               "+r1.getString(3)+"\n"+"Slot:                     "+r1.getString(4)+"\n"+"Credits:                "+r1.getString(5)+"\n"+"Venue:                 "+r1.getString(6)+"\n"+"Lab_Slot:              "+r1.getString(7)+"\n"+"Lab_Venue:         "+r1.getString(8)+"\n";
            }            
            JTextArea label = new JTextArea(kz);
            label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));            
            JOptionPane optionPane= new JOptionPane(label,JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String k = jCheckBox6.getText();
        String kz = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title,faculty,slot,credit,venue,lab_slot,lab_venue from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2, k);
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            kz = "Course Code:       "+r1.getString(1)+"\n"+"Course Title:       "+r1.getString(2)+"\n"+"Faculty:               "+r1.getString(3)+"\n"+"Slot:                     "+r1.getString(4)+"\n"+"Credits:                "+r1.getString(5)+"\n"+"Venue:                 "+r1.getString(6)+"\n"+"Lab_Slot:              "+r1.getString(7)+"\n"+"Lab_Venue:         "+r1.getString(8)+"\n";
            }            
            JTextArea label = new JTextArea(kz);
            label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));            
            JOptionPane optionPane= new JOptionPane(label,JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!jCheckBox1.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected() && !jCheckBox4.isSelected() && !jCheckBox5.isSelected() && !jCheckBox6.isSelected() && !jCheckBox7.isSelected() && !jCheckBox8.isSelected() )
        {
            JOptionPane optionPane = new JOptionPane("No item Selected",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        else
        {
            JOptionPane optionPane = new JOptionPane("Are you sure to delete?",JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
            if(jCheckBox1.isSelected())
            {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2,jCheckBox1.getText());
            ps.executeUpdate();
            del l = new del(jLabel6.getText());
            l.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
            }
            if(jCheckBox2.isSelected())
            {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2,jCheckBox2.getText());
            ps.executeUpdate();
            del l = new del(jLabel6.getText());
        l.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
            }
            if(jCheckBox3.isSelected())
            {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2,jCheckBox3.getText());
            ps.executeUpdate();
            del l = new del(jLabel6.getText());
        l.setVisible(true);

        }
        catch(Exception r3)
        {
            
        }
            }
            if(jCheckBox4.isSelected())
            {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2,jCheckBox4.getText());
            ps.executeUpdate();
            del l = new del(jLabel6.getText());
        l.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
            }
            if(jCheckBox5.isSelected())
            {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2,jCheckBox5.getText());
            ps.executeUpdate();
            del l = new del(jLabel6.getText());
            l.setVisible(true);

        }
        catch(Exception r3)
        {
            
        }
            }
            if(jCheckBox6.isSelected())
            {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2,jCheckBox6.getText());
            ps.executeUpdate();
            del l = new del(jLabel6.getText());
        l.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
            }
            if(jCheckBox7.isSelected())
            {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2,jCheckBox7.getText());
            ps.executeUpdate();
            del l = new del(jLabel6.getText());
        l.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
            }
            if(jCheckBox8.isSelected())
            {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2,jCheckBox8.getText());
            ps.executeUpdate();
            del l = new del(jLabel6.getText());
        l.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String k = jCheckBox2.getText();
        String kz = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title,faculty,slot,credit,venue,lab_slot,lab_venue from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2, k);
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            kz = "Course Code:       "+r1.getString(1)+"\n"+"Course Title:       "+r1.getString(2)+"\n"+"Faculty:               "+r1.getString(3)+"\n"+"Slot:                     "+r1.getString(4)+"\n"+"Credits:                "+r1.getString(5)+"\n"+"Venue:                 "+r1.getString(6)+"\n"+"Lab_Slot:              "+r1.getString(7)+"\n"+"Lab_Venue:         "+r1.getString(8)+"\n";
            }            
            JTextArea label = new JTextArea(kz);
            label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));            
            JOptionPane optionPane= new JOptionPane(label,JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String k = jCheckBox3.getText();
        String kz = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title,faculty,slot,credit,venue,lab_slot,lab_venue from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2, k);
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            kz = "Course Code:       "+r1.getString(1)+"\n"+"Course Title:       "+r1.getString(2)+"\n"+"Faculty:               "+r1.getString(3)+"\n"+"Slot:                     "+r1.getString(4)+"\n"+"Credits:                "+r1.getString(5)+"\n"+"Venue:                 "+r1.getString(6)+"\n"+"Lab_Slot:              "+r1.getString(7)+"\n"+"Lab_Venue:         "+r1.getString(8)+"\n";
            }            
            JTextArea label = new JTextArea(kz);
            label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));            
            JOptionPane optionPane= new JOptionPane(label,JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        String k = jCheckBox5.getText();
        String kz = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title,faculty,slot,credit,venue,lab_slot,lab_venue from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2, k);
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            kz = "Course Code:       "+r1.getString(1)+"\n"+"Course Title:       "+r1.getString(2)+"\n"+"Faculty:               "+r1.getString(3)+"\n"+"Slot:                     "+r1.getString(4)+"\n"+"Credits:                "+r1.getString(5)+"\n"+"Venue:                 "+r1.getString(6)+"\n"+"Lab_Slot:              "+r1.getString(7)+"\n"+"Lab_Venue:         "+r1.getString(8)+"\n";
            }            
            JTextArea label = new JTextArea(kz);
            label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));            
            JOptionPane optionPane= new JOptionPane(label,JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String k = jCheckBox7.getText();
        String kz = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title,faculty,slot,credit,venue,lab_slot,lab_venue from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2, k);
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            kz = "Course Code:       "+r1.getString(1)+"\n"+"Course Title:       "+r1.getString(2)+"\n"+"Faculty:               "+r1.getString(3)+"\n"+"Slot:                     "+r1.getString(4)+"\n"+"Credits:                "+r1.getString(5)+"\n"+"Venue:                 "+r1.getString(6)+"\n"+"Lab_Slot:              "+r1.getString(7)+"\n"+"Lab_Venue:         "+r1.getString(8)+"\n";
            }            
            JTextArea label = new JTextArea(kz);
            label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));            
            JOptionPane optionPane= new JOptionPane(label,JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String k = jCheckBox8.getText();
        String kz = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select c_code,c_title,faculty,slot,credit,venue,lab_slot,lab_venue from courses where regno=(?) AND c_title=(?)");
            ps.setString(1,jLabel6.getText());
            ps.setString(2, k);
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            kz = "Course Code:       "+r1.getString(1)+"\n"+"Course Title:       "+r1.getString(2)+"\n"+"Faculty:               "+r1.getString(3)+"\n"+"Slot:                     "+r1.getString(4)+"\n"+"Credits:                "+r1.getString(5)+"\n"+"Venue:                 "+r1.getString(6)+"\n"+"Lab_Slot:              "+r1.getString(7)+"\n"+"Lab_Venue:         "+r1.getString(8)+"\n";
            }            
            JTextArea label = new JTextArea(kz);
            label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));            
            JOptionPane optionPane= new JOptionPane(label,JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        catch(Exception r3)
        {
            
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void MainDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainDelMouseClicked
        // TODO add your handling code here:
        del l = new del(jLabel6.getText());
        l.setVisible(true);
    }//GEN-LAST:event_MainDelMouseClicked

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
            java.util.logging.Logger.getLogger(del.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(del.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(del.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(del.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new del().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainDel;
    private javax.swing.JLabel MainHome;
    private javax.swing.JLabel MainTT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
