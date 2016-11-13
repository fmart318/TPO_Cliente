package Vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.WindowConstants;

import rmi.RemoteInterface;
import Negocio.Administrador;
import Negocio.AdministradorCliente;
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
public class ListarClientes extends javax.swing.JFrame {

	private static final long serialVersionUID = -113708619852837260L;
	private static ListarClientes instancia;
	private RemoteInterface ir;

	private JPanel jPanel1;
	private JList jList1;
	private JButton btnCancelar;
	private JButton btnAceptar;

	public static ListarClientes getInstancia() {
		if (instancia == null)
			instancia = new ListarClientes();
		return instancia;
	}

	public ListarClientes() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {

			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setSize(443, 320);
			this.setTitle("Listar Cliente");
			getContentPane().add(getJList1(), BorderLayout.CENTER);
			{
				{
					btnAceptar = new JButton();
					jPanel1.add(btnAceptar);
					btnAceptar.setText("Aceptar");
					btnAceptar.setBounds(85, 249, 87, 23);
					btnAceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							// Administrador.getInstance().altaCliente(c);
							List<ClienteDTO> listadoClientes = new ArrayList<ClienteDTO>();

							listadoClientes.addAll(AdministradorCliente.getInstance()
									.listarClientes());

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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JList getJList1() {
		if (jList1 == null) {
			List<String> lista = new ArrayList<String>();
			List<ClienteDTO> aux = AdministradorCliente.getInstance().listarClientes();
			for (ClienteDTO clienteDTO : aux) {
				lista.add(clienteDTO.getNombre());
			}

			ListModel jList1Model = new DefaultComboBoxModel(lista.toArray());
			jList1 = new JList();
			jList1.setModel(jList1Model);
			jList1.setLayout(null);
		}
		return jList1;
	}

}
