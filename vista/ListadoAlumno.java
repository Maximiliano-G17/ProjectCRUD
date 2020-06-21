package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.crudBBDD;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ListadoAlumno extends JFrame {

	private JPanel contentPane;
	
	public ListadoAlumno(JComboBox comboBox) {
		//crud=new crudBBDD();
		String combo=(String)comboBox.getSelectedItem();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JLabel lblListadoDeAlumnos = new JLabel("Listado de alumnos");
		
		crudBBDD crud=crudBBDD.getCrud();
		crud.mostrarAlumno(contentPane, combo);
		
		lblListadoDeAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblListadoDeAlumnos, BorderLayout.NORTH);
	}
}
