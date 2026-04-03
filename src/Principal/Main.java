package Principal;

import java.util.ArrayList;
import inventario_datos.Usuario;
import inventario_datos.Producto;
import inventario_datos.Proveedor;


public class Main {

	
	public static void main(String[] args) {
        Usuario miUsuario = new Usuario(1, "Wilmer", "Torres", "torresw", "12345", "Admin");

        System.out.println("¡Sistema de Almacén Iniciado!");
        System.out.println("Bienvenido: " + miUsuario.getNombre());
        System.out.println("Datos completos: " + miUsuario.toString());

        ArrayList<Producto> listaProductos = new ArrayList<>();
	
        listaProductos.add(new Producto(4001, "Camisa Formal Blanca - L", "Caballeros", 1250.00, 30));
        listaProductos.add(new Producto(2002, "Pijama Algodón - Dinosaurios - 4T", "Niños", 750.0, 50));
        listaProductos.add(new Producto(3002, "Camiseta Dry-Fit - Neón - L", "Deportivo", 850.0, 45));

        
        
        System.out.println("LISTADO DE PRENDAS EN ALMACÉN:");
        System.out.println("==========================================");
        
        System.out.println("ESTADO DEL INVENTARIO:");
	
        for (Producto p : listaProductos) {
		System.out.println(p.toString ());
        }
        System.out.println("\nTotal de productos registrados: " + listaProductos.size());
        
        double valorTotal = 0;

        for (Producto p : listaProductos) {
            valorTotal += (p.getPrecio() * p.getStock()); 
        }

        System.out.println("VALOR TOTAL DE MERCANCÍA: RD$ %,.2f " + valorTotal);
        
        
        ArrayList<Proveedor> listaProveedor = new ArrayList<>();
        
        listaProveedor.add(new Proveedor(9001, "Textiles del Himalaya", "809-863-7900", "ventas@himalayex.com", "Zona Franca, Herrera"));
        listaProveedor.add(new Proveedor(9002, "Moda Infantil Dominicana", "829-753-1672", "contacto@modainfantil.do", "Av. Duarte, SD"));
        listaProveedor.add(new Proveedor(9004, "Importadora SportMax", "849-648-0157", "pedidos@sportmax.com", "Santiago de los Caballeros"));

        System.out.println("DIRECTORIO DE PROVEEDORES ACTIVOS:");
        for (Proveedor prov : listaProveedor) {
            System.out.println(prov.toString());
        }
        
        
	}
}
