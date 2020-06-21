package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorEliminarAlumno;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EliminarAlumno extends JFrame {

	private JPanel contentPane;
	private JTextField textoDNI;
		
	public EliminarAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Eliminar alumno");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(123, 11, 185, 32);
		contentPane.add(titulo);
		
		JLabel dni = new JLabel("DNI:");
		dni.setBounds(10, 72, 46, 14);
		contentPane.add(dni);
		
		textoDNI = new JTextField();
		textoDNI.setBounds(52, 69, 86, 20);
		contentPane.add(textoDNI);
		textoDNI.setColumns(10);
		
		JButton botonEliminar = new JButton("Eliminar");
		botonEliminar.addActionListener(new ControladorEliminarAlumno(textoDNI));
		botonEliminar.setBounds(172, 210, 89, 23);
		contentPane.add(botonEliminar);
	}
}
