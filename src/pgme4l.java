
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author V Hariharan
 */
public class pgme4l extends javax.swing.JFrame {
int sc = 0;
    /**
     * Creates new form pgme4l
     */
    public pgme4l() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select sum(credit) from courses where regno=(?)");
            ps.setString(1,jLabel16.getText());
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            sc = r1.getInt(1);
            }
            
            jLabel13.setText("Registered Credits    :        "+Integer.toString(sc));
        }
        catch(Exception r3)
        {
            
        }
                        try
    {
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select seats from pe4lfac where slot = 'L45 + L46'");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
            jRadioButton1.setText(rs.getString(1));
            }
            PreparedStatement ps1 = con.prepareStatement("select seats from pe4lfac where slot = 'L41 + L42'");
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next())
            {
            jRadioButton2.setText(rs1.getString(1));
            }
            PreparedStatement ps2 = con.prepareStatement("select seats from pe4lfac where slot = 'L23 + L24'");
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next())
            {
            jRadioButton3.setText(rs2.getString(1));
            }
    }
    catch(Exception r )
        {
            
        }
    }
    public pgme4l(String a) {
        initComponents();
        jLabel16.setText(a);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select sum(credit) from courses where regno=(?)");
            ps.setString(1,jLabel16.getText());
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            sc = r1.getInt(1);
            }
            
            jLabel13.setText("Registered Credits    :        "+Integer.toString(sc));
        }
        catch(Exception r3)
        {
            
        }

                        try
    {
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select seats from pe4lfac where slot = 'L45 + L46'");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
            jRadioButton1.setText(rs.getString(1));
            }
            PreparedStatement ps1 = con.prepareStatement("select seats from pe4lfac where slot = 'L41 + L42'");
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next())
            {
            jRadioButton2.setText(rs1.getString(1));
            }
            PreparedStatement ps2 = con.prepareStatement("select seats from pe4lfac where slot = 'L23 + L24'");
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next())
            {
            jRadioButton3.setText(rs2.getString(1));
            }
    }
    catch(Exception r )
        {
            
        }
    }
        public pgme4l(String a,int b,String c) {
        initComponents();
        jLabel16.setText(a);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select sum(credit) from courses where regno=(?)");
            ps.setString(1,jLabel16.getText());
            ResultSet r1 = ps.executeQuery();
            while(r1.next())
            {
            sc = r1.getInt(1);
            }
            
            jLabel13.setText("Registered Credits    :        "+Integer.toString(sc));
        }
        catch(Exception r3)
        {
            
        }
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("insert into courses values (?,?,?,?,?,?,?,?,?)");
            ps.setString(1,jLabel16.getText());
            ps.setString(2,"SWE2018");
            ps.setString(3,"Object Oriented Analysis and Design");
            ps.setString(4,c);
            ps.setString(5,"-");
            ps.setString(6,"");
            ps.setString(7,"4");
            ps.setString(8,"");
            ps.setString(9,"");
            ps.executeUpdate();
        }
        catch(Exception r)
        {
                
        }
        
        if(b == 1)
        {
           jRadioButton2.setUI(null);
        }
        if(b == 2)
        {
            jRadioButton1.setUI(null);
            jRadioButton3.setUI(null);
        }
        if(b == 3)
        {
            jRadioButton2.setUI(null);
        }
                        try
    {
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select seats from pe4lfac where slot = 'L45 + L46'");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
            jRadioButton1.setText(rs.getString(1));
            }
            PreparedStatement ps1 = con.prepareStatement("select seats from pe4lfac where slot = 'L41 + L42'");
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next())
            {
            jRadioButton2.setText(rs1.getString(1));
            }
            PreparedStatement ps2 = con.prepareStatement("select seats from pe4lfac where slot = 'L23 + L24'");
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next())
            {
            jRadioButton3.setText(rs2.getString(1));
            }
    }
    catch(Exception r )
        {
            
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

        jButton1 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel24 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        PCHead1 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        PCHead2 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        PCHead4 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        PCHead5 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PCHome = new javax.swing.JLabel();
        PCTT = new javax.swing.JLabel();
        PCDel = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("L45 + L46");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("L41 + L42");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("L23 + L24");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("SJT119");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel5)
                .addGap(102, 102, 102))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("SJTG17");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("SJTG18");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("A Narayan");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel9)
                .addGap(190, 190, 190))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("D Vasudev");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel10)
                .addGap(187, 187, 187))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("A Narayan");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jRadioButton1.setText("70");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jRadioButton1)
                .addGap(40, 40, 40))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jRadioButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jRadioButton3.setText("70");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3)
                .addGap(40, 40, 40))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3)
                .addGap(14, 14, 14))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jRadioButton2.setText("70");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jRadioButton2)
                .addGap(40, 40, 40))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(14, 14, 14))
        );

        jPanel29.setBackground(new java.awt.Color(0, 204, 255));

        PCHead1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PCHead1.setForeground(new java.awt.Color(255, 255, 255));
        PCHead1.setText("Slot");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addComponent(PCHead1))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PCHead1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(0, 204, 255));

        PCHead2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PCHead2.setForeground(new java.awt.Color(255, 255, 255));
        PCHead2.setText("Venue");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(PCHead2)
                .addGap(65, 65, 65))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PCHead2)
                .addContainerGap())
        );

        jPanel32.setBackground(new java.awt.Color(0, 204, 255));

        PCHead4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PCHead4.setForeground(new java.awt.Color(255, 255, 255));
        PCHead4.setText("Faculty");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(PCHead4)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PCHead4)
                .addContainerGap())
        );

        jPanel33.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        PCHead5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PCHead5.setForeground(new java.awt.Color(255, 255, 255));
        PCHead5.setText("Available");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PCHead5)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PCHead5)))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel16.setText("jLabel6");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel17.setText("Welcome,");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel18.setText("MTECH INTEGRATED ( SE )");

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Sign Out");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(87, 87, 87)
                                .addComponent(jButton7)))))
                .addGap(77, 77, 77))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18)
                .addGap(30, 30, 30)
                .addComponent(jLabel17)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jButton7))
                .addGap(47, 47, 47))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PCHome.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PCHome.setForeground(new java.awt.Color(51, 51, 255));
        PCHome.setText("Home");
        PCHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PCHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PCHomeMouseClicked(evt);
            }
        });

        PCTT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PCTT.setForeground(new java.awt.Color(51, 51, 255));
        PCTT.setText("View Time Table");
        PCTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PCTTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PCTTMouseEntered(evt);
            }
        });

        PCDel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PCDel.setForeground(new java.awt.Color(51, 51, 255));
        PCDel.setText("Delete Courses");
        PCDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PCDelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PCTT)
                    .addComponent(PCHome)
                    .addComponent(PCDel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(PCHome)
                .addGap(18, 18, 18)
                .addComponent(PCTT)
                .addGap(18, 18, 18)
                .addComponent(PCDel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(59, 59, 59)
                .addComponent(jButton3)
                .addGap(138, 138, 138))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(15, 15, 15))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("Registered Credits    :         0");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setText("Minimum Credits       :       16");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel15.setText("Maximum Credits      :       27");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel15)
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        loginv l = new loginv();
        l.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void PCHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCHomeMouseClicked
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where lab_slot=(?)");
            ps.setString(1,"-");
            ps.executeUpdate();
            new homepage(jLabel16.getText()).setVisible(true);
        }
        catch(Exception r)
        {
            
        }
        
    }//GEN-LAST:event_PCHomeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!jRadioButton1.isSelected() &&  !jRadioButton2.isSelected() && !jRadioButton3.isSelected() )
        {
            JOptionPane optionPane = new JOptionPane("Cannot register without selecting any option",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        else
        {
            String slot="";
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select slot from courses where lab_slot=(?)");
            ps.setString(1, "-");
            ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                     slot = rs.getString(1);
                }
            }
            catch(Exception r)
            {
                
            }
            if(jRadioButton1.isSelected())
            {
                jRadioButton2.setSelected(false);
                jRadioButton3.setSelected(false);
                int count=0;
                try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select slot,lab_slot from courses where regno=(?)");
            ps.setString(1,jLabel16.getText());
            ResultSet rs12 = ps.executeQuery();
            while(rs12.next())
            {
                if("F2 + TF2".equals(rs12.getString(1)) || "D2 + TD2".equals(rs12.getString(1))|| "F2".equals(rs12.getString(1))|| "L45 + L46".equals(rs12.getString(2))){
                    count =1;
                }
            }
                 }
                 catch(Exception rq)
                 {
                     
                 }
               if(count ==1)
               {
                   JOptionPane optionPane = new JOptionPane("Slot clash occured! Couldn't register",JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);  
               }
               else{
                 try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("update courses set lab_slot=(?),faculty=(?),venue=(?),lab_venue=(?) where slot=(?) AND lab_slot=(?)");
            ps.setString(1,"L45 + L46");
            ps.setString(2,"A Narayan");
            ps.setString(3,"SJT115");
            ps.setString(4,"SJT119");
            ps.setString(5,slot);
            ps.setString(6, "-");
            ps.executeUpdate();
            int seat=0;
            JOptionPane optionPane = new JOptionPane("Registered Successfully",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
            PreparedStatement ps2 = con.prepareStatement("select seats from pe4fac where slot=? AND fac=?");
                ps2.setString(1, slot);
                  ps2.setString(2, "A Narayan");
                ResultSet rs2 = ps2.executeQuery();
                while(rs2.next())
                {
                    seat = Integer.parseInt(rs2.getString(1));
                }
                seat = seat -1; 
                  PreparedStatement ps1 = con.prepareStatement("update pe4fac set seats = ? where slot=? AND fac=?");
                  ps1.setString(1,Integer.toString(seat));
                  ps1.setString(2, slot);
                  ps1.setString(3, "A Narayan");
            ps1.executeUpdate();
             
                
            int seat1=0;
            PreparedStatement ps21 = con.prepareStatement("select seats from pe4lfac where slot=?");
                ps21.setString(1, "L45 + L46");
                ResultSet rs21 = ps21.executeQuery();
                while(rs21.next())
                {
                    seat1 = Integer.parseInt(rs21.getString(1));
                }
                seat1 = seat1 -1;
                  PreparedStatement ps11 = con.prepareStatement("update pe4lfac set seats = ? where slot=?");
                  ps11.setString(1,Integer.toString(seat1));
                  ps11.setString(2, "L45 + L46");
            ps11.executeUpdate();
                new pgmelec(jLabel16.getText()).setVisible(true);
                
        } 
        catch (Exception ex) 
        {
            
        }}
            }
            else if(jRadioButton2.isSelected())
            {
                jRadioButton1.setSelected(false);
                jRadioButton3.setSelected(false);
                int count=0;
                try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select slot,lab_slot from courses where regno=(?)");
            ps.setString(1,jLabel16.getText());
            ResultSet rs12 = ps.executeQuery();
            while(rs12.next())
            {
                if("A2 + TA2 + TAA2".equals(rs12.getString(1)) ||"C2 + TC2".equals(rs12.getString(1)) ||"TC2".equals(rs12.getString(1)) ||"C2 + TC2 + TCC2".equals(rs12.getString(1)) || "L41 + L42".equals(rs12.getString(2))){
                    count =1;
                }
            }
                 }
                 catch(Exception rq)
                 {
                     
                 }
               if(count ==1)
               {
                   JOptionPane optionPane = new JOptionPane("Slot clash occured! Couldn't register",JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);  
               }
               else{
                try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("update courses set lab_slot=(?),faculty=(?),venue=(?),lab_venue=(?) where slot=(?) AND lab_slot=(?)");
            ps.setString(1,"L41 + L42");
            ps.setString(2,"D Vasudev");
            ps.setString(3,"SJT114");
            ps.setString(4,"SJTG18");
            ps.setString(5,slot);
            ps.setString(6, "-");
            ps.executeUpdate();
            int seat=0;
            JOptionPane optionPane = new JOptionPane("Registered Successfully",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);  
                PreparedStatement ps2 = con.prepareStatement("select seats from pe4fac where slot=? AND fac=?");
                ps2.setString(1, slot);
                  ps2.setString(2, "D Vasudev");
                ResultSet rs2 = ps2.executeQuery();
                while(rs2.next())
                {
                    seat = Integer.parseInt(rs2.getString(1));
                }
                seat = seat -1;
                  PreparedStatement ps1 = con.prepareStatement("update pe4fac set seats = ? where slot=? AND fac=?");
                  ps1.setString(1,Integer.toString(seat));
                  ps1.setString(2, slot);
                  ps1.setString(3, "D Vasudev");
            ps1.executeUpdate();
            int seat1=0;
            PreparedStatement ps21 = con.prepareStatement("select seats from pe4lfac where slot=?");
                ps21.setString(1, "L41 + L42");
                ResultSet rs21 = ps21.executeQuery();
                while(rs21.next())
                {
                    seat1 = Integer.parseInt(rs21.getString(1));
                }
                seat1 = seat1 -1;
                  PreparedStatement ps11 = con.prepareStatement("update pe4lfac set seats = ? where slot=?");
                  ps11.setString(1,Integer.toString(seat1));
                  ps11.setString(2, "L41 + L42");
            ps11.executeUpdate();
                new pgmelec(jLabel16.getText()).setVisible(true);
        } 
        catch (Exception ex) 
        {
            
        }}
            }
            else if(jRadioButton3.isSelected())
            {
                jRadioButton2.setSelected(false);
                jRadioButton1.setSelected(false);
                int count=0;
                try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("select slot,lab_slot from courses where regno=(?)");
            ps.setString(1,jLabel16.getText());
            ResultSet rs12 = ps.executeQuery();
            while(rs12.next())
            {
                if("C1 + TC1 + TCC1".equals(rs12.getString(1)) ||"TE1".equals(rs12.getString(1)) ||"E1 + TE1".equals(rs12.getString(1)) ||  "L23 + L24".equals(rs12.getString(2))){
                    count =1;
                }
            }
                 }
                 catch(Exception rq)
                 {
                     
                 }
               if(count ==1)
               {
                   JOptionPane optionPane = new JOptionPane("Slot clash occured! Couldn't register",JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);  
               }
               else{
                try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("update courses set lab_slot=(?),faculty=(?),venue=(?),lab_venue=(?) where slot=(?) AND lab_slot=(?)");
            ps.setString(1,"L23 + L24");
            ps.setString(2,"A Narayan");
            ps.setString(3,"SJT115");
            ps.setString(4,"SJTG17");
            ps.setString(5,slot);
            ps.setString(6, "-");
            ps.executeUpdate();
            int seat=0;
            JOptionPane optionPane = new JOptionPane("Registered Successfully",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);  
                PreparedStatement ps2 = con.prepareStatement("select seats from pe4fac where slot=? AND fac=?");
                ps2.setString(1, slot);
                  ps2.setString(2, "A Narayan");
                ResultSet rs2 = ps2.executeQuery();
                while(rs2.next())
                {
                    seat = Integer.parseInt(rs2.getString(1));
                }
                seat = seat -1;
                  PreparedStatement ps1 = con.prepareStatement("update pe4fac set seats = ? where slot=? AND fac=?");
                  ps1.setString(1,Integer.toString(seat));
                  ps1.setString(2, slot);
                  ps1.setString(3, "A Narayan");
            ps1.executeUpdate();
            int seat1=0;
            PreparedStatement ps21 = con.prepareStatement("select seats from pe4lfac where slot=?");
                ps21.setString(1, "L23 + L24");
                ResultSet rs21 = ps21.executeQuery();
                while(rs21.next())
                {
                    seat1 = Integer.parseInt(rs21.getString(1));
                }
                seat1 = seat1 -1;
                  PreparedStatement ps11 = con.prepareStatement("update pe4lfac set seats = ? where slot=?");
                  ps11.setString(1,Integer.toString(seat1));
                  ps11.setString(2, "L23 + L24");
            ps11.executeUpdate();
                new pgmelec(jLabel16.getText()).setVisible(true);
        } 
        catch (Exception ex) 
        {
            
        }}
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new pgmcore(jLabel16.getText()).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cr","root","");
            PreparedStatement ps = con.prepareStatement("delete from courses where lab_slot=(?)");
            ps.setString(1,"-");
            ps.executeUpdate();
            pgme4 p = new pgme4(jLabel16.getText());
            p.setVisible(true);
        }
        catch(Exception r)
        {
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PCTTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCTTMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PCTTMouseEntered

    private void PCTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCTTMouseClicked
        // TODO add your handling code here:
        sam l = new sam(jLabel16.getText());
        l.setVisible(true);
    }//GEN-LAST:event_PCTTMouseClicked

    private void PCDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCDelMouseClicked
        // TODO add your handling code here:
        del l = new del(jLabel16.getText());
        l.setVisible(true);
    }//GEN-LAST:event_PCDelMouseClicked

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
            java.util.logging.Logger.getLogger(pgme4l.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pgme4l.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pgme4l.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pgme4l.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pgme4l().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PCDel;
    private javax.swing.JLabel PCHead1;
    private javax.swing.JLabel PCHead2;
    private javax.swing.JLabel PCHead4;
    private javax.swing.JLabel PCHead5;
    private javax.swing.JLabel PCHome;
    private javax.swing.JLabel PCTT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
