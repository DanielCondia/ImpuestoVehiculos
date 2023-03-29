package co.edu.uptc.datos;

import co.edu.uptc.negocio.Propietario;
import co.edu.uptc.negocio.Vehiculo;

import javax.swing.*;
import java.util.LinkedList;

public class BaseDatos {
	private static final LinkedList<Propietario> listaPropietarios = new LinkedList<>();
	private static final LinkedList<Vehiculo> listaVehiculos = new LinkedList<>();
	public static void guardarDatos(Propietario propietario, Vehiculo vehiculo){
		System.out.println("Entro a guardar los datos del propietario");
		listaPropietarios.add(propietario);
		listaVehiculos.add(vehiculo);
		JOptionPane.showMessageDialog(null, "Los datos se han guardado " +
				"correctamente");
	}
	public static void confirmacion(String datoEditar){
		int posicion = 0;
		for (int i = 0; i < listaPropietarios.size(); i++) {
			if(listaPropietarios.get(i).apellido.equals(datoEditar) || listaPropietarios.get(i).numeroDocumento.equals(datoEditar)){
				int respuesta = JOptionPane.showConfirmDialog(null, "El propietario es:" + listaPropietarios.get(i));
				if(respuesta == JOptionPane.YES_NO_OPTION){
					posicion = i;
					JOptionPane.showMessageDialog(null,"El usuario es= \n" + listaPropietarios.get(i) +
						"\n"	+ listaVehiculos.get(i));
					break;
				}else{
					JOptionPane.showMessageDialog(null, "Si no es el usuario que busca" +
							"favor primero registralo");
				}
			}
		}
		JOptionPane.showMessageDialog(null, "El total de los impuestos es= " +
				listaVehiculos.get(posicion).totalImpuestos() + " y el valor total es= " +
				listaVehiculos.get(posicion).totalValor());
	}
}