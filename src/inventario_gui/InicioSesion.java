package inventario_gui;
import javax.swing.*;
import java.awt.Font;

public class InicioSesion extends JFrame {

	public InicioSesion() {
	
		setTitle("Acceso al Almacén");
		setSize (400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
	//---------------------------------------------------	
		
		JLabel lblTitulo = new JLabel("INICIAR SESION", SwingConstants.CENTER);
		lblTitulo.setFont(new Font ("Arial", Font.ITALIC, 20));
		lblTitulo.setBounds(100, 20, 200, 30);
		add(lblTitulo);
	
	
	//-----------------------------------------------------
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setBounds (50, 80, 80, 25);
		add(lblUser);
		
		
		JTextField txtUser = new JTextField();
        txtUser.setBounds(110, 30, 150, 25);
        add(txtUser);

        // 4. Botón
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(100, 80, 100, 30);
        add(btnEntrar);
    }

    public static void main(String[] args) {
        InicioSesion ventana = new InicioSesion();
        ventana.setVisible(true);
    }
}
