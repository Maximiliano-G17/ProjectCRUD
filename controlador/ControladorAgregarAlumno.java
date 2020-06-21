package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import modelo.crudBBDD;

public class ControladorAgregarAlumno implements ActionListener{
	
	private JTextField nombre,apellido,dni,telefono,direccion;
	private JComboBox comboBox;
	
	public ControladorAgregarAlumno(JTextField nombre,JTextField apellido,JTextField dni,JTextField telefono,JTextField direccion,JComboBox comboBox){
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.telefono=telefono;
		this.direccion=direccion;
		this.comboBox=comboBox;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		crudBBDD crud=crudBBDD.getCrud();
		String combo=(String)comboBox.getSelectedItem();
		crud.registrarAlumno(nombre.getText(),apellido.getText(),dni.getText(),telefono.getText(),direccion.getText(),combo);
	}
}
