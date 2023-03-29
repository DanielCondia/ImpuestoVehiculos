package co.edu.uptc.negocio;

import co.edu.uptc.gui.InterfazPrincipal;

public class Vehiculo extends InterfazPrincipal {
	public String color, placa, modelo;
	public long valorComercial, impuestos;
	public Vehiculo(){
		this.color = inputColor.getText();
		this.placa = inputPlaca.getText();
		this.modelo = inputModelo.getText();
		this.valorComercial = Long.parseLong(inputValorComercial.getText());
		this.impuestos = Long.parseLong(inputImpuestos.getText());
	}
	@Override
	public String toString() {
		return "Vehiculo{" +
				"color='" + color + '\'' +
				", placa='" + placa + '\'' +
				", modelo='" + modelo + '\'' +
				", TotalImpuestos=" + totalImpuestos() +
				", ValorTotal=" + totalValor() +
				'}';
	}
	public long totalImpuestos(){
		return valorComercial * impuestos / 100;
	}
	public long totalValor(){
		return valorComercial + totalImpuestos();
	}
}