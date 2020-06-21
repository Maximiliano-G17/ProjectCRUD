package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import modelo.crudBBDD;
import vista.ActualizarAlumno;
import vista.AgregarAlumno;
import vista.EliminarAlumno;
import vista.MostrarAlumno;

public class ControladorVistaPrincipal implements ActionListener {
	
	private MostrarAlumno mostrarAlumno;
	private AgregarAlumno agregarAlumno;
	private ActualizarAlumno actualizarAlumno;
	private EliminarAlumno eliminarAlumno;
	private String categoria;
	
	public ControladorVistaPrincipal(String categoria){
		this.categoria=categoria;
	}	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(categoria.equalsIgnoreCase("MostrarAlumnos")){
			mostrarAlumno = new MostrarAlumno();
			mostrarAlumno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			mostrarAlumno.setVisible(true);
		}else if(categoria.equalsIgnoreCase("AgregarAlumno")){
			agregarAlumno=new AgregarAlumno();
			agregarAlumno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			agregarAlumno.setVisible(true);
		}else if(categoria.equalsIgnoreCase("ActualizarAlumno")){
			actualizarAlumno=new ActualizarAlumno();
			actualizarAlumno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			actualizarAlumno.setVisible(true);
		}else if(categoria.equalsIgnoreCase("EliminarAlumno")){
			eliminarAlumno=new EliminarAlumno();
			eliminarAlumno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			eliminarAlumno.setVisible(true);
		}else if(categoria.equalsIgnoreCase("Salir")){
			System.exit(0);
		}	
	}
}
