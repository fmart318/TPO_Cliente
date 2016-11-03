package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class AltaCliente extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabelNombre;
	private JTextField jTextNombre;
	private JTextField jTextApellido;
	private JTextField jTextDni;
	private JTextField jTextCuit;
	private JLabel jLabelTelefono;
	private JLabel jLabelApellido;
	private JLabel jLabelTipo;
	private JComboBox jComboTipo;
	private JLabel jLabelDni;
	private JLabel jLabelCuit;
	private JLabel jLabel5;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JTextField jTextNro;
	private JTextField jTextDepto;
	private JTextField jTextPiso;
	private JTextField jTextCalle;
	private JTextField jTextLocalidad;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField jTextTelefono;
	private static AltaCliente instancia;
	private RemoteInterface ir;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static AltaCliente getInstancia() {
		if (instancia == null)
			instancia = new AltaCliente();
		return instancia;
	}

	public AltaCliente() {
		super();
		initGUI();
	}

	private void limpiarPantalla() {
		this.jTextNombre.setText("");
		this.jTextTelefono.setText("");
		this.jTextCalle.setText("");
		this.jTextNro.setText("");
		this.jTextDepto.setText("");
		this.jTextLocalidad.setText("");
		this.jTextDni.setText("");
		this.jTextPiso.setText("");
	}

	private void initGUI() {
		try {

			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setSize(443, 320);
			this.setTitle("Alta Cliente");
			{
				jLabelTipo = new JLabel();
				getContentPane().add(jLabelTipo);
				jLabelTipo.setText("Tipo");
				jLabelTipo.setBounds(4, 10, 57, 16);
				jLabelTipo.setHorizontalAlignment(SwingConstants.RIGHT);
				jLabelTipo.setHorizontalTextPosition(SwingConstants.RIGHT);
			}
			{
				ComboBoxModel jComboTipoModel = new DefaultComboBoxModel(
						new String[] { "", "Particular", "Empresa" });
				jComboTipo = new JComboBox();
				getContentPane().add(jComboTipo);
				jComboTipo.setModel(jComboTipoModel);
				jComboTipo.setBounds(76, 10, 120, 23);

				jComboTipo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						if ("Particular".equals(jComboTipo.getSelectedItem())) {
							jPanel1.setVisible(true);
							jTextCuit.setVisible(false);
							jLabelCuit.setVisible(false);
							jLabelNombre.setVisible(true);
							jTextNombre.setVisible(true);
							jLabelApellido.setVisible(true);
							jTextApellido.setVisible(true);
							jLabelDni.setVisible(true);
							jTextDni.setVisible(true);
						} else if ("Empresa".equals(jComboTipo
								.getSelectedItem())) {
							jPanel1.setVisible(true);
							jLabelApellido.setVisible(false);
							jTextApellido.setVisible(false);
							jLabelDni.setVisible(false);
							jTextDni.setVisible(false);
							jTextCuit.setVisible(true);
							jLabelCuit.setVisible(true);
						} else if ("".equals(jComboTipo.getSelectedItem())) {
							jPanel1.setVisible(false);
						}
					}
				});
			}
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setBounds(12, 38, 443, 320);
				jPanel1.setLayout(null);
				jPanel1.setVisible(false);

				{
					jLabelNombre = new JLabel();
					jPanel1.add(jLabelNombre);
					jLabelNombre.setText("Nombre");
					jLabelNombre.setBounds(4, 40, 62, 16);
					jLabelNombre.setHorizontalAlignment(SwingConstants.RIGHT);
					jLabelNombre
							.setHorizontalTextPosition(SwingConstants.RIGHT);
				}
				{
					jTextNombre = new JTextField();
					jPanel1.add(jTextNombre);
					jTextNombre.setBounds(76, 40, 256, 23);
					jTextNombre.setText("Nombre");
				}
				{
					jLabelApellido = new JLabel();
					jPanel1.add(jLabelApellido);
					jLabelApellido.setText("Apellido");
					jLabelApellido.setBounds(4, 65, 62, 16);
					jLabelApellido.setHorizontalAlignment(SwingConstants.RIGHT);
					jLabelApellido
							.setHorizontalTextPosition(SwingConstants.RIGHT);
				}
				{
					jTextApellido = new JTextField();
					jPanel1.add(jTextApellido);
					jTextApellido.setBounds(76, 65, 256, 23);
					jTextApellido.setText("Apellido");
				}
				{
					jLabelDni = new JLabel();
					jPanel1.add(jLabelDni);
					jLabelDni.setText("DNI");
					jLabelDni.setBounds(4, 90, 64, 15);
					jLabelDni.setHorizontalAlignment(SwingConstants.RIGHT);
					jLabelDni.setHorizontalTextPosition(SwingConstants.RIGHT);
				}
				{
					jTextDni = new JTextField();
					jPanel1.add(jTextDni);
					jTextDni.setBounds(76, 90, 125, 23);
					jTextDni.setText("29329384");
				}
				{
					jLabelCuit = new JLabel();
					jPanel1.add(jLabelCuit);
					jLabelCuit.setText("CUIT");
					jLabelCuit.setBounds(4, 90, 64, 15);
					jLabelCuit.setHorizontalAlignment(SwingConstants.RIGHT);
					jLabelCuit.setHorizontalTextPosition(SwingConstants.RIGHT);
				}
				{
					jTextCuit = new JTextField();
					jPanel1.add(jTextCuit);
					jTextCuit.setBounds(76, 90, 125, 23);
					jTextCuit.setText("20293293849");
				}
				{
					jLabelTelefono = new JLabel();
					jPanel1.add(jLabelTelefono);
					jLabelTelefono.setText("Telefono");
					jLabelTelefono.setBounds(4, 115, 57, 16);
					jLabelTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
					jLabelTelefono
							.setHorizontalTextPosition(SwingConstants.RIGHT);
				}

				{
					jTextTelefono = new JTextField();
					jPanel1.add(jTextTelefono);
					jTextTelefono.setBounds(76, 115, 125, 23);
					jTextTelefono.setText("43258331");
				}
				{
					jLabel9 = new JLabel();
					jPanel1.add(jLabel9);
					jLabel9.setText("Localidad");
					jLabel9.setBounds(4, 140, 57, 16);
					jLabel9.setHorizontalAlignment(SwingConstants.RIGHT);
					jLabel9.setHorizontalTextPosition(SwingConstants.RIGHT);
				}
				{
					jTextLocalidad = new JTextField();
					jPanel1.add(jTextLocalidad);
					jTextLocalidad.setBounds(76, 140, 257, 23);
					jTextLocalidad.setText("Berazategui");
				}
				{
					jLabel5 = new JLabel();
					jPanel1.add(jLabel5);
					jLabel5.setText("Calle");
					jLabel5.setBounds(4, 165, 57, 16);
					jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
					jLabel5.setHorizontalTextPosition(SwingConstants.RIGHT);
				}
				{
					jLabel6 = new JLabel();
					jPanel1.add(jLabel6);
					jLabel6.setText("Nro");
					jLabel6.setBounds(247, 165, 33, 16);
				}
				{
					jLabel7 = new JLabel();
					jPanel1.add(jLabel7);
					jLabel7.setText("Piso");
					jLabel7.setBounds(4, 190, 57, 16);
					jLabel7.setHorizontalAlignment(SwingConstants.RIGHT);
					jLabel7.setHorizontalTextPosition(SwingConstants.RIGHT);
				}
				{
					jLabel8 = new JLabel();
					jPanel1.add(jLabel8);
					jLabel8.setText("Depto");
					jLabel8.setBounds(135, 190, 44, 16);
				}

				{
					jTextCalle = new JTextField();
					jPanel1.add(jTextCalle);
					jTextCalle.setBounds(76, 165, 160, 23);
					jTextCalle.setText("Av. Regolleau");
				}
				{
					jTextNro = new JTextField();
					jPanel1.add(jTextNro);
					jTextNro.setBounds(277, 165, 55, 23);
					jTextNro.setText("1204");
				}
				{
					jTextPiso = new JTextField();
					jPanel1.add(jTextPiso);
					jTextPiso.setBounds(76, 190, 49, 23);
					jTextPiso.setText("2");
				}
				{
					jTextDepto = new JTextField();
					jPanel1.add(jTextDepto);
					jTextDepto.setBounds(180, 190, 55, 23);
					jTextDepto.setText("F");
				}
				{
					btnAceptar = new JButton();
					jPanel1.add(btnAceptar);
					btnAceptar.setText("Aceptar");
					btnAceptar.setBounds(85, 249, 87, 23);
					btnAceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ClienteDTO c = new ClienteDTO();
							c.setNombre(jTextNombre.getText());
							Administrador.getInstance().altaCliente(c);
							/*
							 * Administrador.getInstancia().addCliente(jTextNombre
							 * .getText(), jTextTelefono.getText(),
							 * Double.valueOf(jTextDni.getText()),
							 * jTextCalle.getText(),
							 * Integer.valueOf(jTextNro.getText()),
							 * jTextPiso.getText(), jTextDepto.getText(),
							 * jTextLocalidad.getText()); limpiarPantalla();
							 */

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
			}
			pack();
			this.setSize(379, 348);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

}
