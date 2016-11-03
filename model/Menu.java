package model;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import rmi.RemoteInterface;

public class Menu extends javax.swing.JFrame {
	private JMenuBar jMenuBar1;
	private JMenuItem jMenuItem9;
	private JMenuItem jMenuItem10;
	private JMenuItem jMenuItem8;
	private JMenuItem jMenuItem7;
	private JSeparator jSeparator1;
	private JMenuItem jMenuItem6;
	private JTextArea display;
	private JMenuItem jMenuItem5;
	private JMenu jMenu3;
	private JMenu jMenu4;
	private JMenuItem jMenuItem2;
	private JMenu jMenu2;
	private JMenuItem jMenuItem1;
	private JMenu jMenu1;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem4;
	private RemoteInterface ir;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Menu inst = new Menu();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public Menu() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Menu Principal");
			{
				display = new JTextArea();
				getContentPane().add(display, BorderLayout.CENTER);
			}
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("RMI");
					{
						jMenuItem6 = new JMenuItem();
						jMenu2.add(jMenuItem6);
						jMenuItem6.setText("Iniciar Servidor RMI");
						jMenuItem6.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								try {/*
									 * Server srv = new Server(); srv.iniciar();
									 * String[] vinculos = srv.getVinculos();
									 * display.setText(
									 * "Vinculos disponibles en el servidor: ");
									 * display
									 * .append(InetAddress.getLocalHost().
									 * getHostAddress()); for ( int i = 0; i <
									 * vinculos.length; i++ ){ display.append(
									 * "\n"+vinculos[i]); }
									 */
								} catch (Exception e) {
									System.out.println(e.getMessage());
								}

							}
						});
					}

				}
				jMenu3 = new JMenu();
				jMenuBar1.add(jMenu3);
				jMenu3.setText("Pedidos");
				{
					jMenuItem5 = new JMenuItem();
					jMenu3.add(jMenuItem5);
					jMenuItem5.setText("Nuevo Pedido");
					jMenuItem5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							// AltaPedido.getInstancia().setLocationRelativeTo(null);
							// AltaPedido.getInstancia().setVisible(true);

						}
					});
				}
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("Vehículos");
					{
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("Alta");
						jMenuItem1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {/*
																		 * Agregar.
																		 * getInstancia
																		 * ().
																		 * setLocationRelativeTo
																		 * (
																		 * null)
																		 * ;
																		 * Agregar
																		 * .
																		 * getInstancia
																		 * ().
																		 * setVisible
																		 * (
																		 * true)
																		 * ;
																		 */
							}
						});
					}
					{
						jMenuItem10 = new JMenuItem();
						jMenu1.add(jMenuItem10);
						jMenuItem10.setText("Baja");
						jMenuItem10.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {/*
																		 * Baja.
																		 * getInstancia
																		 * ().
																		 * setLocationRelativeTo
																		 * (
																		 * null)
																		 * ;
																		 * Baja.
																		 * getInstancia
																		 * ().
																		 * setVisible
																		 * (
																		 * true)
																		 * ;
																		 */
							}
						});
					}
					{
						jMenuItem7 = new JMenuItem();
						jMenu1.add(jMenuItem7);
						jMenuItem7.setText("Modificacion");
						jMenuItem7.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {/*
																		 * Modif.
																		 * getInstancia
																		 * ().
																		 * setLocationRelativeTo
																		 * (
																		 * null)
																		 * ;
																		 * Modif
																		 * .
																		 * getInstancia
																		 * ().
																		 * setVisible
																		 * (
																		 * true)
																		 * ;
																		 */
							}
						});
					}

				}
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("Proveedores");
					{
						jMenuItem5 = new JMenuItem();
						jMenu3.add(jMenuItem5);
						jMenuItem5.setText("Alta");
						jMenuItem5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {/*
																		 * Alta.
																		 * getInstancia
																		 * ().
																		 * setLocationRelativeTo
																		 * (
																		 * null)
																		 * ;
																		 * Alta.
																		 * getInstancia
																		 * ().
																		 * setVisible
																		 * (
																		 * true)
																		 * ;
																		 */
							}
						});
					}
					{
						jMenuItem9 = new JMenuItem();
						jMenu3.add(jMenuItem9);
						jMenuItem9.setText("Baja");
						jMenuItem9.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {/*
																		 * BajaProveedor
																		 * .
																		 * getInstancia
																		 * ().
																		 * setLocationRelativeTo
																		 * (
																		 * null)
																		 * ;
																		 * BajaProveedor
																		 * .
																		 * getInstancia
																		 * ().
																		 * setVisible
																		 * (
																		 * true)
																		 * ;
																		 */
							}
						});
					}
					{
						jMenuItem8 = new JMenuItem();
						jMenu3.add(jMenuItem8);
						jMenuItem8.setText("Modificacion");
						jMenuItem8.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {/*
																		 * ModificacionProveedor
																		 * .
																		 * getInstancia
																		 * ().
																		 * setLocationRelativeTo
																		 * (
																		 * null)
																		 * ;
																		 * ModificacionProveedor
																		 * .
																		 * getInstancia
																		 * ().
																		 * setVisible
																		 * (
																		 * true)
																		 * ;
																		 */
							}
						});
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("Clientes");
					{
						jMenuItem4 = new JMenuItem();
						jMenu4.add(jMenuItem4);
						jMenuItem4.setText("Listar");
						jMenuItem4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {/*
																		 * AltaCliente
																		 * .
																		 * getInstancia
																		 * ().
																		 * setLocationRelativeTo
																		 * (
																		 * null)
																		 * ;
																		 * AltaCliente
																		 * .
																		 * getInstancia
																		 * ().
																		 * setVisible
																		 * (
																		 * true)
																		 * ;
																		 */
							}
						});
						jMenuItem4 = new JMenuItem();
						jMenu4.add(jMenuItem4);
						jMenuItem4.setText("Alta");
						jMenuItem4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								// AltaCliente.getInstancia().setLocationRelativeTo(null);
								// AltaCliente.getInstancia().setVisible(true);

							}
						});
						{
							jMenuItem9 = new JMenuItem();
							jMenu4.add(jMenuItem9);
							jMenuItem9.setText("Baja");
							jMenuItem9.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {/*
																			 * BajaProveedor
																			 * .
																			 * getInstancia
																			 * (
																			 * )
																			 * .
																			 * setLocationRelativeTo
																			 * (
																			 * null
																			 * )
																			 * ;
																			 * BajaProveedor
																			 * .
																			 * getInstancia
																			 * (
																			 * )
																			 * .
																			 * setVisible
																			 * (
																			 * true
																			 * )
																			 * ;
																			 */
								}
							});
						}
						{
							jMenuItem8 = new JMenuItem();
							jMenu4.add(jMenuItem8);
							jMenuItem8.setText("Modificacion");
							jMenuItem8.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {/*
																			 * ModificacionProveedor
																			 * .
																			 * getInstancia
																			 * (
																			 * )
																			 * .
																			 * setLocationRelativeTo
																			 * (
																			 * null
																			 * )
																			 * ;
																			 * ModificacionProveedor
																			 * .
																			 * getInstancia
																			 * (
																			 * )
																			 * .
																			 * setVisible
																			 * (
																			 * true
																			 * )
																			 * ;
																			 */
								}
							});
						}
					}
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("Salir");
					{
						jMenuItem2 = new JMenuItem();
						jMenu2.add(jMenuItem2);
						jMenuItem2.setText("Salir");
						jMenuItem2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								dispose();
								System.exit(0);
							}
						});
					}
				}
			}
			pack();
			this.setSize(650, 216);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

}
