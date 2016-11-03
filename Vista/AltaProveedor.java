package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Negocio.AdministradorProveedor;
import dto.ProveedorDTO;

public class AltaProveedor extends javax.swing.JFrame {

	private static final long serialVersionUID = 1404881132046588088L;

	private static AltaProveedor instancia;

	private JLabel labelMercaderia;
	private JTextField mercaderia;

	private JLabel labelCompania;
	private JTextField compania;

	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static AltaProveedor getInstancia() {
		if (instancia == null)
			instancia = new AltaProveedor();
		return instancia;
	}

	public AltaProveedor() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {

			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setSize(443, 320);
			this.setTitle("Alta Proveedor");

			{
				labelMercaderia = new JLabel();
				labelMercaderia.setText("Tipo de Mercaderia: ");
				labelMercaderia.setBounds(76, 165, 160, 23);
				getContentPane().add(labelMercaderia);

			}
			{
				mercaderia = new JTextField();
				mercaderia.setBounds(76, 165, 160, 23);
				getContentPane().add(mercaderia);
			}
			{
				labelCompania = new JLabel();
				labelCompania.setText("Compañia: ");
				labelCompania.setBounds(76, 165, 160, 23);
				getContentPane().add(labelCompania);
			}
			{
				compania = new JTextField();
				compania.setBounds(76, 165, 160, 23);
				getContentPane().add(compania);
			}

			{
				btnAceptar = new JButton();
				btnAceptar.setText("Aceptar");
				btnAceptar.setBounds(85, 249, 87, 23);
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ProveedorDTO proveedor = new ProveedorDTO();
						proveedor.setCompania(compania.getText());
						proveedor.setTipoMercaderia(mercaderia.getText());
						AdministradorProveedor.getInstance().altaProveedor(
								proveedor);
						limpiarPantalla();
					}
				});
			}
			{
				btnCancelar = new JButton();
				btnCancelar.setText("Cancelar");
				btnCancelar.setBounds(183, 249, 87, 23);
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						dispose();
					}
				});
			}
			pack();
			this.setSize(379, 348);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	private void limpiarPantalla() {
		mercaderia.setText("");
		compania.setText("");
	}
}
