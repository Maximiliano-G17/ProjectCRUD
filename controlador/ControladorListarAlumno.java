package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import vista.ListadoAlumno;

public class ControladorListarAlumno implements ActionListener{
	
	private ListadoAlumno laminaDelListado;
	private JComboBox comboBox;
	
	public ControladorListarAlumno(JComboBox comboBox){
		this.comboBox=comboBox;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		laminaDelListado=new ListadoAlumno(comboBox);
		laminaDelListado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		laminaDelListado.setVisible(true);
	}
}
