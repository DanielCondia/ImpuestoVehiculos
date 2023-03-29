package co.edu.uptc.negocio;

import co.edu.uptc.gui.InterfazPrincipal;

public class Vehiculo {
	public String color, placa, modelo, valorComercial, impuestos;
	public Vehiculo(InterfazPrincipal interfazPrincipal){
		this.color = interfazPrincipal.inputColor.getText();
		this.placa = interfazPrincipal.inputPlaca.getText();
		this.modelo = interfazPrincipal.inputModelo.getText();
		this.valorComercial = interfazPrincipal.inputValorComercial.getText();
		this.impuestos = interfazPrincipal.inputImpuestos.getText();
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
		return Long.parseLong(valorComercial) * Long.parseLong(impuestos) / 100;
	}
	public long totalValor(){
		return Long.parseLong(valorComercial) + totalImpuestos();
	}
}