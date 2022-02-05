/** ClienteRMI.java **/
import java.rmi.registry.*;
public class ClienteRMI {
	public static void main(String[] args) {
		
		try {
			// Obt�m uma refer�ncia para o registro do RMI
			Registry registry = LocateRegistry.getRegistry(4765);
			// Obt�m a stub do servidor
			InterfaceContador stub= (InterfaceContador) registry.lookup("ContadorRMI");
			// Chama o m�todo do servidor e imprime a mensagem
			String msg = stub.hello();
			int contador = stub.getValor();
			int novoValor = stub.novoValor();
			System.out.println("Mensagem do servidor: " + msg);
			System.out.println("Valor do contador: " + contador);
			System.out.println("Novo contador: " + novoValor);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}