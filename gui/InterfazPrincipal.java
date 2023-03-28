package co.edu.uptc.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class InterfazPrincipal extends JFrame {
	private static final JPanel panel = new JPanel(), panel2 = new JPanel();
	public JTextField inputPrimerNombre, inputSegundoNombre, inputApellidos, inputNumeroDoc;
	public InterfazPrincipal(){
		//Colocamos el metodo borderLayout al JFrame
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		/*
		* Hacemos que la pagina se centre
		* Le damos dimensiones a la pagina
		* Agregamos que se cierre cuando se le de a la x
		* */
		setLocationRelativeTo(null);
		setBounds(200,100,1000,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Le damos titulo a la interfaz
		setTitle("Propietarios de vehiculos");
		/*
		* Se agrega el primer panel en la parte izquierda del JFrame, con el metodo West
		* Gracias al BorderLayout antes creado
		* */
		add(panel, BorderLayout.WEST);

		//Titulo de la sección de datos del propietario
		JLabel label = new JLabel("Datos del propietario");
		label.setBounds(10,10,200,20);
		panel.add(label);

		//Texto para introducir el primer nombre
		JLabel textInputNombre = new JLabel("(*)Primer nombre:");
		textInputNombre.setBounds(12,50,140,20);
		panel.add(textInputNombre);

		//Espacio para que el usuario ingrese el primer nombre
		inputPrimerNombre = new JTextField();
		inputPrimerNombre.setBounds(120,50,150,20);
		panel.add(inputPrimerNombre);

		//Texto para introducir el segundo nombre
		JLabel textInputSegundoNombre =  new JLabel("Segundo nombre:");
		textInputSegundoNombre.setBounds(12,100,100,20);
		panel.add(textInputSegundoNombre);

		//Espacio para que el usuario ingrese el segundo nombre
		inputSegundoNombre = new JTextField();
		inputSegundoNombre.setBounds(120,100,150,20);
		panel.add(inputSegundoNombre);

		//Texto para introducir apellidos
		JLabel textInputApellidos = new JLabel("(*)Apellidos:");
		textInputApellidos.setBounds(12,160,100,20);
		panel.add(textInputApellidos);

		//Espacio para ingresar apellidos
		inputApellidos = new JTextField();
		inputApellidos.setBounds(120,160,150,20);
		panel.add(inputApellidos);

		//Texto para ingresar número de documento
		JLabel inputNumeroDocumento = new JLabel("(*)Número Doc:");
		inputNumeroDocumento.setBounds(12,220,140,20);
		panel.add(inputNumeroDocumento);

		//Espacio para ingresar el número de documento
		inputNumeroDoc = new JTextField();
		inputNumeroDoc.setBounds(120,220,150,20);
		panel.add(inputNumeroDoc);
	}
}
