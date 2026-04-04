package inventario_gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;

public class Inventario extends JFrame {

	DefaultTableModel modelo;
	JTable tabla;
	
	public Inventario() {
		
	setTitle("Control de Inventario - Textiles del Himalaya");
	setSize(700, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout (null);
	setLocationRelativeTo(null);
	getContentPane().setBackground(new Color(245, 245, 245));
	
	JLabel lblTitulo = new JLabel("GESTIÓN DE ALMACÉN", SwingConstants.CENTER);
    lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
    lblTitulo.setForeground(new Color(44, 62, 80));
    lblTitulo.setBounds(200, 20, 300, 40);
    add(lblTitulo);
	
    String[] columnas = {"ID", "Descripción", "Categoría", "Precio", "Stock"};
    modelo = new DefaultTableModel(columnas, 0);
    tabla = new JTable(modelo);
	
    JScrollPane scroll = new JScrollPane(tabla);
    scroll.setBounds(50, 80, 600, 250);
    add(scroll);
    
    JButton btnAgregar = new JButton("Agregar Prenda");
    btnAgregar.setBounds(100, 360, 150, 35);
    btnAgregar.setBackground(new Color(46, 204, 113)); 
    btnAgregar.setForeground(Color.WHITE);
    add(btnAgregar);
    
    
    JButton btnEliminar = new JButton("Eliminar Seleccionado");
    btnEliminar.setBounds(260, 360, 180, 35);
    btnEliminar.setBackground(new Color(231, 76, 60)); 
    btnEliminar.setForeground(Color.WHITE);
    add(btnEliminar);
    
    JButton btnSalir = new JButton("Cerrar Sesión");
    btnSalir.setBounds(450, 360, 150, 35);
    add(btnSalir);

    modelo.addRow(new Object[]{4001, "Camisa Formal L", "Caballeros", 1250.0, 15});
    modelo.addRow(new Object[]{2002, "Jeans Slim Fit", "Damas", 1800.0, 22});
	}

}
