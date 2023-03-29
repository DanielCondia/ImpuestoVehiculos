package co.edu.uptc.negocio;

import co.edu.uptc.gui.InterfazPrincipal;

public class Propietario extends InterfazPrincipal {
	public String primerNombre, segundoNombre, apellido, genero;
	public long numeroDocumento;
	public Vehiculo vehiculo;
	public Propietario(){
		this.primerNombre = inputPrimerNombre.getText();
		this.segundoNombre = inputSegundoNombre.getText();
		this.apellido = inputApellidos.getText();
		this.genero = inputGenero.getText();
		this.numeroDocumento = Long.parseLong(inputNumeroDoc.getText());
	}
	@Override
	public String toString() {
		return "Propietario{" +
				"primerNombre='" + primerNombre + '\'' +
				", segundoNombre='" + segundoNombre + '\'' +
				", apellido='" + apellido + '\'' +
				", genero='" + genero + '\'' +
				", numeroDocumento=" + numeroDocumento +
				", vehiculo=" + vehiculo.toString() +
				'}';
	}
}