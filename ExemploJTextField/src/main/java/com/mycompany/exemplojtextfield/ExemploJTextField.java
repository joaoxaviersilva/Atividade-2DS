/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplojtextfield;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Admin
 */
public class ExemploJTextField extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    JTextField texto1,texto2,texto3,texto4;
    
    public ExemploJTextField(){
        super("Exemplo com JTextField");
        
        Container tela = getContentPane();
        
        setLayout(null);
        
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");
           
         texto1 = new JTextField(50);
         texto2 = new JTextField(3);
         texto3 = new JTextField(10);
         texto4 = new JTextField(10);
         
         rotulo1.setBounds(50,20,80,20);
         rotulo2.setBounds(50,60,80,20);
         rotulo3.setBounds(50,100,80,20);
         rotulo4.setBounds(50,140,80,20);
         
         texto1.setBounds(110,20,200,20);
         texto2.setBounds(110,60,20,20);
         texto3.setBounds(110,100,80,20);
         texto4.setBounds(110,140,80,20);
         
         rotulo1.setForeground(Color.red);
         rotulo2.setForeground(Color.blue);
         rotulo3.setForeground(new Color(190,152,142));
         rotulo4.setForeground(new Color(201,200,100));
         
         rotulo1.setFont(new Font("Arial", Font.BOLD,16));
         rotulo2.setFont(new Font("Comic Sans MS", Font.BOLD,18));
         rotulo3.setFont(new Font("Courier New", Font.BOLD,18));
         rotulo4.setFont(new Font("Times New Roman", Font.BOLD,20));
         
         tela.add(rotulo1);
         tela.add(rotulo2);
         tela.add(rotulo3);
         tela.add(rotulo4);
         tela.add(texto1);
         tela.add(texto2);
         tela.add(texto3);
         tela.add(texto4);
        
         
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
