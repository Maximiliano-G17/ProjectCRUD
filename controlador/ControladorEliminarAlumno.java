package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import modelo.crudBBDD;

public class ControladorEliminarAlumno implements ActionListener{
	
	private JTextField dni;
	
	public ControladorEliminarAlumno(JTextField dni){
		this.dni=dni;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		crudBBDD crud=crudBBDD.getCrud();
		crud.eliminarAlumno(dni.getText());	
	}
}
