package inventario_datos;

public class Usuario{
	
private int id;
private String nombre;
private String apellido;
private String nombreUsuario;
private String rol;
private String contrasena;


public Usuario() {}

public Usuario(int id, String nombre, String apellido, String nombreUsuario, String contrasena, String rol) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.nombreUsuario = nombreUsuario;
    this.rol = rol;
    this.contrasena = contrasena;
	}
	
	public int getId() {
		return id;
				  }

	public void setId(int id) {
		this.id = id;
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
	
	public String NombreUsuario () {
		return nombreUsuario;
	}
	
	public void NombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public String getContrasena () {
		return contrasena;
	}
	
	public void setContrasena (String contrasena) {
		this.contrasena =contrasena;
	}
	
	@Override
	public String toString() {
	    return "Usuario [ID=" + id + ", Nombre=" + nombre + ", Usuario=" + nombreUsuario + ", Rol=" + rol + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	