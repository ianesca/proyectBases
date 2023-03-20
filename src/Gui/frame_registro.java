/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author zSG
 */
public class frame_registro extends JFrame {

    public frame_registro() {
        ventana();
        initComponents();

    }

    private void ventana() {
        super.setSize(600, 380);
        super.setTitle("Registro");
        this.setLocationRelativeTo(frame_registro.this);
        this.setLayout(null);
    }

    JLabel jLabel1 = new javax.swing.JLabel();
    JTextField jTextField1 = new javax.swing.JTextField();
    JLabel jLabel2 = new javax.swing.JLabel();
    JTextField jTextField2 = new javax.swing.JTextField();
    JLabel jLabel3 = new javax.swing.JLabel();
    JTextField jTextField4 = new javax.swing.JTextField();
    JLabel jLabel4 = new javax.swing.JLabel();
    JPasswordField jPasswordField1 = new javax.swing.JPasswordField();
    JLabel jLabel5 = new javax.swing.JLabel();
    JTextField jTextField5 = new javax.swing.JTextField();
    JButton jButton1 = new javax.swing.JButton();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GRAY);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 56, 60, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(164, 52, 200, 30);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(23, 92, 80, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(164, 88, 200, 30);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(23, 140, 70, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(164, 136, 200, 30);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(23, 176, 100, 22);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(164, 172, 200, 30);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(23, 245, 80, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(164, 241, 200, 30);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registar");
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 150, 123, 44);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_usuarios v = new frame_usuarios();
                v.setVisible(true);
                v.setSize(450, 300);
                v.setLocationRelativeTo(null);
                setVisible(false);
            }
        });
    }

}
