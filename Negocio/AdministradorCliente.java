package Negocio;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import rmi.RemoteInterfaceCliente;
import dto.ClienteDTO;

public class AdministradorCliente {

	private RemoteInterfaceCliente remoteInterfaceCliente;
	private static final AdministradorCliente instancia = new AdministradorCliente();

	public static AdministradorCliente getInstance() {
		return instancia;
	}

	private AdministradorCliente() {
		try {
			remoteInterfaceCliente = (RemoteInterfaceCliente) Naming
					.lookup("remoteInterfaceCliente");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

	public List<ClienteDTO> listarClientes() {

		try {
			return remoteInterfaceCliente.obtenerClientes();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void altaCliente(ClienteDTO clienteDto) {
		try {
			remoteInterfaceCliente.altaCliente(clienteDto);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public List<ClienteDTO> obtenerClientes() {
		try {
			return remoteInterfaceCliente.obtenerClientes();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

}
