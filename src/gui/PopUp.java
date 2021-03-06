

package gui;

import paquete.Jugador;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;


public class PopUp extends JFrame implements ActionListener, ItemListener {
    private JTextField textfield1;
    private JButton boton1;
    private JButton boton2;
    private JComboBox combo1;
    private JLabel label2;

    public PopUp() {
        setBounds(0, 0, 300, 170);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label1 = new JLabel("Nombre:");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        textfield1 = new JTextField("");
        textfield1.setBounds(120, 10, 150, 20);
        add(textfield1);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 50, 100, 30);
        add(boton1);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        try {
            this.setIconImage(ImageIO.read(new File("img/icon.png")));
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        boton1.addActionListener(this);
    }

    public PopUp(boolean b) {

        setBounds(0, 0, 300, 170);
        setLocationRelativeTo(null);
        setLayout(null);

        combo1 = new JComboBox();
        combo1.setBounds(10, 10, 80, 20);
        add(combo1);


        combo1.addItem("Easy");
        combo1.addItem("Normal");
        combo1.addItem("Hard");
        combo1.setSelectedItem("Normal");
        combo1.addItemListener(this);

        boton2=new JButton("Aceptar");
        boton2.setBounds(10,80,100,30);
        add(boton2);
        boton2.addActionListener(this);
    }

    public static void main(String args[]){
        PopUp p=new PopUp();
        p.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            Game.Player.setName (textfield1.getText());

            if(Game.isRecord ()){
                Game.setRecord ();
                Game.isInRecord=true;}
            Game.Player=new Jugador ();
            Menu.SetShowRankings (true);
            setVisible(false);
            textfield1.setText ("");

        }
        else if (e.getSource()==boton2) {
            Game.option =(String)combo1.getSelectedItem();
            Menu.setShowOptions();
            setVisible(false);

        }

    }

}