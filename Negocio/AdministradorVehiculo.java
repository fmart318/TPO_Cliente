package Negocio;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import dto.VehiculoDTO;
import rmi.RemoteInterfaceVehiculo;

public class AdministradorVehiculo {

	private RemoteInterfaceVehiculo remoteInterfaceVehiculo;
	private static final AdministradorVehiculo instancia = new AdministradorVehiculo();

	public static AdministradorVehiculo getInstance() {
		return instancia;
	}

	private AdministradorVehiculo() {
		try {
			remoteInterfaceVehiculo = (RemoteInterfaceVehiculo) Naming.lookup("remoteInterfaceVehiculo");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

	public List<VehiculoDTO> listarClientes() {

		try {
			return remoteInterfaceVehiculo.obtenerVehiculos();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void altaCliente(VehiculoDTO vehiculoDTO) {
		try {
			remoteInterfaceVehiculo.altaVehiculo(vehiculoDTO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public List<VehiculoDTO> obtenerVehiculos() {
		try {
			return remoteInterfaceVehiculo.obtenerVehiculos();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

}
