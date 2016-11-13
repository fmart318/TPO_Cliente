package Negocio;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmi.RemoteInterfaceProveedor;
import dto.ProveedorDTO;

public class AdministradorProveedor {
	private RemoteInterfaceProveedor remoteInterfaceProveedor;
	private static final AdministradorProveedor instancia = new AdministradorProveedor();
	public static AdministradorProveedor getInstance() {
		return instancia;
	}
	private AdministradorProveedor()
	{
		try {
			remoteInterfaceProveedor = (RemoteInterfaceProveedor) Naming.lookup("remoteInterfaceProveedor");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
	public void altaProveedor(ProveedorDTO proveedor) {
		try {
			remoteInterfaceProveedor.altaProveedor(proveedor);
		} catch (RemoteException e) {
			System.out.println("Error al crear el proveedor" + e.getMessage());
			e.printStackTrace();
		}
	}
}
