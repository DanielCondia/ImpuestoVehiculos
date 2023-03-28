package co.edu.uptc.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class InterfazPrincipal extends JFrame {
	private static final JPanel panel = new JPanel(), panel2 = new JPanel();
	//Datos del propietario
	public JTextField inputPrimerNombre, inputSegundoNombre, inputApellidos, inputNumeroDoc, inputGenero;
	//Datos del vehiculo
	public JTextField inputColor, inputPlaca, inputModelo, inputValorComercial, inputImpuestos;
	public InterfazPrincipal(){
		/*
		* Damos dimensiones con el gridLayout para que el primer y segundo panel
		* queden como una tabla
		* */
		LayoutManager layout = new GridLayout(5,3,2,2);

		/*
		* Ahora con BorderLayout, cuadramos un panel a la izquierda y otro a la derecha
		* */
		LayoutManager posicion = new BorderLayout();

		//Damos dimensión de tabla al primer panel
		panel.setLayout(layout);

		//Damos dimensión de tabla al segundo panel
		panel2.setLayout(layout);

		//Agregamos las posiciones al JFrame
		setLayout(posicion);
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
		//Se agrega el segundo panel en la parte derecha del JFrame, con el metodo East
		add(panel2, BorderLayout.EAST);
		//Cuadramos la pagina para que se ajuste a las dimensiones
		pack();
		setSize(500,200);
		/*
		* Datos de la sección del propietario
		* Agregamos el titulo a la sección.
		* */
		Border bordePropietario = BorderFactory.createTitledBorder("Datos de Propietario");
		panel.setBorder(bordePropietario);

		//Texto para introducir el primer nombre
		JLabel textInputNombre = new JLabel("(*)Primer nombre:");
		panel.add(textInputNombre);

		//Espacio para que el usuario ingrese el primer nombre
		inputPrimerNombre = new JTextField();
		panel.add(inputPrimerNombre);

		//Texto para introducir el segundo nombre
		JLabel textInputSegundoNombre =  new JLabel("Segundo nombre:");
		panel.add(textInputSegundoNombre);

		//Espacio para que el usuario ingrese el segundo nombre
		inputSegundoNombre = new JTextField();
		panel.add(inputSegundoNombre);

		//Texto para introducir apellidos
		JLabel textInputApellidos = new JLabel("(*)Apellidos:");
		panel.add(textInputApellidos);

		//Espacio para ingresar apellidos
		inputApellidos = new JTextField();
		panel.add(inputApellidos);

		//Texto para ingresar número de documento
		JLabel inputNumeroDocumento = new JLabel("(*)Número Doc:");
		panel.add(inputNumeroDocumento);

		//Espacio para ingresar el número de documento
		inputNumeroDoc = new JTextField();
		panel.add(inputNumeroDoc);

		//Texto para ingresar el genero
		JLabel textGenero = new JLabel("Genero(m/f):");
		panel.add(textGenero);

		//Espacio para ingresar el genero
		inputGenero = new JTextField();
		panel.add(inputGenero);

		/*
		 * Sección de los datos del carro
		 * Agregamos titulo a la sección de los datos del carro
		 * */

		Border bordeVehiculo = BorderFactory.createTitledBorder("Datos de Vehículo");
		panel2.setBorder(bordeVehiculo);

		//Texto para ingresar Color del vehiculo
		JLabel textColor = new JLabel("Color:");
		panel2.add(textColor);

		//Espacio para ingresar el color del vehiculo
		inputColor = new JTextField();
		panel2.add(inputColor);

		//Texto para ingresar el número de placa
		JLabel textPlaca = new JLabel("(*)Número de placa:");
		panel2.add(textPlaca);

		//Espacio para ingresar la serie de la placa
		inputPlaca = new JTextField();
		panel2.add(inputPlaca);

		//Texto para ingresar modelo del vehiculo
		JLabel textModelo = new JLabel("(*)Modelo:");
		panel2.add(textModelo);

		//Espacio para ingresar el modelo del vehiculo
		inputModelo = new JTextField();
		panel2.add(inputModelo);

		//Texto para el valor comercial
		JLabel textValor = new JLabel("(*)Valor comercial:");
		panel2.add(textValor);

		//Espacio para ingresar el valor comercial
		inputValorComercial = new JTextField();
		panel2.add(inputValorComercial);

		//Texto para tarifa de impuestos
		JLabel textImpuestos = new JLabel("(*)Tarifa de impuestos:");
		panel2.add(textImpuestos);

		//Espacio para ingresar los impuestos
		inputImpuestos = new JTextField();
		panel2.add(inputImpuestos);

	}
}