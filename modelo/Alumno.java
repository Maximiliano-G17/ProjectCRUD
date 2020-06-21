package modelo;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private String direccion;
	private String asignatura;
	
	public Alumno(String nombre,String apellido,String dni,String telefono,String direccion,String asignatura){
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.telefono=telefono;
		this.direccion=direccion;
		this.asignatura=asignatura;
	}
	public Alumno(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
}
