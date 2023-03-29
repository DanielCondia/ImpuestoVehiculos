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
			//Preguntamos cual propietario se desea calcular el impuesto
			String datoEditar = JOptionPane.showInputDialog(null,"A cual propietario desea " +
					"calcular el impuesto. (Ingrese el apellido o el número de documento)");
			BaseDatos.totalImpuestos(datoEditar);
		}else if(this.interfazPrincipal.botonOrdenarNombre == e.getSource()){
			//Llamamos metodo para ordenar los datos
			BaseDatos.ordenarNombres();
		}else if(this.interfazPrincipal.botonTotalImpPagar == e.getSource()){
			//Ingresamos el propietario al que se le quiere calcular el valor total a pagar
			String propietarioCalcular = JOptionPane.showInputDialog(null, "A cual propitario " +
					"desea calcular el total a pagar? (Ingrese el apllido o el número de documento)");
			BaseDatos.confirmacionTotalPagar(propietarioCalcular);
		}else if(this.interfazPrincipal.botonBuscarVehiculo == e.getSource()){
			//Guardamos el vehiculo que el usuario quiere buscar
			String vehiculoBuscar = JOptionPane.showInputDialog(null, "Ingrese el modelo del " +
					"vehiculo que quiera buscar, o la placa");
			BaseDatos.buscarVehiculo(vehiculoBuscar);
		}else if(this.interfazPrincipal.botonBuscarPersona == e.getSource()){
			//Guardamos la persona que el usuario quiera buscar
			String personaBuscar = JOptionPane.showInputDialog(null, "Ingrese el apellido " +
					"o el número de documento de la persona");
			BaseDatos.buscarPersona(personaBuscar);
		}
	}
}
