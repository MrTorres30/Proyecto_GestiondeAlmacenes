package inventario_datos;

public class Producto {

	private int id;
	private String nombreProducto;
	private String categoria;
	private Double precio;
	private int stock;
	
	public Producto ( ) {}
	
		public Producto (int id, String nombreProducto, String categoria, Double precio, int stock) {
	
			this.id = id;
			this.nombreProducto =nombreProducto;
			this.categoria = categoria;
			this.precio = precio;
			this.stock = stock;
		}
	
		public int getid() {
			return id;
						}

		public void setid(int id) {
			this.id = id;
					 }
	
		public String getnombreProducto () {
			return nombreProducto;
									}
				
		public void setnombreProducto (String nombreProducto) {
			this.nombreProducto = nombreProducto;
													}
		
		public String getcategoria () {
			return categoria;
							}
		
		public void setcategoria (String categoria) {
			this.categoria = categoria;
										}
	
		public Double getprecio() {
			return precio;		
	}
	
		public void setprecio (Double precio) {
			this.precio = precio;	
	}
	
		public int getstock () {
			return stock;
	}
	
		public void setstock (int stock) {
			this.stock = stock;
	}
	
}
	
