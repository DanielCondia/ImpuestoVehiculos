package co.edu.uptc.gui;

import javax.swing.*;
import java.awt.*;

public class InterfazPrincipal extends JFrame {
	JPanel panel = new JPanel();
	public InterfazPrincipal(){
		setVisible(true);
		setTitle("Propietarios de vehiculos");
		add(panel);
		panel.setLayout(new GridLayout (4,3,5,5) );


	}
	public static void main(String[] args) {

	}
}
