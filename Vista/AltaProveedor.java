package Vista;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AltaProveedor extends javax.swing.JFrame {
	
	private static final long serialVersionUID = -1183838433751027311L;
	private static AltaProveedor instancia;
	
	private JLabel labelMercaderia;
	private JTextField mercaderia;
	
	private JLabel labelCompania;
	private JTextField compania;
	
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	public static AltaProveedor getInstancia() {
		if (instancia == null)
			instancia = new AltaProveedor();
		return instancia;
	}
	
	public AltaProveedor() {
		super();
		getContentPane().setBackground(Color.WHITE);
		initGUI();
	}
	
	private void initGUI() {
		try {
			setTitle("Alta Proveedor");
			getContentPane().setBackground(Color.WHITE);
			getContentPane().setLayout(null);
			
			labelCompania = new JLabel("Compañia:");
			labelCompania.setBounds(86, 45, 67, 16);
			getContentPane().add(labelCompania);
			
			compania = new JTextField();
			compania.setBounds(165, 43, 279, 26);
			getContentPane().add(compania);
			compania.setColumns(10);
			
			labelMercaderia = new JLabel("Mercadería:");
			labelMercaderia.setBounds(86, 10, 72, 16);
			getContentPane().add(labelMercaderia);
			
			mercaderia = new JTextField();
			mercaderia.setBounds(165, 5, 279, 26);
			getContentPane().add(mercaderia);
			mercaderia.setColumns(10);
			
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(126, 104, 117, 29);
			getContentPane().add(btnAceptar);
			
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(284, 104, 117, 29);
			getContentPane().add(btnCancelar);
		
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
