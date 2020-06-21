package modelo;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlador.ControladorTabla;

public class crudBBDD {
	
	private Connection conexion;
	private ResultSet miRs;
	private DatabaseMetaData datosBBDD;
	private PreparedStatement pStatement;
	private Statement statement;
	private JTable tabla;
	private JScrollPane JScrollPane;
	private static crudBBDD crud;
	
	private crudBBDD(){
		try{
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoescuela?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false","root","");
			datosBBDD=conexion.getMetaData();
			miRs=datosBBDD.getTables("proyectoescuela", null, null, null);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static crudBBDD getCrud(){
		if(crud==null){
			crud=new crudBBDD();
		}
		return crud;
	}

	public void registrarAlumno(String nombre,String apellido,String dni,String telefono,String direccion,String asignatura){
		if(nombre.length()<2 || apellido.length()<2 || dni.length()!=8 || telefono.length()<6 || direccion.length()<5 || asignatura.length()<5){
			JOptionPane.showMessageDialog(null, "Error, todos los campos tienen que estar llenos o cumplir con los requisitos minimos de longitud");
		}else {
			try{
				System.out.println(nombre.length());
				pStatement=conexion.prepareStatement("INSERT INTO ALUMNO (nombre,apellido,dni,telefono,direccion,asignatura) VALUES(?,?,?,?,?,?)");
	
				pStatement.setString(1, nombre);
				pStatement.setString(2, apellido);
				pStatement.setString(3, dni);
				pStatement.setString(4, telefono);
				pStatement.setString(5, direccion);
				pStatement.setString(6, asignatura);		
				pStatement.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Se ha registrado con exito!");
			}catch(SQLException e){
				System.out.println(e.getMessage());		
				JOptionPane.showMessageDialog(null, "Ha ocurrido un error al momento de registrar la persona!, todos los campos tienen que estar llenos");
			}
		}		
	}
	
	public void mostrarAlumno(JPanel contentPane,String asignatura){
		try{
			if(asignatura.equalsIgnoreCase("todos")){
				statement=conexion.createStatement();
				miRs=statement.executeQuery("SELECT * FROM ALUMNO");
			}else{
				statement=conexion.createStatement();
				miRs=statement.executeQuery("SELECT * FROM ALUMNO WHERE asignatura = '" + asignatura + "'" );
			}
			
			//crea un jtable para mostrar los datos
			tabla=new JTable(new ControladorTabla(miRs));
			JScrollPane=new JScrollPane(tabla);
			contentPane.add(JScrollPane,BorderLayout.CENTER);
			contentPane.validate();			
		}catch(SQLException e){
			System.out.println(e.getMessage());		
		}
	}
	
	public void actualizarAlumno(String nombre,String apellido,String dni,String telefono,String direccion){
		if(nombre.length()<2 || apellido.length()<2 || dni.length()!=8 || telefono.length()<6 || direccion.length()<5){//comprueba que todos los campos esten llenos
			JOptionPane.showMessageDialog(null, "Error, todos los campos tienen que estar llenos o cumplir con los requisitos minimos de longitud");
		}else if(existeDniEnBBDD(dni)){//comprueba que en la base de dato exista el dni para realizar la actualizacion
			try{
				pStatement=conexion.prepareStatement("UPDATE alumno SET nombre = ?,apellido = ?,telefono = ?,direccion = ? WHERE DNI = ?");
				pStatement.setString(1, nombre);
				pStatement.setString(2, apellido);
				pStatement.setString(3, telefono);
				pStatement.setString(4, direccion);
				pStatement.setString(5, dni);
				
				pStatement.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Se ha actualizado con exito!");
			}catch(SQLException e){
				e.printStackTrace();
			}
		}else{
			JOptionPane.showMessageDialog(null, "ERROR!! El dni " + dni + " no existe en la base de datos!");
		}
	}
	
	public void eliminarAlumno(String dni){
		if(existeDniEnBBDD(dni) && dni.length()==8){
			try{
				pStatement=conexion.prepareStatement("DELETE FROM ALUMNO WHERE DNI = ?");
				pStatement.setString(1, dni);
				pStatement.executeUpdate();
				JOptionPane.showMessageDialog(null, "Se ha eliminado con exito!");
			}catch(SQLException e){
				e.printStackTrace();
			}		
		}else{
			JOptionPane.showMessageDialog(null, "ERROR!! El dni " + dni + " no existe en la base de datos!");
		}
	}
	
	public boolean existeDniEnBBDD(String dni){
		boolean bandera = false;
		try {
			statement=conexion.createStatement();
			miRs=statement.executeQuery("SELECT DNI FROM ALUMNO WHERE DNI='" + dni + "'" );
			bandera=miRs.first();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return bandera;
	}
}
