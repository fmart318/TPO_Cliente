package Negocio;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import dto.*;
import rmi.*;

public class Administrador {
	private RemoteInterface ir;
	private static final Administrador instancia = new Administrador();
	public static Administrador getInstance() {
		return instancia;
	}
	private Administrador()
	{
		try {
			ir = (RemoteInterface) Naming.lookup("//localhost/tpo");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	public  List<ClienteDTO> listarClientes() {
		
		try {
			return ir.obtenerClientes();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void altaCliente(ClienteDTO clienteDto){
		try{
			ir.altaCliente(clienteDto);
		}catch (RemoteException e){
			e.printStackTrace();
		}
		
	}
	public List<ClienteDTO> obtenerClientes(){
		try{
			return ir.obtenerClientes();
		}catch (RemoteException e){
			e.printStackTrace();
		}
		return null;
	}
	
}
