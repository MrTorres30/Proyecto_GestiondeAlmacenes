package inventario_datos;

public class Producto {

	private int id;
	private String nombreProducto;
	private String categoria;
	private double precio;
	private int stock;
	
	public Producto ( ) {}
	
		public Producto (int id, String nombreProducto, String categoria, double precio, int stock) {
	
			this.id = id;
			this.nombreProducto =nombreProducto;
			this.categoria = categoria;
			this.precio = precio;
			this.stock = stock;
		}
	
		public int getId() {
			return id;
						}

		public void setId(int id) {
			this.id = id;
					 }
	
		public String getNombreProducto () {
			return nombreProducto;
									}
				
		public void setNombreProducto (String nombreProducto) {
			this.nombreProducto = nombreProducto;
													}
		
		public String getCategoria () {
			return categoria;
							}
		
		public void setCategoria (String categoria) {
			this.categoria = categoria;
										}
	
		public Double getPrecio() {
			return precio;		
	}
	
		public void setPrecio (double precio) {
			this.precio = precio;	
	}
	
		public int getStock () {
			return stock;
	}
	
		public void setStock (int stock) {
			this.stock = stock;
	}
	
		@Override
	    public String toString() {
	        return "Producto [ID=" + id + ", Nombre=" + nombreProducto + ", Stock=" + stock + ", Precio=" + precio + "]";
			}
}
