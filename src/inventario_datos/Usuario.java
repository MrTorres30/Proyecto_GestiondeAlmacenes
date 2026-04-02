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
	
	public int getid() {
		return id;
				  }

	public void setid(int id) {
		this.id = id;
					 }
	
	
	public String getnombre() {
		return nombre;
					  }
		
	public void setnombre(String nombre) {	
		this.nombre = nombre;
							}
	
	public String getapellido() {
		return apellido;
						}
	
	public void setapellido(String apellido) {
		this.apellido = apellido;
								}
	
	public String nombreUsuario () {
		return nombreUsuario;
	}
	
	public void nombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String rol() {
		return rol;
	}
	
	public void rol(String rol) {
		this.rol = rol;
	}
	
	public String contrasena () {
		return contrasena;
	}
	
	public void contrasena (String contrasena) {
		this.contrasena =contrasena;
	}
	
	@Override
	public String toString() {
	    return "Usuario [ID=" + id + ", Nombre=" + nombre + ", Usuario=" + nombreUsuario + ", Rol=" + rol + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	