package co.edu.uptc.negocio;

import co.edu.uptc.datos.BaseDatos;
import co.edu.uptc.gui.InterfazPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos implements ActionListener {
	private final InterfazPrincipal interfazPrincipal;
	public Eventos(InterfazPrincipal interfazPrincipal) {
		this.interfazPrincipal = interfazPrincipal;
	}

	public void actionPerformed(ActionEvent e){
		if(this.interfazPrincipal.botonGuardar == e.getSource()){
			//Recolectamos los datos del vehiculo
			Vehiculo vehiculo = new Vehiculo(interfazPrincipal);
			//Recolectamos los datos del propietario
			Propietario propietario = new Propietario(interfazPrincipal);
			//Guardamos los datos
			BaseDatos.guardarDatos(propietario, vehiculo);
			//Vaciamos los campos llenos del formulario cuando se de click en guardar
			interfazPrincipal.inputPrimerNombre.setText(""); interfazPrincipal.inputSegundoNombre.setText("");
			interfazPrincipal.inputApellidos.setText(""); interfazPrincipal.inputNumeroDoc.setText("");
			interfazPrincipal.inputGenero.setText(""); interfazPrincipal.inputColor.setText("");
			interfazPrincipal.inputPlaca.setText(""); interfazPrincipal.inputModelo.setText("");
			interfazPrincipal.inputValorComercial.setText(""); interfazPrincipal.inputImpuestos.setText("");
		}else if(this.interfazPrincipal.botonCalcularImpuestos == e.getSource()){
			//Preguntamos el impuesto que desea calcular
			String datoEditar = JOptionPane.showInputDialog(null,"A cual propietario desea " +
					"calcular el impuesto. (Ingrese el apellido o el número de documento)");
			BaseDatos.confirmacion(datoEditar);
		}else if(this.interfazPrincipal.botonOrdenarNombre == e.getSource()){
			//Llamamos metodo para ordenar los datos
			BaseDatos.ordenarNombres();
		}else if(this.interfazPrincipal.botonTotalImpPagar == e.getSource()){
			System.out.println("Entro a total impuestos a pagar");
		}else if(this.interfazPrincipal.botonBuscarVehiculo == e.getSource()){
			System.out.println("Entro a buscar vehiculo");
		}else if(this.interfazPrincipal.botonBuscarPersona == e.getSource()){
			System.out.println("Entro a buscar persona");
		}
	}
}
