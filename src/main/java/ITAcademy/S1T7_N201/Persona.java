package ITAcademy.S1T7_N201;

@RutaAnotacion
public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private String direccion;
	
	public Persona(String nombre, String apellidos, int edad, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
