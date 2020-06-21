package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorActualizarAlumno;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class ActualizarAlumno extends JFrame {

	private JPanel contentPane;
	private JTextField textoNombre,textoApellido,textoDni,textoTelefono,textoDireccion;
	private JButton botonActualizar;
	
	public ActualizarAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel datosPersonales = new JLabel("Datos Personales");
		datosPersonales.setFont(new Font("Tahoma", Font.BOLD, 14));
		datosPersonales.setHorizontalAlignment(SwingConstants.CENTER);
		datosPersonales.setBounds(118, 11, 163, 20);
		contentPane.add(datosPersonales);
		
		textoDni = new JTextField();
		textoDni.setBounds(311, 90, 86, 20);
		contentPane.add(textoDni);
		textoDni.setColumns(10);
		
		JLabel dni = new JLabel("DNI:");
		dni.setBounds(14, 93, 94, 14);
		contentPane.add(dni);
		
		textoNombre = new JTextField();
		textoNombre.setBounds(311, 170, 86, 20);
		contentPane.add(textoNombre);
		textoNombre.setColumns(10);
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setBounds(14, 173, 94, 14);
		contentPane.add(nombre);
		
		textoApellido = new JTextField();
		textoApellido.setBounds(311, 201, 86, 20);
		contentPane.add(textoApellido);
		textoApellido.setColumns(10);
		
		JLabel apellido = new JLabel("Apellido:");
		apellido.setBounds(14, 204, 94, 14);
		contentPane.add(apellido);
		
		textoTelefono = new JTextField();
		textoTelefono.setBounds(311, 232, 86, 20);
		contentPane.add(textoTelefono);
		textoTelefono.setColumns(10);
		
		JLabel telefono = new JLabel("Telefono:");
		telefono.setBounds(14, 235, 94, 14);
		contentPane.add(telefono);
		
		textoDireccion = new JTextField();
		textoDireccion.setBounds(311, 260, 86, 20);
		contentPane.add(textoDireccion);
		textoDireccion.setColumns(10);
		
		JLabel direccion = new JLabel("Direccion:");
		direccion.setBounds(14, 263, 94, 14);
		contentPane.add(direccion);
		
		botonActualizar = new JButton("Actualizar");
		botonActualizar.addActionListener(new ControladorActualizarAlumno(textoNombre,textoApellido,textoDni,textoTelefono,textoDireccion));
		botonActualizar.setBounds(153, 329, 128, 23);
		contentPane.add(botonActualizar);
		
		JLabel lblDatosHa = new JLabel("Datos para actualizar");
		lblDatosHa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosHa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDatosHa.setBounds(129, 130, 128, 14);
		contentPane.add(lblDatosHa);
		
		JLabel lblDatoClave = new JLabel("Dato clave");
		lblDatoClave.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatoClave.setBounds(118, 57, 129, 14);
		contentPane.add(lblDatoClave);
	}
}
