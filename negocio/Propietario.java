package co.edu.uptc.negocio;

import co.edu.uptc.gui.InterfazPrincipal;

public class Propietario implements Comparable<Propietario> {
	public String primerNombre, segundoNombre, apellido, genero, numeroDocumento;
	public Propietario(InterfazPrincipal interfazPrincipal){
		this.primerNombre = interfazPrincipal.inputPrimerNombre.getText();
		this.segundoNombre = interfazPrincipal.inputSegundoNombre.getText();
		this.apellido = interfazPrincipal.inputApellidos.getText();
		this.genero = interfazPrincipal.inputGenero.getText();
		this.numeroDocumento = interfazPrincipal.inputNumeroDoc.getText();
	}
	@Override
	public String toString() {
		return "Propietario{" +
				"primerNombre='" + primerNombre + '\'' +
				", segundoNombre='" + segundoNombre + '\'' +
				", apellido='" + apellido + '\'' +
				", genero='" + genero + '\'' +
				", numeroDocumento=" + numeroDocumento +
				'}';
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	@Override
	public int compareTo(Propietario p){
		return this.primerNombre.compareTo(p.getPrimerNombre());
	}
}