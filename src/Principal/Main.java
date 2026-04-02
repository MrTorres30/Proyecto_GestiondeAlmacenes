package Principal;
import inventario_datos.Usuario;

public class Main {

	
	public static void main(String[] args) {
        Usuario miUsuario = new Usuario(1, "Wilmer", "Torres", "torresw", "12345", "Admin");

        System.out.println("¡Sistema de Almacén Iniciado!");
        System.out.println("Bienvenido: " + miUsuario.getnombre());
        System.out.println("Datos completos: " + miUsuario.toString());
    }
}
