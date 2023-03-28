package co.edu.uptc.negocio;

import co.edu.uptc.gui.InterfazPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos implements ActionListener {
	private final InterfazPrincipal interfazPrincipal;

	public Eventos(InterfazPrincipal interfazPrincipal) {
		this.interfazPrincipal = interfazPrincipal;
	}

	public void actionPerformed(ActionEvent e){
		if(this.interfazPrincipal.botonGuardar == e.getSource()){
			System.out.println("Entro al metodo del botón guardar");
		}
	}
}
