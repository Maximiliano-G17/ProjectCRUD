package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import modelo.crudBBDD;

public class ControladorActualizarAlumno implements ActionListener{
	
	private JTextField dni,nombre,apellido,telefono,direccion;
	
	public ControladorActualizarAlumno(JTextField nombre,JTextField apellido,JTextField dni,JTextField telefono,JTextField direccion){
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.telefono=telefono;
		this.direccion=direccion;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		crudBBDD crud=crudBBDD.getCrud();
		crud.actualizarAlumno(nombre.getText(), apellido.getText(), dni.getText(), telefono.getText(), direccion.getText());
	}
}
