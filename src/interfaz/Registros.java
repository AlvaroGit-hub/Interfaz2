package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class Registros extends JFrame{

	private JPanel contentPane;
	
	
	public Registros() {
		//i= new Interfaz();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 417);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("New label");
		lblLogo.setIcon(new ImageIcon(Registros.class.getResource("/interfaz/gemlogotransdefinitivopeque\u00F1o.png")));
		lblLogo.setBounds(545, 11, 75, 42);
		contentPane.add(lblLogo);
		
		JLabel lblUser = new JLabel("Usuario :");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUser.setBounds(40, 22, 75, 14);
		contentPane.add(lblUser);
		
		JLabel lblUsuarionombre = new JLabel();
		lblUsuarionombre.setBackground(Color.GRAY);
		lblUsuarionombre.setBounds(125, 25, 75, 14);
		contentPane.add(lblUsuarionombre);
		
		JLabel lblCategoria = new JLabel("Categoria :");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCategoria.setBounds(210, 15, 96, 28);
		contentPane.add(lblCategoria);
		
		JLabel lblCategoria2 = new JLabel("");
		lblCategoria2.setBounds(305, 25, 81, 14);
		contentPane.add(lblCategoria2);
		setVisible(true);
	}
}
