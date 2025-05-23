import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField campoNombre;
  private JButton botonIngresar;
  private JLabel labelLogotipo, labelMensaje, labelNombre, labelLeyenda;

  public static String nombreBienvenida = "";

  public Bienvenida(){

    setLayout(null);
    setTitle("Bienvenido(a)");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Logotipo de Coca Cola
    labelLogotipo = new JLabel(new ImageIcon("images/logo-coca.png"));
    labelLogotipo.setBounds(45, 50, 300, 150);
    add(labelLogotipo);

    //Mensaje de inicio de la aplicación
    labelMensaje = new JLabel("Sistema de Control Vacacional");
    labelMensaje.setBounds(45, 170, 300, 30);
    labelMensaje.setFont(new Font("sans-serif moderna", Font.BOLD, 20));
    labelMensaje.setForeground(new Color(254, 255, 255)); 
    add(labelMensaje);
   
    //Etiqueta de pie de interfaz
    labelLeyenda = new JLabel("©2025 The Coca-Cola Company.");
    labelLeyenda.setBounds(100, 520, 250, 30);
    labelLeyenda.setFont(new Font("sans-serif moderna", Font.BOLD, 12));
    labelLeyenda.setForeground(new Color(254, 255, 255)); 
    add(labelLeyenda);

    //Etiqueta donde solicita ingresar el nombre del usuario
    labelNombre = new JLabel("Ingrese su nombre:");
    labelNombre.setBounds(45, 270, 150, 30);
    labelNombre.setFont(new Font("sans-serif moderna", Font.BOLD, 14));
    labelNombre.setForeground(new Color(254, 255, 255)); 
    add(labelNombre);
 
    //Campo de texto para ingresar nombre
    campoNombre = new JTextField();
    campoNombre.setBounds(45, 300, 295, 30);
    campoNombre.setBackground(new Color(254, 255, 255));
    campoNombre.setFont(new Font("sans-serif moderna", Font.BOLD, 16));
    campoNombre.setForeground(new Color(248, 3, 1)); 
    add(campoNombre);

    //Boton para ingresar
    botonIngresar = new JButton("Ingresar");
    botonIngresar.setBounds(140, 350, 100, 30);
    botonIngresar.setBackground(new Color(254, 255, 255));
    botonIngresar.setFont(new Font("sans-serif moderna", Font.BOLD | Font.ITALIC, 14));
    botonIngresar.setForeground(new Color(248, 3, 1)); 
    botonIngresar.addActionListener(this);
    add(botonIngresar);

    getContentPane().setBackground(new Color(248, 3, 1));


  }

  public void actionPerformed(ActionEvent e){

    if(campoNombre.getText().isEmpty()){
      JOptionPane.showMessageDialog(null, "Debe ingresar su nombre", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    } else if(campoNombre.getText().matches("^[a-zA-Z ]+$") == false){
        JOptionPane.showMessageDialog(null, "Solo se permite letras", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        campoNombre.setText("");
    } else{
        nombreBienvenida = campoNombre.getText().trim();
        LicenciaDeUso licencia = new LicenciaDeUso();
        licencia.setSize(700, 410);
        licencia.setLocationRelativeTo(null);
        licencia.setResizable(false);
        licencia.setVisible(true);
        this.setVisible(false);
    }

  }

  public static void main(String args[]){

    Bienvenida interfazBienvenida = new Bienvenida();
    interfazBienvenida.setSize(400, 600);
    interfazBienvenida.setVisible(true);
    interfazBienvenida.setResizable(false);
    interfazBienvenida.setLocationRelativeTo(null);

  }

}