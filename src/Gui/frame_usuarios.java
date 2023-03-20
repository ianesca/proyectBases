package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JDBC.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frame_usuarios extends JFrame {

    JLabel jLabel1 = new javax.swing.JLabel();
    JTextField jTextField1 = new javax.swing.JTextField();
    JPasswordField jPasswordField1 = new javax.swing.JPasswordField();
    JLabel jLabel2 = new javax.swing.JLabel();
    JButton jButton1 = new javax.swing.JButton();
    JButton jButton2 = new javax.swing.JButton();
    Conexion cx;

   
    public frame_usuarios() {
        ///////////////////////////////////////////////////////////////////////////

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GRAY);

        ///////////////////////////////////////////////////////////////////////////
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 70, 100, 22);

        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 70, 140, 28);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 120, 110, 22);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registar");
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 170, 123, 44);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(220, 110, 140, 30);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Entrar");
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 170, 123, 44);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_registro v = new frame_registro();
                v.setVisible(true);
                setVisible(false);
            }
        });
        cx=new Conexion("pg_proyecto");
        cx.conectar();
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String user = jTextField1.getText();
                    String pass = String.valueOf(jPasswordField1.getPassword());
                    String query = "Select * from tabla_usuarios where usuario='" + user + "' and clave='" + pass + "'";
                    Statement st = cx.conectar().createStatement();
                    ResultSet rs = st.executeQuery(query);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "El usuario esta en la BD");
                        frame_inicio v = new frame_inicio();
                        v.setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario no existe en la BD");

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frame_usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void main(String args[]) {
        frame_usuarios v = new frame_usuarios();
        v.setVisible(true);
        v.setSize(450, 300);
        v.setLocationRelativeTo(null);
    }
}
