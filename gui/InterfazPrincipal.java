package co.edu.uptc.gui;

import javax.swing.*;
import java.awt.*;

public class InterfazPrincipal extends JFrame {
	JPanel panel = new JPanel();
	public InterfazPrincipal(){
		setLocationRelativeTo(null);
		setBounds(200,100,1000,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Propietarios de vehiculos");
		add(panel);
		panel.setLayout(new GridLayout(4,3,5,5) );


	}
}
