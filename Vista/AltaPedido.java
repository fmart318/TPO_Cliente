package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import rmi.RemoteInterface;
import Negocio.Administrador;
import dto.ClienteDTO;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class AltaPedido extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabelNombre;
	private JLabel jLabelFecha;
	private JLabel jLabelFechaMax;
	private JLabel jLabelPrecio;
	private JTextField jTextNombre;
	private JTextField jTextFecha;
	private JTextField jTextFechaMax;
	private JTextField jTextPrecio;
	private JTextField jTextApellido;
	private JTextField jTextDni;
	private JTextField jTextCuit;
	private JLabel jLabelTelefono;
	private JLabel jLabelApellido;
	private JLabel jLabelDirC;
	private JLabel jLabelDirD;
	private JLabel jLabelCliente;
	private JLabel jLabelCarga;
	private JLabel jLabelTransporte;
	private JComboBox jComboDirC;
	private JComboBox jComboDirD;
	private JComboBox jComboCliente;
	private JComboBox jComboCarga;
	private JComboBox jComboFechaCarga;
	private JComboBox jComboSucursal;
	private JComboBox jComboDestino;
	private JComboBox jComboTransporte;
	private JLabel jLabelDni;
	private JLabel jLabelCuit;
	private JLabel jLabel5;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JButton btnCarga;
	private JTextField jTextNro;
	private JTextField jTextNro2;
	private JTextField jTextDepto;
	private JTextField jTextDepto2;
	private JTextField jTextPiso;
	private JTextField jTextPiso2;
	private JTextField jTextCalle;
	private JTextField jTextCalle2;
	private JTextField jTextLocalidad;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JFrame jFrameFecha;
	private JTextField jTextTelefono;
	private static AltaPedido instancia;
	private RemoteInterface ir;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static AltaPedido getInstancia() {
		if (instancia == null)
			instancia = new AltaPedido();
		return instancia;
	}

	public AltaPedido() {
		super();
		initGUI();
	}

	private void limpiarPantalla() {

	}

	private void initGUI() {
		try {

			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setSize(443, 320);
			this.setTitle("Alta Pedido");
			{
				jLabelDirC = new JLabel();
				getContentPane().add(jLabelDirC);
				jLabelDirC.setText("Dir. Carga");
				jLabelDirC.setBounds(4, 10, 57, 16);
				jLabelDirC.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelDirC.setHorizontalTextPosition(SwingConstants.RIGHT);
			}

			{
				jTextCalle = new JTextField();
				getContentPane().add(jTextCalle);
				jTextCalle.setBounds(76, 10, 100, 23);
				jTextCalle.setText("Av. Regolleau");
			}
			{
				jTextNro = new JTextField();
				getContentPane().add(jTextNro);
				jTextNro.setBounds(180, 10, 35, 23);
				jTextNro.setText("1204");
			}
			{
				jTextPiso = new JTextField();
				getContentPane().add(jTextPiso);
				jTextPiso.setBounds(220, 10, 20, 23);
				jTextPiso.setText("2");
			}
			{
				jTextDepto = new JTextField();
				getContentPane().add(jTextDepto);
				jTextDepto.setBounds(240, 10, 20, 23);
				jTextDepto.setText("F");
			}

			{
				jLabelDirD = new JLabel();
				getContentPane().add(jLabelDirD);
				jLabelDirD.setText("Dir. Destino");
				jLabelDirD.setBounds(4, 35, 57, 16);
				jLabelDirD.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelDirD.setHorizontalTextPosition(SwingConstants.RIGHT);
			}
			{
				jTextCalle2 = new JTextField();
				getContentPane().add(jTextCalle2);
				jTextCalle2.setBounds(76, 35, 100, 23);
				jTextCalle2.setText("Av. Regolleau");
			}
			{
				jTextNro2 = new JTextField();
				getContentPane().add(jTextNro2);
				jTextNro2.setBounds(180, 35, 35, 23);
				jTextNro2.setText("1204");
			}
			{
				jTextPiso2 = new JTextField();
				getContentPane().add(jTextPiso2);
				jTextPiso2.setBounds(220, 35, 20, 23);
				jTextPiso2.setText("2");
			}
			{
				jTextDepto2 = new JTextField();
				getContentPane().add(jTextDepto2);
				jTextDepto2.setBounds(240, 35, 20, 23);
				jTextDepto2.setText("F");
			}
			{
				jLabelCliente = new JLabel();
				getContentPane().add(jLabelCliente);
				jLabelCliente.setText("Cliente");
				jLabelCliente.setBounds(4, 160, 57, 16);
				jLabelCliente.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelCliente.setHorizontalTextPosition(SwingConstants.RIGHT);
			}
			{
				jLabelCarga = new JLabel();
				getContentPane().add(jLabelCarga);
				jLabelCarga.setText("Cargas");
				jLabelCarga.setBounds(4, 185, 57, 16);
				jLabelCarga.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelCarga.setHorizontalTextPosition(SwingConstants.RIGHT);
			}
			{
				jLabelTransporte = new JLabel();
				getContentPane().add(jLabelTransporte);
				jLabelTransporte.setText("Tipo Transporte");
				jLabelTransporte.setBounds(4, 120, 57, 16);
				jLabelTransporte.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelTransporte
						.setHorizontalTextPosition(SwingConstants.RIGHT);
			}

			{
				List<ClienteDTO> clientes = Administrador.getInstance()
						.obtenerClientes();
				Vector<String> nombres = new Vector<String>();
				for (int i = 0; i < clientes.size(); i++) {
					nombres.addElement(clientes.get(i).getNombre());
				}

				ComboBoxModel jComboDirecD = new DefaultComboBoxModel(nombres);
				jComboCliente = new JComboBox();
				getContentPane().add(jComboCliente);
				jComboCliente.setModel(jComboDirecD);
				jComboCliente.setBounds(76, 160, 120, 23);
			}

			{
				ComboBoxModel jComboDirecD = new DefaultComboBoxModel();
				jComboCarga = new JComboBox();
				getContentPane().add(jComboCarga);
				jComboCarga.setModel(jComboDirecD);
				jComboCarga.setBounds(76, 185, 120, 23);
				jComboCarga.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {

					}
				});
			}
			{
				ComboBoxModel jComboTrans = new DefaultComboBoxModel(
						new String[] { "Interno", "Directo", "Avioneta" });
				jComboTransporte = new JComboBox();
				getContentPane().add(jComboTransporte);
				jComboTransporte.setModel(jComboTrans);
				jComboTransporte.setBounds(76, 120, 120, 23);
				jComboTransporte.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {

					}
				});
			}

			{
				jLabelFecha = new JLabel();
				getContentPane().add(jLabelFecha);
				jLabelFecha.setText("Fech E");
				jLabelFecha.setBounds(4, 60, 60, 16);
				jLabelFecha.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelFecha.setHorizontalTextPosition(SwingConstants.RIGHT);
			}
			{
				jTextFecha = new JTextField();
				getContentPane().add(jTextFecha);
				jTextFecha.setBounds(76, 60, 60, 23);

			}
			{
				jLabelFechaMax = new JLabel();
				getContentPane().add(jLabelFechaMax);
				jLabelFechaMax.setText("Fech Máx");
				jLabelFechaMax.setBounds(4, 90, 60, 16);
				jLabelFechaMax.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelFechaMax.setHorizontalTextPosition(SwingConstants.RIGHT);
			}
			{
				jTextFechaMax = new JTextField();
				getContentPane().add(jTextFechaMax);
				jTextFechaMax.setBounds(76, 90, 60, 23);
			}
			{
				jLabelPrecio = new JLabel();
				getContentPane().add(jLabelPrecio);
				jLabelPrecio.setText("Precio");
				jLabelPrecio.setBounds(200, 60, 40, 16);
				jLabelPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelPrecio.setHorizontalTextPosition(SwingConstants.RIGHT);
			}
			{
				jTextPrecio = new JTextField();
				getContentPane().add(jTextPrecio);
				jTextPrecio.setBounds(260, 60, 60, 23);
			}
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setBounds(12, 38, 443, 320);
				jPanel1.setLayout(null);
				jPanel1.setVisible(true);

			}
			{
				btnAceptar = new JButton();
				jPanel1.add(btnAceptar);
				btnAceptar.setText("Aceptar");
				btnAceptar.setBounds(85, 249, 87, 23);
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {

					}
				});
			}

			{
				btnCarga = new JButton();
				jPanel1.add(btnCarga);
				btnCarga.setText("Nueva Carga");
				btnCarga.setBounds(200, 185, 87, 23);
				btnCarga.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {

					}
				});
			}

			{
				btnCancelar = new JButton();
				jPanel1.add(btnCancelar);
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

}
