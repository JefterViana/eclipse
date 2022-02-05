import java.rmi.*;


public interface InterfaceContador extends Remote {
	// Retorna o valor atual do contador
	public int getValor() throws RemoteException;
	// Incrementa o contador e retorna seu novo valor
	public int novoValor() throws RemoteException;
	// Retorna uma msg do servidor
	public String hello() throws RemoteException;
}