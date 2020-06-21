package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorListarAlumno;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class MostrarAlumno extends JFrame {

	private JPanel contentPane;
	
	public MostrarAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JLabel lblAsignatura = new JLabel("Asignatura:");
		lblAsignatura.setBounds(25, 34, 75, 17);
		contentPane.add(lblAsignatura);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Todos","Computacion", "Ingles", "Matematica","Cocina"}));
		comboBox.setBounds(110, 31, 107, 20);
		contentPane.add(comboBox);
		
		JButton botonMostrar = new JButton("Mostrar");
		botonMostrar.addActionListener(new ControladorListarAlumno(comboBox));
		botonMostrar.setBounds(25, 130, 89, 23);
		contentPane.add(botonMostrar);
	}
}
