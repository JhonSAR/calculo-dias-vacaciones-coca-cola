import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame implements ActionListener{

  private JMenuBar menubar;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, submenuColorFondo;
  private JMenuItem itemRojo, itemNegro, itemAzul, itemNuevo, itemSalir, itemVacaciones, itemCreador;
  private JLabel labelLogo, labelBienvenido, labelDatos, labelNombre, labelApellido1, labelApellido2, labelDepartamento, labelAntiguedad, labelResultado, labelPiePagina;
  private JTextField txfNombre, txfApellido1, txfApellido2;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JTextArea txaResultado;
  private JScrollPane scrollAreaResultado;
  String nombrePrincipal = "";

  public PantallaPrincipal(){

    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida pantallaBienvenida = new Bienvenida();
    nombrePrincipal = pantallaBienvenida.nombreBienvenida;

    menubar = new JMenuBar();
    menubar.setBackground(new Color(255, 0, 0));
    setJMenuBar(menubar);

    //Configuración de los menús y submenús
    menuOpciones = new JMenu("Opciones");
    menuOpciones.setFont(new Font("sans-serif moderna", 1, 14));
    menuOpciones.setForeground(new Color(255, 255, 255));
    menubar.add(menuOpciones);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setFont(new Font("sans-serif moderna", 1, 14));
    menuCalcular.setForeground(new Color(255, 255, 255));
    menubar.add(menuCalcular);

    menuAcercaDe = new JMenu("Acerca de");
    menuAcercaDe.setFont(new Font("sans-serif moderna", 1, 14));
    menuAcercaDe.setForeground(new Color(255, 255, 255));
    menubar.add(menuAcercaDe);

    submenuColorFondo = new JMenu("Color de Fondo");
    submenuColorFondo.setFont(new Font("sans-serif moderna", 1, 12));
    submenuColorFondo.setForeground(new Color(255, 0, 0));
    menuOpciones.add(submenuColorFondo);

    //Configuración de los items
    itemNuevo = new JMenuItem("Nuevo");
    itemNuevo.setFont(new Font("sans-serif moderna", 1, 12));
    itemNuevo.setForeground(new Color(255, 0, 0));
    itemNuevo.addActionListener(this);
    menuOpciones.add(itemNuevo);

    itemSalir = new JMenuItem("Salir");
    itemSalir.setFont(new Font("sans-serif moderna", 1, 12));
    itemSalir.setForeground(new Color(255, 0, 0));
    itemSalir.addActionListener(this);
    menuOpciones.add(itemSalir);

    itemVacaciones = new JMenuItem("Vacaciones");
    itemVacaciones.setFont(new Font("sans-serif moderna", 1, 12));
    itemVacaciones.setForeground(new Color(255, 0, 0));
    itemVacaciones.addActionListener(this);
    menuCalcular.add(itemVacaciones);

    itemCreador = new JMenuItem("El Creador");
    itemCreador.setFont(new Font("sans-serif moderna", 1, 12));
    itemCreador.setForeground(new Color(255, 0, 0));
    itemCreador.addActionListener(this);
    menuAcercaDe.add(itemCreador);

    itemRojo = new JMenuItem("Rojo");
    itemRojo.setFont(new Font("sans-serif moderna", 1, 12));
    itemRojo.setForeground(new Color(255, 0, 0));
    itemRojo.addActionListener(this);
    submenuColorFondo.add(itemRojo);

    itemNegro = new JMenuItem("Negro");
    itemNegro.setFont(new Font("sans-serif moderna", 1, 12));
    itemNegro.setForeground(new Color(255, 0, 0));
    itemNegro.addActionListener(this);
    submenuColorFondo.add(itemNegro);

    itemAzul = new JMenuItem("Azul");
    itemAzul.setFont(new Font("sans-serif moderna", 1, 12));
    itemAzul.setForeground(new Color(255, 0, 0));
    itemAzul.addActionListener(this);
    submenuColorFondo.add(itemAzul);

    //Logotipo de la compañía
    labelLogo = new JLabel(new ImageIcon("images/logo-coca.png"));
    labelLogo.setBounds(5, 5, 250, 100);// Validar como puedo posicionar el logo de forma correcta
    add(labelLogo);

    //etiqueta de bienvenida 
    labelBienvenido = new JLabel("Bienvenido(a) " + nombrePrincipal);
    labelBienvenido.setBounds(260, 35, 350, 30);
    labelBienvenido.setFont(new Font("sans-serif moderna", 1, 28));
    labelBienvenido.setForeground(new Color(255, 255, 255));
    add(labelBienvenido);
   
    //Etiquetas informativas, opciones y campos de texto
    labelDatos = new JLabel("Datos del trabajador para cálculo de vacaciones");
    labelDatos.setBounds(50, 150, 530, 30);
    labelDatos.setFont(new Font("sans-serif moderna", 0, 24));
    labelDatos.setForeground(new Color(255, 255, 255));
    add(labelDatos);
   
    labelNombre = new JLabel("Nombre Completo:");
    labelNombre.setBounds(20, 200, 150, 25);
    labelNombre.setFont(new Font("sans-serif moderna", 1, 12));
    labelNombre.setForeground(new Color(255, 255, 255));
    add(labelNombre);

    txfNombre = new JTextField();
    txfNombre.setBounds(20, 225, 160, 25);
    txfNombre.setFont(new Font("sans-serif moderna", 1, 14));
    txfNombre.setForeground(new Color(255, 0, 0));
    add(txfNombre);

    labelDepartamento = new JLabel("Selecciona el Departamento:");
    labelDepartamento.setBounds(235, 200, 180, 25);
    labelDepartamento.setFont(new Font("sans-serif moderna", 1, 12));
    labelDepartamento.setForeground(new Color(255, 255, 255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(235, 225, 220, 25);
    comboDepartamento.setFont(new Font("sans-serif moderna", 1, 14));
    comboDepartamento.setForeground(new Color(255, 0, 0));
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atención al Cliente");
    comboDepartamento.addItem("Departamento de Logística");
    comboDepartamento.addItem("Departamento de Gerencia");
    add(comboDepartamento);

    labelApellido1 = new JLabel("Apellido Paterno:");
    labelApellido1.setBounds(20, 260, 150, 25);
    labelApellido1.setFont(new Font("sans-serif moderna", 1, 12));
    labelApellido1.setForeground(new Color(255, 255, 255));
    add(labelApellido1);

    txfApellido1 = new JTextField();
    txfApellido1.setBounds(20, 285, 160, 25);
    txfApellido1.setFont(new Font("sans-serif moderna", 1, 14));
    txfApellido1.setForeground(new Color(255, 0, 0));
    add(txfApellido1);

    labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
    labelAntiguedad.setBounds(235, 260, 180, 25);
    labelAntiguedad.setFont(new Font("sans-serif moderna", 1, 12));
    labelAntiguedad.setForeground(new Color(255, 255, 255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(235, 285, 220, 25);
    comboAntiguedad.setFont(new Font("sans-serif moderna", 1, 14));
    comboAntiguedad.setForeground(new Color(255, 0, 0));
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 años o más de servicio");
    add(comboAntiguedad);

    labelApellido2 = new JLabel("Apellido Materno:");
    labelApellido2.setBounds(20, 320, 150, 25);
    labelApellido2.setFont(new Font("sans-serif moderna", 1, 12));
    labelApellido2.setForeground(new Color(255, 255, 255));
    add(labelApellido2);

    txfApellido2 = new JTextField();
    txfApellido2.setBounds(20, 345, 160, 25);
    txfApellido2.setFont(new Font("sans-serif moderna", 1, 14));
    txfApellido2.setForeground(new Color(255, 0, 0));
    add(txfApellido2);

    labelResultado = new JLabel("Resultado del Cálculo:");
    labelResultado.setBounds(235, 320, 180, 25);
    labelResultado.setFont(new Font("sans-serif moderna", 1, 12));
    labelResultado.setForeground(new Color(255, 255, 255));
    add(labelResultado);

    txaResultado = new JTextArea();
    txaResultado.setText("""

         Aquí aparece el resultado del cálculo de las vacaciones.
    """);
    txaResultado.setEditable(false);
    txaResultado.setFont(new Font("sans-serif moderna", 1, 11));
    txaResultado.setForeground(new Color(255, 0, 0));
    scrollAreaResultado = new JScrollPane(txaResultado);
    scrollAreaResultado.setBounds(235, 345, 380, 90);
    add(scrollAreaResultado);

    labelPiePagina = new JLabel("©2025 The Coca-Cola Company | Todos los derechos reservados");
    labelPiePagina.setBounds(140, 463, 400, 25);
    labelPiePagina.setFont(new Font("sans-serif moderna", 1, 12));
    labelPiePagina.setForeground(new Color(255, 255, 255));
    add(labelPiePagina);
    
    getContentPane().setBackground(new Color(255, 0, 0));

  }

  public void actionPerformed(ActionEvent e){

    if(e.getSource() == itemRojo){
      getContentPane().setBackground(new Color(255, 0, 0));
      menubar.setBackground(new Color(255, 0, 0));
    } else if(e.getSource() == itemNegro){
        getContentPane().setBackground(new Color(0, 0, 0));
        menubar.setBackground(new Color(0, 0, 0));
    } else if(e.getSource() == itemAzul){
        getContentPane().setBackground(new Color(26, 35, 126 ));
        menubar.setBackground(new Color(26, 35, 126 ));
    }

    if(e.getSource() == itemNuevo){
      txfNombre.setText("");
      txfApellido1.setText("");
      txfApellido2.setText("");
      comboDepartamento.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      txaResultado.setText("""

         Aquí aparece el resultado del cálculo de las vacaciones.
    """);
    }

    if(e.getSource() == itemSalir){
      Bienvenida interfazBienvenida = new Bienvenida();
      interfazBienvenida.setSize(400, 600);
      interfazBienvenida.setVisible(true);
      interfazBienvenida.setResizable(false);
      interfazBienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }

    if(e.getSource() == itemVacaciones){
      if(txfNombre.getText().isEmpty() || txfApellido1.getText().isEmpty() || comboDepartamento.getSelectedItem().toString().isEmpty() || comboAntiguedad.getSelectedItem().toString().isEmpty()){
        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos.", "Aviso", JOptionPane.WARNING_MESSAGE);
      } else{
          String departamento = comboDepartamento.getSelectedItem().toString();
          String antiguedad = comboAntiguedad.getSelectedItem().toString();

          switch(departamento){
            case "Atención al Cliente":
              if(antiguedad == "1 año de servicio"){
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 6 días de vacaciones.");
              } else if(antiguedad == "2 a 6 años de servicio"){
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 14 días de vacaciones.");
              } else{
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 20 días de vacaciones.");
              }
              break;
            case "Departamento de Logística":
              if(antiguedad == "1 año de servicio"){
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 7 días de vacaciones.");
              } else if(antiguedad == "2 a 6 años de servicio"){
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 15 días de vacaciones.");
              } else{
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 22 días de vacaciones.");
              }
              break;
            case "Departamento de Gerencia":
              if(antiguedad == "1 año de servicio"){
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 10 días de vacaciones.");
              } else if(antiguedad == "2 a 6 años de servicio"){
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 20 días de vacaciones.");
              } else{
                txaResultado.setText("\n   El trabajador " + txfNombre.getText() + " " + txfApellido1.getText() + " " + txfApellido2.getText() + 
                  "\n   quien labora en " + departamento + " con " + antiguedad + 
                  "\n   recibe 30 días de vacaciones.");
              }
              break;
          }
      }
    }
    
    if(e.getSource() == itemCreador){
      JOptionPane.showMessageDialog(null, "Desarrollado por Jhon Sebastian Ardila R.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

  }

  public static void main(String args[]){

    PantallaPrincipal principal = new PantallaPrincipal();
    principal.setSize(650, 550);
    principal.setVisible(true);
    principal.setResizable(false);
    principal.setLocationRelativeTo(null);

  }

}