package vista;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorAgregarAlumno;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;

public class AgregarAlumno extends JFrame {

	private JPanel contentPane;
	private JTextField textoNombre,textoApellido,textoDni,textoTelefono,textoDireccion;
	private JButton botonGuardar;
	private JComboBox comboBox;
	private String asignaturaComboBox;
	
	public AgregarAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel datosPersonales = new JLabel("Datos Personales");
		datosPersonales.setFont(new Font("Tahoma", Font.BOLD, 14));
		datosPersonales.setHorizontalAlignment(SwingConstants.CENTER);
		datosPersonales.setBounds(118, 11, 163, 20);
		contentPane.add(datosPersonales);
		
		textoNombre = new JTextField();
		textoNombre.setBounds(311, 65, 86, 20);
		contentPane.add(textoNombre);
		textoNombre.setColumns(10);
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setBounds(14, 68, 94, 14);
		contentPane.add(nombre);
		
		textoApellido = new JTextField();
		textoApellido.setBounds(311, 95, 86, 20);
		contentPane.add(textoApellido);
		textoApellido.setColumns(10);
		
		JLabel apellido = new JLabel("Apellido:");
		apellido.setBounds(14, 98, 94, 14);
		contentPane.add(apellido);
		
		textoDni = new JTextField();
		textoDni.setBounds(311, 125, 86, 20);
		contentPane.add(textoDni);
		textoDni.setColumns(10);
		
		JLabel dni = new JLabel("DNI:");
		dni.setBounds(14, 128, 46, 14);
		contentPane.add(dni);
		
		textoTelefono = new JTextField();
		textoTelefono.setBounds(311, 155, 86, 20);
		contentPane.add(textoTelefono);
		textoTelefono.setColumns(10);
		
		JLabel telefono = new JLabel("Telefono:");
		telefono.setBounds(14, 158, 80, 14);
		contentPane.add(telefono);
		
		textoDireccion = new JTextField();
		textoDireccion.setBounds(311, 185, 86, 20);
		contentPane.add(textoDireccion);
		textoDireccion.setColumns(10);
		
		JLabel direccion = new JLabel("Direccion:");
		direccion.setBounds(14, 188, 94, 14);
		contentPane.add(direccion);
		
		JLabel asignatura = new JLabel("Asignatura:");
		asignatura.setBounds(14, 218, 94, 14);
		contentPane.add(asignatura);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Computacion", "Ingles", "Matematica","Cocina"}));
		comboBox.setBounds(303, 215, 94, 20);
		contentPane.add(comboBox);
		
		botonGuardar = new JButton("Guardar");
		botonGuardar.addActionListener(new ControladorAgregarAlumno(textoNombre,textoApellido,textoDni,textoTelefono,textoDireccion,comboBox));
		botonGuardar.setBounds(166, 295, 89, 23);
		contentPane.add(botonGuardar);
	}
}
