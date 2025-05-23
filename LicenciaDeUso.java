import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class LicenciaDeUso extends JFrame implements ActionListener, ChangeListener{

  private JLabel labelEncabezado, labelLogotipo;
  private JTextArea textoCondiciones;
  private JScrollPane scrollCondiciones;
  private JCheckBox checkAcepto;
  private JButton botonContinuar, botonNoAcepto;
  String nombreLicencia = "";

  public LicenciaDeUso(){

    setLayout(null);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida pantallaBienvenida = new Bienvenida();
    nombreLicencia = pantallaBienvenida.nombreBienvenida;
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Encabezado de ventana "Términos y Condicinones"
    labelEncabezado = new JLabel("TÉRMINOS Y CONDICIONES");
    labelEncabezado.setBounds(200, 15, 300, 30);
    labelEncabezado.setFont(new Font("sans-serif moderna", Font.BOLD, 20));
    add(labelEncabezado);

    //Logotipo de coca cola
    labelLogotipo = new JLabel(new ImageIcon("images/coca-cola.png"));
    labelLogotipo.setBounds(395, 250, 300, 150);
    add(labelLogotipo);

    //Contenido del área de texto con los términos y condiciones
    textoCondiciones = new JTextArea();
    textoCondiciones.setText("""

          TÉRMINOS Y CONDICIONES

          A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DEL PROYECTO PRÁCTICO COCA-COLA.
          B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO O DISEÑO DE ESTA DEMOSTRACIÓN.
          C.  EL PROYECTO PRÁCTICO COCA-COLA NO SE HACE RESPONSABLE DEL MAL USO DE ESTA APLICACIÓN.

          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTA APLICACIÓN
          (EL PROYECTO PRÁCTICO COCA-COLA Y EL DESARROLLADOR), NO SE RESPONSABILIZAN DEL USO QUE USTED
          HAGA CON ESTA APLICACIÓN Y SUS FUNCIONALIDADES. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (ACEPTO).
          SI USTED NO ACEPTA ESTOS TÉRMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTA APLICACIÓN.

          PARA MÁS INFORMACIÓN SOBRE PROYECTOS DE PRÁCTICA, POR FAVOR VISITE
          https://www.coca-cola.com/es/es
          """);
    textoCondiciones.setEditable(false);
    textoCondiciones.setFont(new Font("sans-serif moderna", Font.PLAIN, 10));
    scrollCondiciones = new JScrollPane(textoCondiciones);
    scrollCondiciones.setBounds(15, 60, 650, 220);
    scrollCondiciones.setBackground(Color.WHITE);
    add(scrollCondiciones);

    checkAcepto = new JCheckBox("Yo " + nombreLicencia + " Acepto");
    checkAcepto.setBounds(15, 290, 250, 30);
    checkAcepto.setFont(new Font("sans-serif moderna", 1, 12));
    checkAcepto.addChangeListener(this);
    add(checkAcepto);    

    botonContinuar = new JButton("Continuar");
    botonContinuar.setBounds(15, 330, 100, 30);
    botonContinuar.setFont(new Font("sans-serif moderna", 1, 12));
    botonContinuar.setEnabled(false);
    botonContinuar.addActionListener(this);
    add(botonContinuar);

    botonNoAcepto = new JButton("No Acepto");
    botonNoAcepto.setBounds(125, 330, 100, 30);
    botonNoAcepto.setFont(new Font("sans-serif moderna", 1, 12));
    botonNoAcepto.setEnabled(true);
    botonNoAcepto.addActionListener(this);
    add(botonNoAcepto);

  }

  public void stateChanged(ChangeEvent e){
    if(checkAcepto.isSelected() == true){
      botonContinuar.setEnabled(true);
      botonNoAcepto.setEnabled(false);
    } else{
        botonContinuar.setEnabled(false);
        botonNoAcepto.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == botonContinuar){
      PantallaPrincipal principal = new PantallaPrincipal();
      principal.setSize(650, 550);
      principal.setVisible(true);
      principal.setResizable(false);
      principal.setLocationRelativeTo(null);
      this.setVisible(false);
    } else if(e.getSource() == botonNoAcepto){
        Bienvenida interfazBienvenida = new Bienvenida();
        interfazBienvenida.setSize(400, 600);
        interfazBienvenida.setVisible(true);
        interfazBienvenida.setResizable(false);
        interfazBienvenida.setLocationRelativeTo(null);
        this.setVisible(false);
    }

  }

  public static void main(String args[]){

    LicenciaDeUso licencia = new LicenciaDeUso();
    licencia.setSize(700, 410);
    licencia.setLocationRelativeTo(null);
    licencia.setResizable(false);
    licencia.setVisible(true);

  }

}