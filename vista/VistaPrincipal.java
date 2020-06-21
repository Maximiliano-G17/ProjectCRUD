package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorVistaPrincipal;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		VistaPrincipal vista = new VistaPrincipal();
		vista.setVisible(true);
	}
	
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 320);
		setTitle("Administrador de alumnos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton botonMostrarAlumnos = new JButton("Mostrar Alumnos");
		botonMostrarAlumnos.addActionListener(new ControladorVistaPrincipal("MostrarAlumnos"));
		botonMostrarAlumnos.setBounds(52, 54, 151, 78);
		contentPane.add(botonMostrarAlumnos);
		
		JButton botonCrearAlumno = new JButton("Agregar Alumno");
		botonCrearAlumno.addActionListener(new ControladorVistaPrincipal("AgregarAlumno"));
		botonCrearAlumno.setBounds(226, 54, 151, 78);
		contentPane.add(botonCrearAlumno);
		
		JButton botonActualizarAlumno = new JButton("Actualizar Alumno");
		botonActualizarAlumno.addActionListener(new ControladorVistaPrincipal("ActualizarAlumno"));
		botonActualizarAlumno.setBounds(52, 156, 151, 78);
		contentPane.add(botonActualizarAlumno);
		
		JButton botonEliminarAlumno = new JButton("Eliminar Alumno");
		botonEliminarAlumno.addActionListener(new ControladorVistaPrincipal("EliminarAlumno"));
		botonEliminarAlumno.setBounds(226, 156, 151, 78);
		contentPane.add(botonEliminarAlumno);
		
		JButton botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ControladorVistaPrincipal("Salir"));
		botonSalir.setBounds(360, 247, 72, 23);
		contentPane.add(botonSalir);
		
		JLabel titulo = new JLabel("Administrador de alumnos");
		titulo.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 26));
		titulo.setEnabled(false);
		titulo.setVerticalAlignment(SwingConstants.TOP);
		titulo.setBounds(97, 11, 287, 32);
		contentPane.add(titulo);
	}
}
