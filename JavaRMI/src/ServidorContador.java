/** ServidorContador.java **/
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class ServidorContador implements InterfaceContador {
	public ServidorContador() {}
	public static void main(String[] args) {
		try {
			// Instancia o objeto servidor e a sua stub
			ServidorContador server = new ServidorContador();
			InterfaceContador stub = (InterfaceContador)
			UnicastRemoteObject.exportObject(server, 0);
			
			// Registra a stub no RMI Registry para que ela seja obtida
			//pelos clientes
			Registry registry = LocateRegistry.createRegistry(4765);
			registry.bind("ContadorRMI", stub);
			System.out.println("Servidor pronto!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		}
	
		public String hello() throws RemoteException {
			return "Ol?!!!";
		}
		
		int valorInicial;
		public int getValor() throws RemoteException {
			return valorInicial;
		}
		
		public int novoValor() throws RemoteException {
			valorInicial = valorInicial + 1;
			return valorInicial;
		}
		
		
}