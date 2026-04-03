package inventario_gui;

import javax.swing.*;
import java.awt.Font;

public class InicioSesion extends JFrame {

	public InicioSesion() {
	
		setTitle("Acceso al Almacén");
		setSize (400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
	//---------------------------------------------------	
		
		JLabel lblTitulo = new JLabel("INICIAR SESION", SwingConstants.CENTER);
		lblTitulo.setFont(new Font ("Arial", Font.ITALIC, 20));
		lblTitulo.setBounds(100, 30, 200, 30);
		add(lblTitulo);
	
	
	//-----------------------------------------------------
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setBounds (50, 100, 80, 25);
		add(lblUser);
		
		
		JTextField txtUser = new JTextField();
        txtUser.setBounds(140, 100, 150, 25);
        add(txtUser);

        JLabel lblPass = new JLabel("Clave:");
        lblPass.setBounds(50, 150, 80, 25); 
        add(lblPass);
        
        JPasswordField txtPass = new JPasswordField();
        txtPass.setBounds(140, 150, 150, 25);
        add(txtPass);
        
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(150, 220, 100, 35);
        add(btnEntrar);
    
		
	btnEntrar.addActionListener(e -> {
        String usuarioIngresado = txtUser.getText();
        String claveIngresada = new String(txtPass.getPassword());

        if (usuarioIngresado.equals("torresw") && claveIngresada.equals("12345")) {
            JOptionPane.showMessageDialog(null, "¡Acceso concedido! Bienvenido al sistema.");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos", "Error de Acceso", JOptionPane.ERROR_MESSAGE);
        }
    });
    
} 
	
    public static void main(String[] args) {
        InicioSesion ventana = new InicioSesion();
        ventana.setVisible(true);
    }
}
