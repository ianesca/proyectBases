/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author zSG
 */
public class frame_inicio extends JFrame {

    public frame_inicio() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GRAY);
        ventana();
        initComponents();

    }

    private void ventana() {
        super.setSize(1080, 720);
        super.setTitle("Inicio");
        this.setLocationRelativeTo(frame_inicio.this);
        this.setLayout(null);
    }

    private void initComponents() {
    }

}
