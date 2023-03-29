package co.edu.uptc.datos;

import co.edu.uptc.negocio.Propietario;
import co.edu.uptc.negocio.Vehiculo;

import javax.swing.*;
import java.util.Collections;
import java.util.LinkedList;
public class BaseDatos {
	private static int posicion = -1;
	private static final LinkedList<Propietario> listaPropietarios = new LinkedList<>();
	private static final LinkedList<Vehiculo> listaVehiculos = new LinkedList<>();
	public static void guardarDatos(Propietario propietario, Vehiculo vehiculo){
		listaPropietarios.add(propietario);
		listaVehiculos.add(vehiculo);
		JOptionPane.showMessageDialog(null, "Los datos se han guardado " +
				"correctamente");
	}
	public static void totalImpuestos(String datoEditar){
		confirmacion(datoEditar);
		System.out.println(posicion);
		if(posicion > -1){
			JOptionPane.showMessageDialog(null, "El total de los impuestos es= " +
					listaVehiculos.get(posicion).totalImpuestos());
		}
	}
	public static void ordenarNombres(){
		Collections.sort(listaPropietarios);
		StringBuilder nombresOrdenados = new StringBuilder();
		for (Propietario listaPropietario : listaPropietarios) {
			nombresOrdenados.append("\n ").append(listaPropietario);
		}
		JOptionPane.showMessageDialog(null, "La lista ordenada es: " +
				nombresOrdenados);
	}
	public static void confirmacionTotalPagar(String datoPropietario){
		confirmacion(datoPropietario);
		if(posicion > -1){
			JOptionPane.showMessageDialog(null, "El total a pagar es= "+
					listaVehiculos.get(posicion).totalValor());
		}
	}
	public static void confirmacion(String datoEditar){
		for (int i = 0; i < listaPropietarios.size(); i++) {
			if(listaPropietarios.get(i).apellido.equals(datoEditar) || listaPropietarios.get(i).numeroDocumento.equals(datoEditar)){
				int respuesta = JOptionPane.showConfirmDialog(null, "El propietario es:" + listaPropietarios.get(i));
				if(respuesta == JOptionPane.YES_NO_OPTION){
					posicion = i;
					return;
				}else{
					JOptionPane.showMessageDialog(null, "Si no es el usuario que busca " +
							"favor primero registralo");
					break;
				}
			}
		}
	}
}